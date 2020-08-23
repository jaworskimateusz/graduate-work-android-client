package pl.jaworskimateusz.machineservice.data.repository

import android.annotation.SuppressLint
import android.content.Context
import android.os.AsyncTask
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import pl.jaworskimateusz.machineservice.data.dao.MachineDao
import pl.jaworskimateusz.machineservice.data.entity.Machine
import pl.jaworskimateusz.machineservice.dto.MachineDto
import pl.jaworskimateusz.machineservice.dto.TaskDto
import pl.jaworskimateusz.machineservice.mappers.MachineMapper
import pl.jaworskimateusz.machineservice.mappers.TaskMapper
import pl.jaworskimateusz.machineservice.services.MachineServiceAPI
import pl.jaworskimateusz.machineservice.services.UserServiceAPI
import pl.jaworskimateusz.machineservice.session.SessionManager
import pl.jaworskimateusz.machineservice.utilities.ApiErrorHandler
import pl.jaworskimateusz.machineservice.utilities.DateUtils
import retrofit2.Response

class MachineRepository constructor(
        private val sessionManager: SessionManager,
        private val machineServiceAPI: MachineServiceAPI,
        private val machineDao: MachineDao,
        private val context: Context
) {
    fun getMachinesByNameLiveData(name: String): LiveData<List<Machine>> {
        return machineDao.getMachinesByNameLiveData(name)
    }

    fun getMachineById(machineId: Long): Machine {
        return machineDao.getById(machineId)
    }

    fun getMachineByCode(code: String): Machine {
        val machine = machineDao.getByCode(code)
        if (machine == null) {
            //TODO load from API
        }
        return machine
    }

    @SuppressLint("StaticFieldLeak")
    inner class DownloadMachines() : AsyncTask<Void, Void, MachineDto>() {
        override fun doInBackground(vararg params: Void?): MachineDto? {
            val response = machineServiceAPI.downloadMachines().execute()
            if (response.isSuccessful) {
                val machines = MachineMapper.mapToMachineDtoList(response.body()!!)
                machineDao.insertAll(machines)
            } else {
                val errorResponse = response.errorBody()?.string()?.let { ApiErrorHandler.handleError(it) }
                Log.e(TaskRepository.TAG, errorResponse?.error)
                errorResponse?.error?.let { makeToast(it) }
                if (errorResponse?.status == 401) {
                    sessionManager.logout()
                }
            }
            return null
        }
    }

    private fun makeToast(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    }

    companion object {
        const val TAG = "Machine Repository"
    }

}