package pl.jaworskimateusz.machineservice.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00110\u0010J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0013H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lpl/jaworskimateusz/machineservice/data/repository/MachineRepository;", "", "sessionManager", "Lpl/jaworskimateusz/machineservice/session/SessionManager;", "machineServiceAPI", "Lpl/jaworskimateusz/machineservice/services/MachineServiceAPI;", "machineDao", "Lpl/jaworskimateusz/machineservice/data/dao/MachineDao;", "context", "Landroid/content/Context;", "(Lpl/jaworskimateusz/machineservice/session/SessionManager;Lpl/jaworskimateusz/machineservice/services/MachineServiceAPI;Lpl/jaworskimateusz/machineservice/data/dao/MachineDao;Landroid/content/Context;)V", "getMachineById", "Lpl/jaworskimateusz/machineservice/data/entity/Machine;", "machineId", "", "getMachinesByNameLiveData", "Landroidx/lifecycle/LiveData;", "", "name", "", "getMachinesLiveData", "makeToast", "", "text", "Companion", "app_debug"})
public final class MachineRepository {
    private final pl.jaworskimateusz.machineservice.session.SessionManager sessionManager = null;
    private final pl.jaworskimateusz.machineservice.services.MachineServiceAPI machineServiceAPI = null;
    private final pl.jaworskimateusz.machineservice.data.dao.MachineDao machineDao = null;
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "Machine Repository";
    public static final pl.jaworskimateusz.machineservice.data.repository.MachineRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Machine>> getMachinesLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Machine>> getMachinesByNameLiveData(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pl.jaworskimateusz.machineservice.data.entity.Machine getMachineById(long machineId) {
        return null;
    }
    
    private final void makeToast(java.lang.String text) {
    }
    
    public MachineRepository(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.session.SessionManager sessionManager, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.services.MachineServiceAPI machineServiceAPI, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.dao.MachineDao machineDao, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lpl/jaworskimateusz/machineservice/data/repository/MachineRepository$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}