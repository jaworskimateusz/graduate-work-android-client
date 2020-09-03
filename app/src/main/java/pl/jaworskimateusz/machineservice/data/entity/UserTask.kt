package pl.jaworskimateusz.machineservice.data.entity

import androidx.room.Entity

@Entity(tableName = "users_tasks", primaryKeys = ["userId", "taskId"])
data class UserTask (
    val userId: Long,
    val taskId: Long
)