package pl.jaworskimateusz.machineservice.data.repository

import android.annotation.SuppressLint
import android.content.Context
import android.os.AsyncTask
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import pl.jaworskimateusz.machineservice.data.dao.TaskDao
import pl.jaworskimateusz.machineservice.data.entity.Task
import pl.jaworskimateusz.machineservice.data.entity.User
import pl.jaworskimateusz.machineservice.data.entity.UserTask
import pl.jaworskimateusz.machineservice.dto.TaskDto
import pl.jaworskimateusz.machineservice.mappers.TaskMapper
import pl.jaworskimateusz.machineservice.services.UserServiceAPI
import pl.jaworskimateusz.machineservice.session.SessionManager
import pl.jaworskimateusz.machineservice.utilities.ApiErrorHandler
import pl.jaworskimateusz.machineservice.utilities.DateUtils
import retrofit2.Response
import java.util.*


class TaskRepository constructor(
        private val sessionManager: SessionManager,
        private val userServiceAPI: UserServiceAPI,
        private val taskDao: TaskDao,
        private val context: Context
) {
    fun getTasksByDatesLiveData(dateFrom: Date, dateTo: Date, solved: Int): LiveData<List<Task>> =
            taskDao.getAllTasksByDatesLiveData(sessionManager.userId, dateFrom, dateTo, solved)

    fun getTaskById(taskId: Long): Task = taskDao.getTaskById(taskId)

    @SuppressLint("StaticFieldLeak")
    inner class DownloadTasks() : AsyncTask<Void, Void, TaskDto>() {
        override fun doInBackground(vararg params: Void?): TaskDto? {
            val maxTaskDate = taskDao.getMaxTaskDate(sessionManager.userId)
            val response: Response<List<TaskDto>>
            response = if (maxTaskDate == null)
                userServiceAPI.downloadTasks(DateUtils.dateToString(null)).execute()
            else
                userServiceAPI.downloadTasks(DateUtils.dateToString(maxTaskDate)).execute()
            if (response.isSuccessful) {
                val tasks = TaskMapper.mapToTaskDtoList(response.body()!!)
                taskDao.insertAllTasks(tasks)
                tasks.forEach { t -> taskDao.insertUserTask(UserTask(sessionManager.userId, t.taskId)) }
            } else {
                val errorResponse = response.errorBody()?.string()?.let { ApiErrorHandler.handleError(it) }
                Handler(Looper.getMainLooper()).post { if (errorResponse != null) makeToast(errorResponse.error) }
                Log.e(TAG, errorResponse?.error)
                if (errorResponse?.status == 401) {
                    sessionManager.logout()
                }
            }
            return null
        }
    }

    @SuppressLint("StaticFieldLeak")
    inner class UpdateTask(val task: Task) : AsyncTask<Void, Void, TaskDto>() {
        override fun doInBackground(vararg params: Void?): TaskDto? {
            val response = userServiceAPI.updateTask(TaskMapper.mapToTaskDto(task)).execute()
            if (response.isSuccessful) {
                taskDao.insert(task)
                Handler(Looper.getMainLooper()).post { makeToast("Task updated") }
                Log.d(TAG,"Task with id ${task.taskId} updated.")
            } else {
                val errorResponse = response.errorBody()?.string()?.let { ApiErrorHandler.handleError(it) }
                Handler(Looper.getMainLooper()).post { if (errorResponse != null) makeToast(errorResponse.error) }
                Log.e(TAG, errorResponse?.error)
            }
            return null
        }
    }

    fun insert(user: User) = taskDao.insert(user)

    private fun makeToast(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    }

    companion object {
        const val TAG = "Task Repository"
    }

}