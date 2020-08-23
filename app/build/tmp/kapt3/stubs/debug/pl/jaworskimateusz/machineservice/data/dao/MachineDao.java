package pl.jaworskimateusz.machineservice.data.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\'J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00062\u0006\u0010\u000e\u001a\u00020\tH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\'J\u0016\u0010\u0012\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0014"}, d2 = {"Lpl/jaworskimateusz/machineservice/data/dao/MachineDao;", "", "getAllMachines", "", "Lpl/jaworskimateusz/machineservice/data/entity/Machine;", "getAllMachinesLiveData", "Landroidx/lifecycle/LiveData;", "getByCode", "code", "", "getById", "machineId", "", "getMachinesByNameLiveData", "name", "insert", "", "item", "insertAll", "tasks", "app_debug"})
public abstract interface MachineDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM machines ORDER BY name")
    public abstract androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Machine>> getAllMachinesLiveData();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM machines WHERE name LIKE \'%\' || :name || \'%\' ORDER BY name")
    public abstract androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Machine>> getMachinesByNameLiveData(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM machines ORDER BY name")
    public abstract java.util.List<pl.jaworskimateusz.machineservice.data.entity.Machine> getAllMachines();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<pl.jaworskimateusz.machineservice.data.entity.Machine> tasks);
    
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
}