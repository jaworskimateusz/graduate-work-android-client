package pl.jaworskimateusz.machineservice.dto

data class MachineDto(
    val machineId: Long,
    val name: String,
    val code: String,
    val description: String,
    val image: ByteArray?,
    val service_instruction: ByteArray?
)
