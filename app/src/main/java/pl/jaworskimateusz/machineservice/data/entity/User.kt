package pl.jaworskimateusz.machineservice.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey
    val userId: Long,
    val username: String,
    val firstName: String,
    val lastName: String,
    val password: String,
    val phoneNumber: Int,
    val role: String,
    val enabled: Int,
    val department: String
)
