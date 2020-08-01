package pl.jaworskimateusz.machineservice.dto

data class LoginCredentials(val username: String, val password: String)

data class LoginResponse(val token: String, val user: UserDto)

data class UserDto(
    val userId: Long,
    val username: String,
    val firstName: String,
    val lastName: String,
    val password: String,
    val phoneNumber: Int,
    val role: String,
    val enabled: Int,
    val departmentId: Long
)
