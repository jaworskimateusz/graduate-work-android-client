package pl.jaworskimateusz.machineservice.data.repository

import android.annotation.SuppressLint
import android.os.AsyncTask
import android.provider.Settings.Global.getString
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import pl.jaworskimateusz.machineservice.R
import pl.jaworskimateusz.machineservice.data.dao.TaskDao
import pl.jaworskimateusz.machineservice.data.entity.Task
import pl.jaworskimateusz.machineservice.dto.TaskDto
import pl.jaworskimateusz.machineservice.mappers.TaskMapper
import pl.jaworskimateusz.machineservice.services.UserServiceAPI
import pl.jaworskimateusz.machineservice.session.SessionManager
import pl.jaworskimateusz.machineservice.utilities.ApiErrorHandler
import pl.jaworskimateusz.machineservice.utilities.DateUtils
import retrofit2.Call
import retrofit2.Response
import java.lang.Exception
import java.util.*
import java.util.logging.Logger


class TaskRepository constructor(
        private val sessionManager: SessionManager,
        private val userServiceAPI: UserServiceAPI,
        private val taskDao: TaskDao
) {
    fun getTasksByDatesLiveData(dateFrom: Date, dateTo: Date, solved: Int): LiveData<List<Task>> {
        return taskDao.getAllTasksByDatesLiveData(dateFrom, dateTo, solved)
    }

    fun downloadTasksFromService() {
        DownloadTasks().execute()
    }

    @SuppressLint("StaticFieldLeak")
    inner class DownloadTasks() : AsyncTask<Void, Void, TaskDto>() {
        override fun doInBackground(vararg params: Void?): TaskDto? {
            val maxTaskDate = taskDao.getMaxTaskDate()
            val response: Response<List<TaskDto>>
            response = if (maxTaskDate == null)
                userServiceAPI.downloadTasks(DateUtils.dateToString(Date())).execute()
            else
                userServiceAPI.downloadTasks(DateUtils.dateToString(maxTaskDate)).execute()
            if (response.isSuccessful) {
                val tasks = TaskMapper.mapToTaskDtoList(response.body()!!)
                taskDao.insertAllTasks(tasks)
                taskDao.getAllTasks()
            } else {
                val errorResponse = response.errorBody()?.string()?.let { ApiErrorHandler.handleError(it) }
                Log.e(TAG, errorResponse?.error)
                if (errorResponse?.status == 401) {
                    sessionManager.logout()
                }
            }
            return null
        }
    }

    companion object {
        const val TAG = "TaskRepository"
    }

}