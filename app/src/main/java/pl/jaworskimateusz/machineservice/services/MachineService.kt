package pl.jaworskimateusz.machineservice.services

import pl.jaworskimateusz.machineservice.dto.MachineDto
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

}

class MachineServiceAPI(retrofit: Retrofit, private var sessionManager: SessionManager) {

    private var machineService: MachineService  = retrofit.create(MachineService::class.java)


    fun downloadMachines(): Call<List<MachineDto>>{
        return machineService.downloadMachines(sessionManager.token, sessionManager.userId)
    }

}