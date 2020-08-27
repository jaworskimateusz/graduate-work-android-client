package pl.jaworskimateusz.machineservice.dto

import java.util.*

data class ServiceDto(
    val serviceId: Long?,
    val date: Date,
    val componentName: String,
    val description: String,
    val result: Int,
    val machineId: Long
)
