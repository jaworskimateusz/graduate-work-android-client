package pl.jaworskimateusz.machineservice.data.entity

import androidx.room.Entity

@Entity(tableName = "users_machines", primaryKeys = ["userId", "machineId"])
data class UserMachine (
    val userId: Long,
    val machineId: Long
)