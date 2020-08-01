package pl.jaworskimateusz.machineservice.services

import pl.jaworskimateusz.machineservice.dto.ApplicationProblemDto
import pl.jaworskimateusz.machineservice.session.SessionManager
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface UserService {

    @Headers("Content-Type: application/vnd.api+json")
    @POST("/application-problems")
    fun reportApplicationProblem(@Header("Authorization") auth: String, @Body body: ApplicationProblemDto): Call<ApplicationProblemDto>

}

class UserServiceAPI(retrofit: Retrofit, private var sessionManager: SessionManager) {

    private var userService: UserService  = retrofit.create(UserService::class.java)

    fun reportApplicationProblem(keywords: String, description: String): Call<ApplicationProblemDto> {
        return userService.reportApplicationProblem(sessionManager.token, ApplicationProblemDto(sessionManager.userId, description, keywords))
    }

}