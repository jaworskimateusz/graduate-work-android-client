package pl.jaworskimateusz.machineservice.activity

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.google.zxing.WriterException
import com.google.zxing.common.BitMatrix
import com.journeyapps.barcodescanner.BarcodeEncoder
import pl.jaworskimateusz.machineservice.MachineServiceApplication
import pl.jaworskimateusz.machineservice.R
import pl.jaworskimateusz.machineservice.activity.base.BaseActivity
import pl.jaworskimateusz.machineservice.data.entity.Machine
import pl.jaworskimateusz.machineservice.session.SessionManager
import pl.jaworskimateusz.machineservice.viewmodel.MachineViewModel
import pl.jaworskimateusz.machineservice.viewmodel.MachineViewModelFactory
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
            code = intent?.extras?.get("code") as String
            machineViewModel.machineRepository.getMachineByCode(code).observe(this, Observer {
                        m -> this.machine = m
                        setContent()
            })
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

    fun downloadInstruction(view: View) {}
    fun viewMachineIssues(view: View) {}
    fun makeMachineService(view: View) {}

    companion object {
        const val TAG = "Machine Detail Activity"
    }
}