package pl.jaworskimateusz.machineservice.services

import okhttp3.ResponseBody
import pl.jaworskimateusz.machineservice.dto.IssueDto
import pl.jaworskimateusz.machineservice.dto.MachineDto
import pl.jaworskimateusz.machineservice.dto.ServiceDto
import pl.jaworskimateusz.machineservice.dto.TaskDto
import pl.jaworskimateusz.machineservice.session.SessionManager
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.*


interface MachineService {

    @Headers("Content-Type: application/vnd.api+json")
    @GET("/users/{userId}/machines")
    fun downloadMachines(@Header("Authorization") auth: String,
                      @Path("userId") userId: Long
    ): Call<List<MachineDto>>

    @Headers("Content-Type: application/vnd.api+json")
    @GET("/machines")
    fun getMachineByCode(@Header("Authorization") auth: String,
                         @Query("code") code: String
    ): Call<MachineDto>

    @Streaming
    @GET
    fun downloadFile(@Url fileUrl: String): Call<ResponseBody>

    @Headers("Content-Type: application/vnd.api+json")
    @GET("/machines/{machineId}/issues")
    fun getMachineIssues(@Header("Authorization") auth: String,
                         @Path("machineId") machineId: Long,
                         @Query("page") page: Long
    ): Call<List<IssueDto>>

    @Headers("Content-Type: application/vnd.api+json")
    @GET("/issues")
    fun getIssues(@Header("Authorization") auth: String,
                         @Query("page") page: Long
    ): Call<List<IssueDto>>

    @Headers("Content-Type: application/vnd.api+json")
    @Streaming
    @POST("/machines/{machineId}/issues")
    fun saveOrUpdateIssue(@Header("Authorization") auth: String,
                   @Path("machineId") machineId: Long,
                   @Body issue: IssueDto
    ): Call<IssueDto>

    @Headers("Content-Type: application/vnd.api+json")
    @Streaming
    @PUT("/machines/{machineId}/services")
    fun saveService(@Header("Authorization") auth: String,
                          @Path("machineId") machineId: Long,
                          @Body service: ServiceDto
    ): Call<ServiceDto>

}

class MachineServiceAPI(retrofit: Retrofit, private var sessionManager: SessionManager) {

    private var machineService: MachineService  = retrofit.create(MachineService::class.java)


    fun downloadMachines(): Call<List<MachineDto>>{
        return machineService.downloadMachines(sessionManager.token, sessionManager.userId)
    }

    fun getMachineByCode(code: String): Call<MachineDto>{
        return machineService.getMachineByCode(sessionManager.token, code)
    }

    fun downloadFile(fileUrl: String): Call<ResponseBody> {
        return machineService.downloadFile(fileUrl)
    }

    fun getMachineIssues(machineId: Long, page: Long): Call<List<IssueDto>> {
        return machineService.getMachineIssues(sessionManager.token, machineId, page)
    }

    fun getIssues(page: Long): Call<List<IssueDto>> {
        return machineService.getIssues(sessionManager.token, page)
    }

    fun saveOrUpdateIssue(machineId: Long, issueDto: IssueDto): Call<IssueDto> {
        return machineService.saveOrUpdateIssue(sessionManager.token, machineId, issueDto)
    }

    fun saveService(machineId: Long, serviceDto: ServiceDto): Call<ServiceDto> {
        return machineService.saveService(sessionManager.token, machineId, serviceDto)
    }

}