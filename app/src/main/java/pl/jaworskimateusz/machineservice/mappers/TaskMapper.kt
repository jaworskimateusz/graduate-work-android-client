package pl.jaworskimateusz.machineservice.mappers

import pl.jaworskimateusz.machineservice.data.entity.Task
import pl.jaworskimateusz.machineservice.dto.TaskDto


class TaskMapper {
    companion object {
        fun mapToTaskDtoList(tasks: List<TaskDto>): List<Task>{
            return tasks.map { mapToTask(it) }

        }

        fun mapToTask(task: TaskDto): Task {
            return Task(
                    task.taskId,
                    task.title,
                    task.description,
                    task.date,
                    task.solved
            )
        }

        fun mapToTaskDto(task: Task): TaskDto {
            return TaskDto(
                    task.taskId,
                    task.title,
                    task.description,
                    task.date,
                    task.solved
            )
        }
    }
}
