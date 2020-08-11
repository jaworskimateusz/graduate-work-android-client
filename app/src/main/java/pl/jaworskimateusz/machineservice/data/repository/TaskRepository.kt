package pl.jaworskimateusz.machineservice.data.repository

import android.os.AsyncTask
import android.util.Log
import android.widget.Toast
import pl.jaworskimateusz.machineservice.data.dao.TaskDao
import pl.jaworskimateusz.machineservice.data.entity.Task
import pl.jaworskimateusz.machineservice.dto.TaskDto
import pl.jaworskimateusz.machineservice.mappers.TaskMapper
import pl.jaworskimateusz.machineservice.services.UserServiceAPI
import pl.jaworskimateusz.machineservice.session.SessionManager
import pl.jaworskimateusz.machineservice.utilities.ApiErrorHandler
import retrofit2.Response
import java.util.logging.Logger


class TaskRepository constructor(
        private val sessionManager: SessionManager,
        private val userServiceAPI: UserServiceAPI,
        private val taskDao: TaskDao
) {
    fun getTasksLiveData() = taskDao.getAllTasksLiveData()
    fun downloadTasksFromService() {
        downloadTasks().execute()
    }

    inner class downloadTasks() : AsyncTask<Void, Void, TaskDto>() {
        override fun doInBackground(vararg params: Void?): TaskDto? {
            val response = userServiceAPI.downloadTasks().execute()
            if (response.isSuccessful) {
                val tasks = TaskMapper.mapToTaskDtoList(response.body()!!)
                taskDao.insertAllTasks(tasks)
                taskDao.getAllTasks()
            } else {
                val errorResponse = response.errorBody()?.string()?.let { ApiErrorHandler.handleError(it) }
                Log.e(TAG, errorResponse?.error)
            }
            return null
        }
    }

    companion object {
        const val TAG = "TaskRepository"
    }

}