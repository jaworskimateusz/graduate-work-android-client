package pl.jaworskimateusz.machineservice.data.repository

import android.annotation.SuppressLint
import android.content.Context
import android.os.AsyncTask
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
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
import retrofit2.Call
import retrofit2.Callback
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

    fun getMachineByCode(code: String): LiveData<Machine> {
        val machine = machineDao.getByCode(code)
        val liveData = MutableLiveData<Machine>()
        if (machine == null) {
            machineServiceAPI.getMachineByCode(code).enqueue( object: Callback<MachineDto>{
                override fun onResponse(call: Call<MachineDto>, response: Response<MachineDto>) {
                    if (response.isSuccessful) {
                        val item = response.body()?.let { MachineMapper.mapToMachine(it) }
                        item?.let { machineDao.insert(it) }
                        liveData.value = item
                    }
                }
                override fun onFailure(call: Call<MachineDto>, t: Throwable) {
                   Log.e(TAG, t.message)
                }
            })
            return liveData
        }
        liveData.value = machine
        return liveData
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