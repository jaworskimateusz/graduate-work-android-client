package pl.jaworskimateusz.machineservice.data.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J4\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006H\'J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\bH\'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u0016\u0010\u0016\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\'\u00a8\u0006\u001b"}, d2 = {"Lpl/jaworskimateusz/machineservice/data/dao/TaskDao;", "", "getAllTasks", "", "Lpl/jaworskimateusz/machineservice/data/entity/Task;", "getAllTasksByDatesLiveData", "Landroidx/lifecycle/LiveData;", "userId", "", "dateFrom", "Ljava/util/Date;", "dateTo", "solved", "", "getAllTasksLiveData", "getMaxTaskDate", "getTaskById", "taskId", "insert", "", "item", "Lpl/jaworskimateusz/machineservice/data/entity/User;", "insertAllTasks", "tasks", "insertUserTask", "userTask", "Lpl/jaworskimateusz/machineservice/data/entity/UserTask;", "app_debug"})
public abstract interface TaskDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tasks ORDER BY date")
    public abstract androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Task>> getAllTasksLiveData();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT t.taskId, t.title, t.description, t.date, t.solved \n             FROM tasks AS t \n             JOIN users_tasks AS ut USING (taskId)\n             WHERE (t.date BETWEEN :dateFrom AND :dateTo) \n             AND t.solved = :solved\n             AND ut.userId = :userId\n             ORDER BY t.date")
    public abstract androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Task>> getAllTasksByDatesLiveData(long userId, @org.jetbrains.annotations.NotNull()
    java.util.Date dateFrom, @org.jetbrains.annotations.NotNull()
    java.util.Date dateTo, int solved);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tasks ORDER BY date")
    public abstract java.util.List<pl.jaworskimateusz.machineservice.data.entity.Task> getAllTasks();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT MAX(date) FROM tasks JOIN users_tasks AS ut USING (taskId) WHERE ut.userId = :userId")
    public abstract java.util.Date getMaxTaskDate(long userId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAllTasks(@org.jetbrains.annotations.NotNull()
    java.util.List<pl.jaworskimateusz.machineservice.data.entity.Task> tasks);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertUserTask(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.entity.UserTask userTask);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tasks WHERE taskId=:taskId")
    public abstract pl.jaworskimateusz.machineservice.data.entity.Task getTaskById(long taskId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.entity.Task item);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.entity.User item);
}