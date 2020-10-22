package pl.jaworskimateusz.machineservice.activity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.lifecycle.ViewModelProviders
import pl.jaworskimateusz.machineservice.MachineServiceApplication
import pl.jaworskimateusz.machineservice.R
import pl.jaworskimateusz.machineservice.activity.base.BaseActivity
import pl.jaworskimateusz.machineservice.data.entity.Service
import pl.jaworskimateusz.machineservice.session.SessionManager
import pl.jaworskimateusz.machineservice.utilities.NetworkManager
import pl.jaworskimateusz.machineservice.viewmodel.MachineViewModel
import pl.jaworskimateusz.machineservice.viewmodel.MachineViewModelFactory
import java.util.*
import javax.inject.Inject


class MachineServiceDetailActivity : BaseActivity() {

    private lateinit var machineViewModel: MachineViewModel

    private lateinit var etComponentName: EditText
    private lateinit var etDescription: EditText
    private lateinit var cbResult: CheckBox
    private lateinit var btnSaveService: Button

    private var machineId: Long = 0

    @Inject
    lateinit var machineViewModelFactory: MachineViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MachineServiceApplication).component.inject(this)
        machineViewModel = ViewModelProviders.of(this, machineViewModelFactory).get(MachineViewModel::class.java)
        this.sessionManager = SessionManager(this.applicationContext)
        setContentView(R.layout.activity_service_detail)
        initDrawerLayout()
        findViews()
        if (intent?.extras?.getLong("machineId") != null)
            machineId = intent?.extras?.getLong("machineId") as Long

        super.onCreate(savedInstanceState)
    }

    private fun findViews() {
        etComponentName = findViewById(R.id.et_component_name)
        etDescription = findViewById(R.id.et_description)
        cbResult = findViewById(R.id.cb_result)
        btnSaveService = findViewById(R.id.btn_save_service)
    }

    fun saveService(view: View) {
        if (NetworkManager.isNetworkAvailable(this)) {
            val service = Service(
                    null,
                    Date(),
                    etComponentName.text.toString(),
                    etDescription.text.toString(),
                    if (cbResult.isChecked) 1 else 0,
                    machineId
            )
            machineViewModel.machineRepository.SaveService(machineId, service).execute()
            finish()
        } else {
            noInternetConnection()
        }

    }

    companion object {
        const val TAG = "Machine Service Detail Activity"
    }

}