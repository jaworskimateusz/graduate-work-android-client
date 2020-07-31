package pl.jaworskimateusz.machineservice.services

import pl.jaworskimateusz.machineservice.dto.ApplicationProblem
import pl.jaworskimateusz.machineservice.dto.LoginCredentials
import pl.jaworskimateusz.machineservice.dto.LoginResponse
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
    fun reportApplicationProblem(@Header("Authorization") auth: String, @Body body: ApplicationProblem): Call<ApplicationProblem>

}

class UserServiceAPI(retrofit: Retrofit, private var sessionManager: SessionManager) {

    private var userService: UserService  = retrofit.create(UserService::class.java)

    fun reportApplicationProblem(keywords: String, description: String): Call<ApplicationProblem> {
        return userService.reportApplicationProblem(sessionManager.token, ApplicationProblem(sessionManager.userId, description, keywords))
    }

}