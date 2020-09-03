package pl.jaworskimateusz.machineservice.session

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import pl.jaworskimateusz.machineservice.activity.LoginActivity

class SessionManager(private var context: Context) {

    private var sharedPreferences: SharedPreferences =  context.getSharedPreferences("MACHINE_SERVICE", 0)
    private var editor: Editor

    companion object {
        const val IS_LOGGED_IN = "isLoggedIn"
        const val TOKEN = "Token"
        const val USERNAME = "Username"
        const val PASSWORD = "Password"
        const val FULL_NAME = "FullName"
        const val USER_ID = "UserId"
        const val DEPARTMENT = "Department"
    }

    init {
        editor = sharedPreferences.edit()
    }

    val login: String
        get() = sharedPreferences.getString(USERNAME, "")

    val userId: Long
        get() = sharedPreferences.getLong(USER_ID, 0)

    val fullName: String
        get() = sharedPreferences.getString(FULL_NAME, "")

    val password: String
        get() = sharedPreferences.getString(PASSWORD, "")

    val isLoggedIn: Boolean
        get() = sharedPreferences.getBoolean(IS_LOGGED_IN, false)

    val token: String
        get() = sharedPreferences.getString(TOKEN, "")

    var department: String
        get() = sharedPreferences.getString(DEPARTMENT, "")
        set(value) {
            editor.putString(DEPARTMENT, value)
            editor.commit()
        }

    fun logIn(userId: Long, username: String, fullName: String, password: String, token: String) {
        editor.putBoolean(IS_LOGGED_IN, true)
        editor.putString(USERNAME, username)
        editor.putString(FULL_NAME, fullName)
        editor.putString(PASSWORD, password)
        editor.putString(TOKEN, "Bearer $token")
        editor.putLong(USER_ID, userId)
        editor.commit()
    }

    fun logout() {
        editor.putBoolean(IS_LOGGED_IN, false)
        editor.commit()
        startLoginActivity()
    }

    private fun startLoginActivity() {
        val intent = Intent(context, LoginActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        context.startActivity(intent)
    }

}
