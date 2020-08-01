package pl.jaworskimateusz.machineservice.services

import pl.jaworskimateusz.machineservice.dto.LoginCredentials
import pl.jaworskimateusz.machineservice.dto.LoginResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST


interface AuthenticationService {
    @Headers("Content-Type: application/vnd.api+json")
    @POST("/login")
    fun createToken(@Header("Authorization") auth: String, @Body body: LoginCredentials): Call<LoginResponse>

}

class AuthenticationServiceAPI(retrofit: Retrofit) {

    private var authenticationService: AuthenticationService = retrofit.create(AuthenticationService::class.java)

    fun createToken(username: String, password: String): Call<LoginResponse> {
        return authenticationService.createToken("login", LoginCredentials(username, password))
    }

}
