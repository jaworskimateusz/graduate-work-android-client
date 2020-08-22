package pl.jaworskimateusz.machineservice.data.repository

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.LiveData
import pl.jaworskimateusz.machineservice.data.dao.MachineDao
import pl.jaworskimateusz.machineservice.data.entity.Machine
import pl.jaworskimateusz.machineservice.services.MachineServiceAPI
import pl.jaworskimateusz.machineservice.services.UserServiceAPI
import pl.jaworskimateusz.machineservice.session.SessionManager

class MachineRepository constructor(
        private val sessionManager: SessionManager,
        private val machineServiceAPI: MachineServiceAPI,
        private val machineDao: MachineDao,
        private val context: Context
) {
    fun getMachinesLiveData(): LiveData<List<Machine>> {
        return machineDao.getAllMachinesLiveData()
    }

    fun getMachinesByNameLiveData(name: String): LiveData<List<Machine>> {
        return machineDao.getMachinesByNameLiveData(name)
    }

    fun getMachineById(machineId: Long): Machine {
        return machineDao.getById(machineId)
    }

    private fun makeToast(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    }

    companion object {
        const val TAG = "Machine Repository"
    }

}