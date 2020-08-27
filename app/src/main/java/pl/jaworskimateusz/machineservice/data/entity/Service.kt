package pl.jaworskimateusz.machineservice.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import retrofit2.Converter
import java.util.*

@Entity(tableName = "services")
data class Service(
        @PrimaryKey
        var serviceId: Long?,
        @TypeConverters(Converter::class)
        var date: Date,
        var componentName: String,
        var description: String,
        var result: Int,
        val machineId: Long
)