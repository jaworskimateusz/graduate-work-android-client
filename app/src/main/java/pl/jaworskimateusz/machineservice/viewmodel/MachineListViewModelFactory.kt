package pl.jaworskimateusz.machineservice.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import pl.jaworskimateusz.machineservice.data.repository.MachineRepository

class MachineViewModelFactory (
        private val machineRepository: MachineRepository
): ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>) = MachineViewModel(machineRepository) as T
}