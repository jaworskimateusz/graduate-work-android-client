package pl.jaworskimateusz.machineservice.activity

import android.app.ProgressDialog
import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.listener.OnRenderListener
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle
import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.google.zxing.WriterException
import com.google.zxing.common.BitMatrix
import com.journeyapps.barcodescanner.BarcodeEncoder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import okhttp3.ResponseBody
import pl.jaworskimateusz.machineservice.MachineServiceApplication
import pl.jaworskimateusz.machineservice.R
import pl.jaworskimateusz.machineservice.activity.base.BaseActivity
import pl.jaworskimateusz.machineservice.data.entity.Machine
import pl.jaworskimateusz.machineservice.session.SessionManager
import pl.jaworskimateusz.machineservice.utilities.FileUtils
import pl.jaworskimateusz.machineservice.utilities.NetworkManager
import pl.jaworskimateusz.machineservice.viewmodel.MachineViewModel
import pl.jaworskimateusz.machineservice.viewmodel.MachineViewModelFactory
import java.io.File
import javax.inject.Inject


class MachineDetailActivity : BaseActivity() {

    private lateinit var machineViewModel: MachineViewModel
    private var machine: Machine? = null

    private lateinit var twName: TextView
    private lateinit var twCode: TextView
    private lateinit var twDescription: TextView
    private lateinit var iwImage: ImageView
    private lateinit var ibDownloadInstruction: ImageView
    private lateinit var btnIssues: Button
    private lateinit var btnService: Button
    private var progressDialog: ProgressDialog? = null
    private lateinit var pdfView: PDFView

    private var machineId: Long = 0
    private lateinit var code: String

    @Inject
    lateinit var machineViewModelFactory: MachineViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MachineServiceApplication).component.inject(this)
        machineViewModel = ViewModelProviders.of(this, machineViewModelFactory).get(MachineViewModel::class.java)
        this.sessionManager = SessionManager(this.applicationContext)
        setContentView(R.layout.activity_machine_detail)
        initDrawerLayout()
        findViews()
        if (intent?.extras?.get("machineId") != null) {
            machineId = intent?.extras?.get("machineId") as Long
            machine = machineViewModel.machineRepository.getMachineById(machineId)
            setContent()
        } else {
            if (NetworkManager.isNetworkAvailable(this)) {
                code = intent?.extras?.get("code") as String
                machineViewModel.machineRepository.getMachineByCode(code).observe(this, Observer {
                    m -> this.machine = m
                    setContent()
                })
            } else {
                noInternetConnection()
                finish()
            }
        }
        super.onCreate(savedInstanceState)
    }

    private fun findViews() {
        twName = findViewById(R.id.tw_name)
        twCode = findViewById(R.id.tw_code)
        twDescription = findViewById(R.id.tw_machine_description)
        iwImage = findViewById(R.id.iw_image)
        ibDownloadInstruction = findViewById(R.id.btn_download_instruction)
        btnIssues = findViewById(R.id.btn_view_issues)
        btnService = findViewById(R.id.btn_make_service)
        val inflater = layoutInflater.inflate(R.layout.service_instruction_view, null)
        pdfView = inflater.findViewById(R.id.pdfView)
    }

    private fun setContent() {
        if (machine != null) {
            twName.text = machine!!.name
            twCode.text = machine!!.code
            twDescription.text = machine!!.description
            textToQrCode(machine!!.code)
        } else {
            makeToast(getString(R.string.not_found))
            finish()
        }
    }

    private fun textToQrCode(text: String) {
        try {
            val multiFormatWriter = MultiFormatWriter()
            val bitMatrix: BitMatrix = multiFormatWriter.encode(text, BarcodeFormat.QR_CODE, 150, 150)
            val barcodeEncoder = BarcodeEncoder()
            val bitmap = barcodeEncoder.createBitmap(bitMatrix)
            iwImage.setImageBitmap(bitmap)
        } catch (e: WriterException) {
            Log.e(TAG, e.message)
        }
    }

    fun downloadInstruction(view: View) {
        //https://futurestud.io/tutorials/retrofit-2-how-to-download-files-from-server
        if (!machine?.serviceInstruction.isNullOrEmpty()) {
            if (progressDialog == null || !progressDialog!!.isShowing)
                showDialog()
            val call = machineViewModel.machineRepository.machineServiceAPI.downloadFile(machine!!.serviceInstruction)
            call.enqueue(object : Callback<ResponseBody> {
                override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                    Log.d(TAG, "Server contact success")
                    if (response.isSuccessful) {
                        object : AsyncTask<Void, Void, Void>() {
                            override fun doInBackground(vararg voids: Void): Void? {
                                val file = FileUtils.writeResponseBodyToMemory(
                                        applicationContext,
                                        response.body()!!,
                                        machine!!.serviceInstruction.substringAfterLast("/", "instruction.pdf"))
                                showPDF(file)
                                progressDialog!!.dismiss()
                                return null
                            }
                        }.execute()
                    } else {
                        Log.d(TAG, "Server contact failed")
                        progressDialog!!.dismiss()
                    }
                }
                override fun onFailure(call: Call<ResponseBody>, t: Throwable?) {
                    Log.e(TAG, t?.message)
                    t?.message?.let { makeToast(it) }
                    progressDialog!!.dismiss()
                }
            })
        }

    }
    fun viewMachineIssues(view: View) {
        if (machine != null) {
            val intent = Intent(this, IssuesActivity::class.java)
            intent.putExtra("readonly", false)
            intent.putExtra("machineId", machine!!.machineId)
            startActivity(intent)
        }
    }

    private fun showPDF(file: File?) {
        if (file == null) {
            makeToast(getString(R.string.not_found))
        } else {
            val intent = Intent(this, PdfViewActivity::class.java)
            intent.putExtra("filePath", file.absolutePath)
            startActivity(intent)
        }
    }

    fun makeMachineService(view: View) {
        if (machine != null) {
            val intent = Intent(this, MachineServiceDetailActivity::class.java)
            intent.putExtra("machineId", machine!!.machineId)
            startActivity(intent)
        }
    }

    private fun showDialog() {
        progressDialog = ProgressDialog(this, R.style.ThemeOverlay_MaterialComponents_Dialog)
        progressDialog!!.isIndeterminate = true
        progressDialog!!.setMessage(getString(R.string.loading))
        progressDialog!!.setCanceledOnTouchOutside(false)
        progressDialog!!.show()
    }

    companion object {
        const val TAG = "Machine Detail Activity"
    }
}