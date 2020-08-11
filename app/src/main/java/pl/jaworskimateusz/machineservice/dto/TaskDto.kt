package pl.jaworskimateusz.machineservice.dto

import java.util.*

data class TaskDto(
    val taskId: Long,
    val title: String,
    val description: String,
    val date: Date,
    val solved: Int
)
