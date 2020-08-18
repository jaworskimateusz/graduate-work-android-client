package pl.jaworskimateusz.machineservice.activity

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import pl.jaworskimateusz.machineservice.MachineServiceApplication
import pl.jaworskimateusz.machineservice.R
import pl.jaworskimateusz.machineservice.activity.base.BaseActivity
import pl.jaworskimateusz.machineservice.adapter.TaskRecyclerViewAdapter
import pl.jaworskimateusz.machineservice.data.repository.TaskRepository
import pl.jaworskimateusz.machineservice.session.SessionManager
import pl.jaworskimateusz.machineservice.utilities.DatePicker
import pl.jaworskimateusz.machineservice.utilities.DateUtils
import pl.jaworskimateusz.machineservice.utilities.NetworkManager
import pl.jaworskimateusz.machineservice.viewmodel.TaskViewModel
import pl.jaworskimateusz.machineservice.viewmodel.TaskViewModelFactory
import java.util.*
import javax.inject.Inject


class TasksActivity : BaseActivity() {

    private lateinit var taskAdapter: TaskRecyclerViewAdapter
    private lateinit var tasksList: RecyclerView
    private lateinit var dateFromPicker: DatePicker
    private lateinit var dateToPicker: DatePicker
    private lateinit var etDateFrom: EditText
    private lateinit var etDateTo: EditText
    private lateinit var cbTaskSolved: CheckBox

    private lateinit var taskViewModel: TaskViewModel

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

        taskAdapter = TaskRecyclerViewAdapter(this)
        tasksList = findViewById(R.id.tasks_list)
        cbTaskSolved = findViewById(R.id.cb_task_solved)
        initDatePickers()

        with(tasksList) {
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context)
            adapter = taskAdapter
        }
        observe()
        super.onCreate(savedInstanceState)
    }

    private fun observe() {
        taskViewModel.getTasks().observe(this, Observer { tasks ->
            if (tasks != null)
                taskAdapter.submitList(tasks)
        })
    }

    private fun searchTasks() {
        taskViewModel.getTasksByDates(
                DateUtils.stringToDate(etDateFrom.text.toString()),
                DateUtils.stringToDate(etDateTo.text.toString()),
                if (cbTaskSolved.isChecked) 1 else 0)
    }

    private fun initDatePickers() {
        etDateFrom = findViewById(R.id.et_date_from)
        etDateTo = findViewById(R.id.et_date_to)
        dateFromPicker = DatePicker(
                this,
                Calendar.getInstance().apply
                { add(Calendar.DAY_OF_MONTH, -14) },
                etDateFrom)
        dateToPicker = DatePicker(
                this,
                Calendar.getInstance(),
                etDateTo)

        etDateFrom.setText(DateUtils.dateToString(dateFromPicker.calendar))
        etDateTo.setText(DateUtils.dateToString(dateToPicker.calendar))

        etDateFrom.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(c: CharSequence, start: Int, before: Int, count: Int) {
               searchTasks()
            }
        })

        etDateTo.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(c: CharSequence, start: Int, before: Int, count: Int) {
                searchTasks()
            }
        })
    }

}