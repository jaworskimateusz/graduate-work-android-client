package pl.jaworskimateusz.machineservice.data.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\'J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\u0006\u0010\u0010\u001a\u00020\bH\'J$\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\'J$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\bH\'J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\'J\u0016\u0010\u0017\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'J\u0016\u0010\u0019\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\'J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rH\'J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u001dH\'J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\'\u00a8\u0006!"}, d2 = {"Lpl/jaworskimateusz/machineservice/data/dao/MachineDao;", "", "getAllMachinesLiveData", "Landroidx/lifecycle/LiveData;", "", "Lpl/jaworskimateusz/machineservice/data/entity/Machine;", "getByCode", "code", "", "getById", "machineId", "", "getIssueById", "Lpl/jaworskimateusz/machineservice/data/entity/Issue;", "issueId", "getIssuesByKeywordsLiveData", "keywords", "getMachinesByNameLiveData", "userId", "name", "insert", "", "item", "insertAll", "machines", "insertAllIssues", "issues", "insertIssue", "insertService", "Lpl/jaworskimateusz/machineservice/data/entity/Service;", "insertUserMachine", "userMachine", "Lpl/jaworskimateusz/machineservice/data/entity/UserMachine;", "app_debug"})
public abstract interface MachineDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM machines ORDER BY name")
    public abstract androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Machine>> getAllMachinesLiveData();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT m.machineId, m.name, m.code, m.description, m.image, m.serviceInstruction \n            FROM machines AS m \n            JOIN users_machines AS um USING(machineId)  \n            WHERE m.name LIKE \'%\' || :name || \'%\' AND um.userId=:userId \n            ORDER BY m.name")
    public abstract androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Machine>> getMachinesByNameLiveData(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<pl.jaworskimateusz.machineservice.data.entity.Machine> machines);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertUserMachine(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.entity.UserMachine userMachine);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM machines WHERE machineId=:machineId")
    public abstract pl.jaworskimateusz.machineservice.data.entity.Machine getById(long machineId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM machines WHERE code=:code")
    public abstract pl.jaworskimateusz.machineservice.data.entity.Machine getByCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.entity.Machine item);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertIssue(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.entity.Issue item);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAllIssues(@org.jetbrains.annotations.NotNull()
    java.util.List<pl.jaworskimateusz.machineservice.data.entity.Issue> issues);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM issues WHERE keywords LIKE \'%\' || :keywords || \'%\' ORDER BY keywords")
    public abstract androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Issue>> getIssuesByKeywordsLiveData(@org.jetbrains.annotations.NotNull()
    java.lang.String keywords);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM issues WHERE keywords LIKE \'%\' || :keywords || \'%\' AND machineId=:machineId ORDER BY keywords")
    public abstract androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Issue>> getIssuesByKeywordsLiveData(@org.jetbrains.annotations.NotNull()
    java.lang.String keywords, long machineId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM issues WHERE issueId=:issueId")
    public abstract pl.jaworskimateusz.machineservice.data.entity.Issue getIssueById(long issueId);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertService(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.entity.Service item);
}