package pl.jaworskimateusz.machineservice.dto

data class IssueDto(
    val issueId: Long?,
    val keywords: String,
    val description: String,
    val solution: String?,
    val workerSignature: String?,
    val machineId: Long
)
