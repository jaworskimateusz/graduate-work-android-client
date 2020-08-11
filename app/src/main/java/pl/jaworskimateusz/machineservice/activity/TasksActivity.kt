package pl.jaworskimateusz.machineservice.activity

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import pl.jaworskimateusz.machineservice.MachineServiceApplication
import pl.jaworskimateusz.machineservice.R
import pl.jaworskimateusz.machineservice.activity.base.BaseActivity
import pl.jaworskimateusz.machineservice.data.repository.TaskRepository
import pl.jaworskimateusz.machineservice.session.SessionManager
import pl.jaworskimateusz.machineservice.utilities.NetworkManager
import pl.jaworskimateusz.machineservice.viewmodel.TaskViewModel
import pl.jaworskimateusz.machineservice.viewmodel.TaskViewModelFactory
import javax.inject.Inject

class TasksActivity : BaseActivity() {

    lateinit var taskViewModel: TaskViewModel

    @Inject
    lateinit var taskViewModelFactory: TaskViewModelFactory

    @Inject
    lateinit var taskRepository: TaskRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MachineServiceApplication).component.inject(this)
        taskViewModel = ViewModelProviders.of(this, taskViewModelFactory).get(TaskViewModel::class.java)
        setContentView(R.layout.activity_tasks)
        initDrawerLayout()

        if (NetworkManager.isNetworkAvailable(this))
            taskRepository.downloadTasksFromService()
        super.onCreate(savedInstanceState)
    }

}