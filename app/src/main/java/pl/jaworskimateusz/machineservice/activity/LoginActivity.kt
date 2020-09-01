package pl.jaworskimateusz.machineservice.activity

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import pl.jaworskimateusz.machineservice.dto.LoginResponse
import pl.jaworskimateusz.machineservice.MachineServiceApplication
import pl.jaworskimateusz.machineservice.R
import pl.jaworskimateusz.machineservice.dto.UserDto
import pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI
import pl.jaworskimateusz.machineservice.session.SessionManager
import pl.jaworskimateusz.machineservice.utilities.NetworkManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {

    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var cbRememberMe: CheckBox
    private lateinit var loadingDialog: ProgressDialog

    private lateinit var sessionManager: SessionManager

    @Inject
    lateinit var authenticationServiceApi: AuthenticationServiceAPI

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (application as MachineServiceApplication).component.inject(this)
        this.sessionManager = SessionManager(this.applicationContext)
        setContentView(R.layout.activity_login)

        etUsername = findViewById(R.id.login)
        etPassword = findViewById(R.id.et_password)
        btnLogin = findViewById(R.id.btn_login)
        cbRememberMe = findViewById(R.id.remember_me)

        btnLogin.setOnClickListener { login() }
        if (sessionManager.rememberMe) {
            etUsername.setText(sessionManager.login)
            etPassword.setText(sessionManager.password)
            cbRememberMe.isChecked = sessionManager.rememberMe
        }

    }

    fun login() {
        if (!validate()) {
            onLoginFailed()
            return
        }

        val username = etUsername.text.toString()
        val password = etPassword.text.toString()
        if (NetworkManager.isNetworkAvailable(this.applicationContext)) {
            loadingDialog = ProgressDialog(this, R.style.ThemeOverlay_MaterialComponents_Dialog)
            loadingDialog.setTitle(R.string.loading)
            loadingDialog.isIndeterminate = true
            loadingDialog.show()
            createToken(username, password)
        } else {
            Toast.makeText(baseContext, getString(R.string.no_internet_connection), Toast.LENGTH_LONG).show()
        }

    }

    private fun createToken(username: String, password: String) {
        val loginResponse = authenticationServiceApi.createToken(username, password)
        loginResponse.enqueue(object : Callback<LoginResponse> {
            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                if (response.isSuccessful) {
                    val token = response.body()!!.token
                    val user = response.body()!!.user
                    try {
                        initSessionData(token, user)
                    } catch (e: IOException) {
                        e.printStackTrace()
                    }
                    loadingDialog.dismiss()
                    onLoginSuccess()
                } else {
                    loadingDialog.dismiss()
                    onLoginFailed()
                }
            }
            override fun onFailure(call: Call<LoginResponse>, throwable: Throwable) {
                loadingDialog.dismiss()
                onLoginFailed()
            }
        })
    }

    private fun initSessionData(token: String, user: UserDto) {
        sessionManager.logIn(
            user.userId,
            user.username,
            user.firstName + " " + user.lastName,
            user.password,
            token
        )
        sessionManager.department = user.department
        sessionManager.rememberMe = cbRememberMe.isChecked
    }

    override fun onBackPressed() {
        moveTaskToBack(true)
    }

    private fun validate(): Boolean {
        val username = etUsername.text.toString()
        val password = etPassword.text.toString()
        if (username.isEmpty() || password.isEmpty())
            return false
        return true
    }

    fun onLoginSuccess() {
        Toast.makeText(baseContext, getString(R.string.login_success), Toast.LENGTH_LONG).show()
        btnLogin.isEnabled = true
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun onLoginFailed() {
        Toast.makeText(baseContext, getString(R.string.login_failed), Toast.LENGTH_LONG).show()
    }

}
