package pl.jaworskimateusz.machineservice.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import pl.jaworskimateusz.machineservice.data.entity.Task
import pl.jaworskimateusz.machineservice.data.entity.User
import pl.jaworskimateusz.machineservice.data.entity.UserTask
import java.util.*

@Dao
interface TaskDao {

    @Query("SELECT * FROM tasks ORDER BY date")
    fun getAllTasksLiveData(): LiveData<List<Task>>

    @Query("""SELECT t.taskId, t.title, t.description, t.date, t.solved 
             FROM tasks AS t 
             JOIN users_tasks AS ut USING (taskId)
             WHERE (t.date BETWEEN :dateFrom AND :dateTo) 
             AND t.solved = :solved
             AND ut.userId = :userId
             ORDER BY t.date""")
    fun getAllTasksByDatesLiveData(userId: Long, dateFrom: Date, dateTo: Date, solved: Int): LiveData<List<Task>>

    @Query("SELECT * FROM tasks ORDER BY date")
    fun getAllTasks(): List<Task>

    @Query("SELECT MAX(date) FROM tasks JOIN users_tasks AS ut USING (taskId) WHERE ut.userId = :userId")
    fun getMaxTaskDate(userId: Long): Date?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllTasks(tasks: List<Task>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUserTask(userTask: UserTask)

    @Query("SELECT * FROM tasks WHERE taskId=:taskId")
    fun getTaskById(taskId: Long): Task

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(item: Task)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(item: User)

}