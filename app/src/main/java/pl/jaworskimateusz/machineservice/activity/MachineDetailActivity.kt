package pl.jaworskimateusz.machineservice.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.format.DateUtils
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import androidx.transition.Visibility
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.item_task.view.*
import pl.jaworskimateusz.machineservice.MachineServiceApplication
import pl.jaworskimateusz.machineservice.R
import pl.jaworskimateusz.machineservice.activity.base.BaseActivity
import pl.jaworskimateusz.machineservice.data.entity.Machine
import pl.jaworskimateusz.machineservice.data.entity.Task
import pl.jaworskimateusz.machineservice.session.SessionManager
import pl.jaworskimateusz.machineservice.viewmodel.MachineViewModel
import pl.jaworskimateusz.machineservice.viewmodel.MachineViewModelFactory
import pl.jaworskimateusz.machineservice.viewmodel.TaskViewModel
import pl.jaworskimateusz.machineservice.viewmodel.TaskViewModelFactory
import javax.inject.Inject


class MachineDetailActivity : BaseActivity() {

    private lateinit var machineViewModel: MachineViewModel
    private lateinit var machine: Machine

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
        if (intent?.extras?.get("machineId") != null) {
            machineId = intent?.extras?.get("machineId") as Long
            machineViewModel.machineRepository.getMachineById(machineId)
        } else {
            code = intent?.extras?.get("code") as String
            machineViewModel.machineRepository.getMachineByCode(code)
        }
        setContent()
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
        //TODO
    }

    fun downloadInstruction(view: View) {}
    fun viewMachineIssues(view: View) {}
    fun makeMachineService(view: View) {}

}