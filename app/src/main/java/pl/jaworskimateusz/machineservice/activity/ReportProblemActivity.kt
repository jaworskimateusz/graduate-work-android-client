package pl.jaworskimateusz.machineservice.activity

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import pl.jaworskimateusz.machineservice.MachineServiceApplication
import pl.jaworskimateusz.machineservice.R
import pl.jaworskimateusz.machineservice.activity.base.BaseActivity
import pl.jaworskimateusz.machineservice.dto.ApplicationProblem
import pl.jaworskimateusz.machineservice.services.UserServiceAPI
import pl.jaworskimateusz.machineservice.session.SessionManager
import pl.jaworskimateusz.machineservice.utilities.NetworkManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class ReportProblemActivity : BaseActivity() {

    var etProblemDescription:TextView? = null
    var etKeywords:TextView? = null

    @Inject
    lateinit var userServiceAPI: UserServiceAPI

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MachineServiceApplication).component.inject(this)
        this.sessionManager = SessionManager(this.applicationContext)
        setContentView(R.layout.activity_report_problem)
        initDrawerLayout()
        etProblemDescription = findViewById(R.id.et_problem_description)
        etKeywords = findViewById(R.id.et_keywords)
        super.onCreate(savedInstanceState)
    }

    fun sendProblem(view: View) {
        val description = etProblemDescription?.text.toString()
        val keywords = etKeywords?.text.toString()
        if (description.isEmpty() || keywords.isEmpty()) {
            Toast.makeText(applicationContext,getString(R.string.cannot_be_empty), Toast.LENGTH_SHORT).show()
        } else {
            if (NetworkManager.isNetworkAvailable(this)) {
                val problemResponse = userServiceAPI.reportApplicationProblem(keywords.toUpperCase(), description)
                problemResponse.enqueue(object : Callback<ApplicationProblem> {
                    override fun onResponse(call: Call<ApplicationProblem>, response: Response<ApplicationProblem>) =
                        when {
                            response.isSuccessful -> {
                                dataSendSuccess()
                                finish()
                            }
                            response.code() == 401 -> {
                                sessionManager.logout()
                                onError(getString(R.string.token_time_expired))
                            }
                            else -> {
                                //TODO print error message onError(response.message())
                                dataSendFailed()
                            }
                        }
                    override fun onFailure(call: Call<ApplicationProblem>, throwable: Throwable) {
                        onError(throwable.message.toString())
                    }
                })
            } else {
                noInternetConnection()
            }
        }
    }
}