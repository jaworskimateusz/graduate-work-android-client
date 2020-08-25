package pl.jaworskimateusz.machineservice.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "machines")
data class Machine(
        @PrimaryKey
        val machineId: Long,
        val name: String,
        val code: String,
        val description: String,
        val image: String?,
        val serviceInstruction: String
)