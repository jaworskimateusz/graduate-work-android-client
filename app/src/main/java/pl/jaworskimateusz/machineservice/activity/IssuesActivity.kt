package pl.jaworskimateusz.machineservice.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import pl.jaworskimateusz.machineservice.MachineServiceApplication
import pl.jaworskimateusz.machineservice.R
import pl.jaworskimateusz.machineservice.activity.base.BaseActivity
import pl.jaworskimateusz.machineservice.adapter.IssueRecyclerViewAdapter
import pl.jaworskimateusz.machineservice.adapter.MachineRecyclerViewAdapter
import pl.jaworskimateusz.machineservice.data.entity.Issue
import pl.jaworskimateusz.machineservice.data.entity.Machine
import pl.jaworskimateusz.machineservice.utilities.NetworkManager
import pl.jaworskimateusz.machineservice.viewmodel.MachineViewModel
import pl.jaworskimateusz.machineservice.viewmodel.MachineViewModelFactory
import javax.inject.Inject

class IssuesActivity : BaseActivity(), IssueRecyclerViewAdapter.OnIssueListener {

    private lateinit var issueAdapter: IssueRecyclerViewAdapter
    private lateinit var issuesList: RecyclerView
    private lateinit var etKeywords: EditText
    private lateinit var btnAddIssue: FloatingActionButton

    private lateinit var machineViewModel: MachineViewModel
    private lateinit var issues: List<Issue>
    private var machineId: Long = 0
    private var readonly: Boolean = true

    @Inject
    lateinit var machineViewModelFactory: MachineViewModelFactory

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MachineServiceApplication).component.inject(this)
        machineViewModel = ViewModelProviders.of(this, machineViewModelFactory).get(MachineViewModel::class.java)
        setContentView(R.layout.activity_issues)
        initDrawerLayout()
        issueAdapter = IssueRecyclerViewAdapter(this, this)
        issuesList = findViewById(R.id.issues_list)
        btnAddIssue = findViewById(R.id.fab_add_issue)
        val machineId = intent?.extras?.getLong("machineId")
        readonly = intent?.extras?.getBoolean("readonly", true)!!
        if (readonly)
            btnAddIssue.visibility = View.INVISIBLE
        if (NetworkManager.isNetworkAvailable(this)) {
            if (machineId != null && machineId != 0L) {
                this.machineId = machineId
                machineViewModel.machineRepository.DownloadIssues(this.machineId).execute()
            } else {
                machineViewModel.machineRepository.DownloadIssues(0).execute()
            }
        }
        search()
        with(issuesList) {
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context)
            adapter = issueAdapter
        }
        observe()
        machineViewModel.getIssuesByKeywords("", this.machineId)
        super.onCreate(savedInstanceState)
    }

    private fun observe() {
        machineViewModel.getIssues().observe(this, Observer { issues ->
            if (issues != null)
                issueAdapter.submitList(issues)
                this.issues = issues
        })
    }

    private fun search() {
        etKeywords = findViewById(R.id.et_keywords)
        etKeywords.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(c: CharSequence, start: Int, before: Int, count: Int) {
                machineViewModel.getIssuesByKeywords(etKeywords.text.toString(), machineId)
            }
        })
    }

    override fun onIssueClick(position: Int) {
        val issueId = issues[position].issueId
        val intent = Intent(this, IssueDetailActivity::class.java)
        intent.putExtra("issueId", issueId)
        intent.putExtra("machineId", machineId)
        intent.putExtra("readonly", readonly)
        startActivity(intent)
    }

    fun addIssue(view: View) {
        val intent = Intent(this, IssueDetailActivity::class.java)
        intent.putExtra("machineId", machineId)
        intent.putExtra("readonly", readonly)
        startActivity(intent)
    }

}