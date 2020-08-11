package pl.jaworskimateusz.machineservice.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import pl.jaworskimateusz.machineservice.MachineServiceApplication
import pl.jaworskimateusz.machineservice.R
import pl.jaworskimateusz.machineservice.activity.base.BaseActivity
import pl.jaworskimateusz.machineservice.session.SessionManager


class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MachineServiceApplication).component.inject(this)
        this.sessionManager = SessionManager(this.applicationContext)
        setContentView(R.layout.activity_main)
        if (!sessionManager.isLoggedIn) {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        } else {
            initDrawerLayout()
        }
        super.onCreate(savedInstanceState)
    }

    override fun onBackPressed() {
        moveTaskToBack(true)
    }

    fun navigateReportProblem(view: View) {
        val intent = Intent(this, ReportProblemActivity::class.java)
        startActivity(intent)
    }

    fun navigateTasks(view: View) {
        val intent = Intent(this, TasksActivity::class.java)
        startActivity(intent)
    }

}