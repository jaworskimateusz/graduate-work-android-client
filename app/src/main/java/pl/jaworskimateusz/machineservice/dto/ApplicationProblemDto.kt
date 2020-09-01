package pl.jaworskimateusz.machineservice.dto

data class ApplicationProblemDto(
    val userId: Long,
    val description: String,
    val keywords: String,
    val versionCode: String
)