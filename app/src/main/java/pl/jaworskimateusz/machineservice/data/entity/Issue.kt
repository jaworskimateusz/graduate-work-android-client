package pl.jaworskimateusz.machineservice.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "issues")
data class Issue(
        @PrimaryKey
        var issueId: Long?,
        var keywords: String,
        var description: String,
        var solution: String?,
        var workerSignature: String?,
        val machineId: Long
)