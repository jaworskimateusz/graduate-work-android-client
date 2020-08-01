package pl.jaworskimateusz.machineservice.utilities

import com.google.gson.GsonBuilder
import java.sql.Timestamp

class ApiErrorHandler {

    companion object{
        fun handleError(errorBody: String): CustomErrorResponse {
            return GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create().fromJson(errorBody, CustomErrorResponse::class.java)
        }
    }
}

class CustomErrorResponse(var timestamp: Timestamp, var error: String, var status: Int)