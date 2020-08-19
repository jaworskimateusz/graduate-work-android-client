package pl.jaworskimateusz.machineservice.data.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J,\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006H\'J\n\u0010\r\u001a\u0004\u0018\u00010\bH\'J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\'J\u0016\u0010\u0014\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0016"}, d2 = {"Lpl/jaworskimateusz/machineservice/data/dao/TaskDao;", "", "getAllTasks", "", "Lpl/jaworskimateusz/machineservice/data/entity/Task;", "getAllTasksByDatesLiveData", "Landroidx/lifecycle/LiveData;", "dateFrom", "Ljava/util/Date;", "dateTo", "solved", "", "getAllTasksLiveData", "getMaxTaskDate", "getTaskById", "taskId", "", "insert", "", "item", "insertAllTasks", "tasks", "app_debug"})
public abstract interface TaskDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tasks ORDER BY date")
    public abstract androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Task>> getAllTasksLiveData();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tasks WHERE (date BETWEEN :dateFrom AND :dateTo) AND solved=:solved ORDER BY date")
    public abstract androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Task>> getAllTasksByDatesLiveData(@org.jetbrains.annotations.NotNull()
    java.util.Date dateFrom, @org.jetbrains.annotations.NotNull()
    java.util.Date dateTo, int solved);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tasks ORDER BY date")
    public abstract java.util.List<pl.jaworskimateusz.machineservice.data.entity.Task> getAllTasks();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT MAX(date) FROM tasks")
    public abstract java.util.Date getMaxTaskDate();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAllTasks(@org.jetbrains.annotations.NotNull()
    java.util.List<pl.jaworskimateusz.machineservice.data.entity.Task> tasks);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tasks WHERE taskId=:taskId")
    public abstract pl.jaworskimateusz.machineservice.data.entity.Task getTaskById(long taskId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.entity.Task item);
}