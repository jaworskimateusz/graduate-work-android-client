package pl.jaworskimateusz.machineservice.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import pl.jaworskimateusz.machineservice.data.repository.TaskRepository

class TaskViewModelFactory (
        private val taskRepository: TaskRepository
): ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>) = TaskViewModel(taskRepository) as T
}