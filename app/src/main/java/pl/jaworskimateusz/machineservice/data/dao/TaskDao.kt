package pl.jaworskimateusz.machineservice.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import pl.jaworskimateusz.machineservice.data.entity.Task

@Dao
interface TaskDao {

    @Query("SELECT * FROM tasks ORDER BY date")
    fun getAllTasksLiveData(): LiveData<List<Task>>

    @Query("SELECT * FROM tasks ORDER BY date")
    fun getAllTasks(): List<Task>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllTasks(tasks: List<Task>)

}