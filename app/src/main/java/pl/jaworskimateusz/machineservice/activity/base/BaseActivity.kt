package pl.jaworskimateusz.machineservice.activity.base

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import pl.jaworskimateusz.machineservice.MachineServiceApplication
import pl.jaworskimateusz.machineservice.R
import pl.jaworskimateusz.machineservice.activity.*
import pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI
import pl.jaworskimateusz.machineservice.session.SessionManager
import javax.inject.Inject


open class BaseActivity : AppCompatActivity() {

    private lateinit var mDrawerLayout: androidx.drawerlayout.widget.DrawerLayout

    @Inject
    protected lateinit var sessionManager: SessionManager

    @Inject
    lateinit var authenticationServiceApi: AuthenticationServiceAPI

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MachineServiceApplication).component.inject(this)
        super.onCreate(savedInstanceState)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val actionbar: ActionBar? = supportActionBar
        actionbar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_drawer_home)
        }
    }

    fun initDrawerLayout() {
        mDrawerLayout = findViewById(R.id.drawer_layout)
        val navigationView: NavigationView = findViewById(R.id.nav_view)
        val navHeader = navigationView.inflateHeaderView(R.layout.nav_header)
        val tvUsername = navHeader.findViewById(R.id.nav_header_login) as TextView
        val tvFullName = navHeader.findViewById(R.id.nav_header_name) as TextView

        tvFullName.text = getString(R.string.full_name) + " " +  sessionManager.fullName
        tvUsername.text = getString(R.string.login_user)  + " " + sessionManager.login

        navigationView.setNavigationItemSelectedListener { menuItem ->
            menuItem.isChecked = true
            mDrawerLayout.closeDrawers()

            when(menuItem.itemId) {
                R.id.nav_main_menu -> {
                    val intent = Intent(this, MainActivity::class.java)
                    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                    startActivity(intent)
                }
                R.id.nav_report_problem -> startActivityWithIntent(Intent(this, ReportProblemActivity::class.java))
                R.id.nav_tasks -> startActivityWithIntent(Intent(this, TasksActivity::class.java))
                R.id.nav_machines -> startActivityWithIntent(Intent(this, MachinesActivity::class.java))
                R.id.nav_issues -> startActivityWithIntent(
                        Intent(this, IssuesActivity::class.java).putExtra("readonly", true)
                )
                R.id.nav_logout -> sessionManager.logout()
            }

            true
        }
    }

    private fun startActivityWithIntent(intent: Intent) {
        intent.flags = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT
        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                mDrawerLayout.openDrawer(GravityCompat.START)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun noInternetConnection() {
        Toast.makeText(baseContext, getString(R.string.no_internet_connection), Toast.LENGTH_LONG).show()
    }

    fun dataSendSuccess() {
        Toast.makeText(baseContext, getString(R.string.data_send_success), Toast.LENGTH_LONG).show()
    }

    fun dataSendFailed() {
        Toast.makeText(baseContext, getString(R.string.data_send_faild), Toast.LENGTH_LONG).show()
    }

    fun onError(text: String) {
        Toast.makeText(baseContext, text, Toast.LENGTH_LONG).show()
    }

    fun makeToast(text: String) {
        Toast.makeText(baseContext, text, Toast.LENGTH_LONG).show()
    }

}
