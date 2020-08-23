package pl.jaworskimateusz.machineservice.dto

data class MachineDto(
    val machineId: Long,
    val name: String,
    val code: String,
    val description: String,
    val image: String?,
    val serviceInstruction: String?
)
