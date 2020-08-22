package pl.jaworskimateusz.machineservice.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
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
    fun insertAll(tasks: List<Machine>)

    @Query("SELECT * FROM machines WHERE machineId=:machineId")
    fun getById(machineId: Long): Machine

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(item: Machine)

}