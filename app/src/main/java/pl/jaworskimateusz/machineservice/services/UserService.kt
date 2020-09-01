package pl.jaworskimateusz.machineservice.services

import pl.jaworskimateusz.machineservice.dto.ApplicationProblemDto
import pl.jaworskimateusz.machineservice.dto.TaskDto
import pl.jaworskimateusz.machineservice.dto.UserDto
import pl.jaworskimateusz.machineservice.session.SessionManager
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.*
import java.util.*

interface UserService {

    @Headers("Content-Type: application/vnd.api+json")
    @POST("/application-problems")
    fun reportApplicationProblem(@Header("Authorization") auth: String, @Body body: ApplicationProblemDto): Call<ApplicationProblemDto>

    @Headers("Content-Type: application/vnd.api+json")
    @GET("/users/{userId}/tasks")
    fun downloadTasks(@Header("Authorization") auth: String,
                      @Path("userId") userId: Long,
                      @Query("date") date: String
    ): Call<List<TaskDto>>

    @Headers("Content-Type: application/vnd.api+json")
    @POST("/users/{userId}/tasks")
    fun updateTask(@Header("Authorization") auth: String,
                      @Path("userId") userId: Long,
                      @Body task: TaskDto
    ): Call<TaskDto>

}

class UserServiceAPI(retrofit: Retrofit, private var sessionManager: SessionManager) {

    private var userService: UserService  = retrofit.create(UserService::class.java)

    fun reportApplicationProblem(keywords: String, description: String, versionCode: String): Call<ApplicationProblemDto> {
        return userService.reportApplicationProblem(
                sessionManager.token,
                ApplicationProblemDto(sessionManager.userId, description, keywords, versionCode)
        )
    }

    fun downloadTasks(maxTaskDate: String): Call<List<TaskDto>>{
        return userService.downloadTasks(sessionManager.token, sessionManager.userId, maxTaskDate)
    }

    fun updateTask(taskDto: TaskDto): Call<TaskDto>{
        return userService.updateTask(sessionManager.token, sessionManager.userId, taskDto)
    }

}