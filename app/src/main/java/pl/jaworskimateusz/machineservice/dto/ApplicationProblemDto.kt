package pl.jaworskimateusz.machineservice.dto

data class ApplicationProblem(
    val userId: Long,
    val description: String,
    val keywords: String
)