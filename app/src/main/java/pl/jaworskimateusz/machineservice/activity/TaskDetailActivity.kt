package pl.jaworskimateusz.machineservice.activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.format.DateUtils
import android.view.View
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
import pl.jaworskimateusz.machineservice.data.entity.Task
import pl.jaworskimateusz.machineservice.session.SessionManager
import pl.jaworskimateusz.machineservice.viewmodel.TaskViewModel
import pl.jaworskimateusz.machineservice.viewmodel.TaskViewModelFactory
import javax.inject.Inject


class TaskDetailActivity : BaseActivity() {

    private lateinit var taskViewModel: TaskViewModel
    private lateinit var task: Task

    private lateinit var twTitle: TextView
    private lateinit var twDate: TextView
    private lateinit var twSolved: TextView
    private lateinit var twDescription: TextView
    private lateinit var btnMarkAsSolved: FloatingActionButton

    @Inject
    lateinit var taskViewModelFactory: TaskViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MachineServiceApplication).component.inject(this)
        taskViewModel = ViewModelProviders.of(this, taskViewModelFactory).get(TaskViewModel::class.java)
        this.sessionManager = SessionManager(this.applicationContext)
        setContentView(R.layout.activity_task_detail)
        initDrawerLayout()
        val taskId = intent?.extras?.get("taskId") as Long
        task = taskViewModel.taskRepository.getTaskById(taskId)

        twTitle = findViewById(R.id.tw_title)
        twDate = findViewById(R.id.tw_date)
        twSolved = findViewById(R.id.tw_solved_status)
        twDescription = findViewById(R.id.tw_task_description)
        btnMarkAsSolved = findViewById(R.id.fab_save)
        setContent()
        super.onCreate(savedInstanceState)
    }

    private fun setContent() {
        twTitle.text = task.title
        twDate.text = pl.jaworskimateusz.machineservice.utilities.DateUtils.dateToString(task.date)
        twDescription.text = task.description
        if (task.solved == 1) {
            twSolved.text = getString(R.string.solved_status)
        }

    }

    fun markAsSolved(view: View) {
        if (task.solved == 1)
            makeToast(getString(R.string.task_solved))
        else {
            task.solved = 1
            taskViewModel.taskRepository.UpdateTask(task).execute()
            finish()
        }
    }

}