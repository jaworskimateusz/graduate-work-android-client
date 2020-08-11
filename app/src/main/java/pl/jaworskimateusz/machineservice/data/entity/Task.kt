package pl.jaworskimateusz.machineservice.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import retrofit2.Converter
import java.util.*

@Entity(tableName = "tasks")
data class Task(
        @PrimaryKey
        @ColumnInfo(name = "task_id")
        val taskId: Long,
        val title: String,
        val description: String,
        @TypeConverters(Converter::class)
        val date: Date,
        val solved: Int
)