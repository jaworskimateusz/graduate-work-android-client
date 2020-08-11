package pl.jaworskimateusz.machineservice.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import pl.jaworskimateusz.machineservice.data.entity.Task
import pl.jaworskimateusz.machineservice.data.repository.TaskRepository

class TaskViewModel internal constructor(
        taskRepository: TaskRepository
) : ViewModel() {

    val tasks: LiveData<List<Task>> = taskRepository.getTasksLiveData()

}