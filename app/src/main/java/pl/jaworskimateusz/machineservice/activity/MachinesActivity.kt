package pl.jaworskimateusz.machineservice.activity

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import pl.jaworskimateusz.machineservice.MachineServiceApplication
import pl.jaworskimateusz.machineservice.R
import pl.jaworskimateusz.machineservice.activity.base.BaseActivity
import pl.jaworskimateusz.machineservice.adapter.MachineRecyclerViewAdapter
import pl.jaworskimateusz.machineservice.data.entity.Machine
import pl.jaworskimateusz.machineservice.viewmodel.MachineViewModel
import pl.jaworskimateusz.machineservice.viewmodel.MachineViewModelFactory
import javax.inject.Inject


class MachinesActivity : BaseActivity(), MachineRecyclerViewAdapter.OnMachineListener {

    private lateinit var machineAdapter: MachineRecyclerViewAdapter
    private lateinit var machinesList: RecyclerView
    private lateinit var etName: EditText

    private lateinit var machineViewModel: MachineViewModel
    private lateinit var machines: List<Machine>

    @Inject
    lateinit var machineViewModelFactory: MachineViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MachineServiceApplication).component.inject(this)
        machineViewModel = ViewModelProviders.of(this, machineViewModelFactory).get(MachineViewModel::class.java)
        setContentView(R.layout.activity_machines)
        initDrawerLayout()
//        if (NetworkManager.isNetworkAvailable(this))
//            machineViewModel.machineRepository.downloadMachines().execute() //TODO

        machineAdapter = MachineRecyclerViewAdapter(this, this)
        machinesList = findViewById(R.id.machines_list)
        initSearch()
        with(machinesList) {
            layoutManager = androidx.recyclerview.widget.LinearLayoutManager(context)
            adapter = machineAdapter
        }
        observe()
        super.onCreate(savedInstanceState)
    }

    private fun observe() {
        machineViewModel.getMachines().observe(this, Observer { machines ->
            if (machines != null)
                machineAdapter.submitList(machines)
                this.machines = machines
        })
    }

    private fun initSearch() {
        etName = findViewById(R.id.et_machine_name)
        etName.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(c: CharSequence, start: Int, before: Int, count: Int) {
                machineViewModel.getMachinesByName("name") //TODO
            }
        })

    }

    override fun onMachineClick(position: Int) {
        val machineId = machines[position].machineId
//        val intent = Intent(this, MachineDetailActivity::class.java)
//        intent.putExtra("machineId", machineId)
//        startActivity(intent)
        makeToast("TODO $position")
    }

    fun findByQrCode(view: View) {
        //TODO start qr activity
    }

}