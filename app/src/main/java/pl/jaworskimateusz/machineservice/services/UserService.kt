package pl.jaworskimateusz.machineservice.services

import pl.jaworskimateusz.machineservice.dto.ApplicationProblemDto
import pl.jaworskimateusz.machineservice.dto.TaskDto
import pl.jaworskimateusz.machineservice.session.SessionManager
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.*

interface UserService {

    @Headers("Content-Type: application/vnd.api+json")
    @POST("/application-problems")
    fun reportApplicationProblem(@Header("Authorization") auth: String, @Body body: ApplicationProblemDto): Call<ApplicationProblemDto>

    @Headers("Content-Type: application/vnd.api+json")
    @GET("/users/{userId}/tasks")
    fun downloadTasks(@Header("Authorization") auth: String,
                      @Path("userId") userId: Long
    ): Call<List<TaskDto>>

}

class UserServiceAPI(retrofit: Retrofit, private var sessionManager: SessionManager) {

    private var userService: UserService  = retrofit.create(UserService::class.java)

    fun reportApplicationProblem(keywords: String, description: String): Call<ApplicationProblemDto> {
        return userService.reportApplicationProblem(
                sessionManager.token,
                ApplicationProblemDto(sessionManager.userId, description, keywords)
        )
    }

    fun downloadTasks(): Call<List<TaskDto>>{
        return userService.downloadTasks(sessionManager.token, sessionManager.userId)
    }

}