package pl.jaworskimateusz.machineservice.activity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProviders
import com.github.gcacace.signaturepad.views.SignaturePad
import pl.jaworskimateusz.machineservice.MachineServiceApplication
import pl.jaworskimateusz.machineservice.R
import pl.jaworskimateusz.machineservice.activity.base.BaseActivity
import pl.jaworskimateusz.machineservice.data.entity.Issue
import pl.jaworskimateusz.machineservice.session.SessionManager
import pl.jaworskimateusz.machineservice.utilities.FileUtils
import pl.jaworskimateusz.machineservice.viewmodel.MachineViewModel
import pl.jaworskimateusz.machineservice.viewmodel.MachineViewModelFactory
import javax.inject.Inject


class IssueDetailActivity : BaseActivity() {

    private lateinit var machineViewModel: MachineViewModel
    private var issue: Issue? = null

    private lateinit var etKeywords: EditText
    private lateinit var etDescription: EditText
    private lateinit var etSolution: EditText
    private lateinit var btnSaveIssue: Button
    private lateinit var signaturePad: SignaturePad
    private var readonly: Boolean = false

    private var issueId: Long = 0
    private var machineId: Long = 0

    @Inject
    lateinit var machineViewModelFactory: MachineViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MachineServiceApplication).component.inject(this)
        machineViewModel = ViewModelProviders.of(this, machineViewModelFactory).get(MachineViewModel::class.java)
        this.sessionManager = SessionManager(this.applicationContext)
        setContentView(R.layout.activity_issue_detail)
        initDrawerLayout()
        readonly = intent?.extras?.getBoolean("readonly", true)!!
        findViews()

        if (intent?.extras?.getLong("machineId") != null)
            machineId = intent?.extras?.getLong("machineId") as Long

        if (intent?.extras?.get("issueId") != null) {
            issueId = intent?.extras?.getLong("issueId") as Long
            issue = machineViewModel.machineRepository.getIssueById(issueId)
            setContent()
        }
        super.onCreate(savedInstanceState)
    }

    private fun findViews() {
        etKeywords = findViewById(R.id.et_keywords)
        etDescription = findViewById(R.id.et_description)
        etSolution = findViewById(R.id.et_solution)
        btnSaveIssue = findViewById(R.id.btn_save_issue)
        signaturePad = findViewById(R.id.signature_pad)
        if (readonly) {
            btnSaveIssue.visibility = View.GONE
            etKeywords.isEnabled = false
            etDescription.isEnabled = false
            etSolution.isEnabled = false
        }

    }

    private fun setContent() {
        if (issue != null) {
            etKeywords.setText(issue!!.keywords)
            etDescription.setText(issue!!.description)
            etSolution.setText(issue!!.solution)
            val signature = issue!!.workerSignature?.let { FileUtils.stringToBitmap(it) }
            if (signature != null)
                signaturePad.signatureBitmap = signature
        } else {
            onError("")
            finish()
        }
    }

    fun saveIssue(view: View) {
        issue = Issue(
                null,
                etKeywords.text.toString(),
                etDescription.text.toString(),
                etSolution.text.toString(),
                FileUtils.bitmapToString(signaturePad.signatureBitmap),
                machineId
        )
        if (issueId != 0L)
            issue!!.issueId = issueId
        machineViewModel.machineRepository.SaveOrUpdateIssue(machineId, issue!!).execute()
        finish()
    }

    fun clearSignaturePad(view: View) {
        signaturePad.clear()
    }

    companion object {
        const val TAG = "Issue Detail Activity"
    }

}