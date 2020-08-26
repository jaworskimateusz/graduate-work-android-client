package pl.jaworskimateusz.machineservice.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import pl.jaworskimateusz.machineservice.data.entity.Issue
import pl.jaworskimateusz.machineservice.data.entity.Machine

@Dao
interface MachineDao {

    @Query("SELECT * FROM machines ORDER BY name")
    fun getAllMachinesLiveData(): LiveData<List<Machine>>

    @Query("SELECT * FROM machines WHERE name LIKE '%' || :name || '%' ORDER BY name")
    fun getMachinesByNameLiveData(name: String): LiveData<List<Machine>>

    @Query("SELECT * FROM machines ORDER BY name")
    fun getAllMachines(): List<Machine>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(machines: List<Machine>)

    @Query("SELECT * FROM machines WHERE machineId=:machineId")
    fun getById(machineId: Long): Machine

    @Query("SELECT * FROM machines WHERE code=:code")
    fun getByCode(code: String): Machine

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(item: Machine)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertIssue(item: Issue)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllIssues(issues: List<Issue>)

    @Query("SELECT * FROM issues WHERE keywords LIKE '%' || :keywords || '%' ORDER BY keywords")
    fun getIssuesByKeywordsLiveData(keywords: String): LiveData<List<Issue>>

    @Query("SELECT * FROM issues WHERE keywords LIKE '%' || :keywords || '%' AND machineId=:machineId ORDER BY keywords")
    fun getIssuesByKeywordsLiveData(keywords: String, machineId: Long): LiveData<List<Issue>>

    @Query("SELECT * FROM issues WHERE issueId=:issueId")
    fun getIssueById(issueId: Long): Issue

}