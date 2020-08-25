package pl.jaworskimateusz.machineservice.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014J\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00160\u000e2\u0006\u0010\u0017\u001a\u00020\u0011J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lpl/jaworskimateusz/machineservice/data/repository/MachineRepository;", "", "sessionManager", "Lpl/jaworskimateusz/machineservice/session/SessionManager;", "machineServiceAPI", "Lpl/jaworskimateusz/machineservice/services/MachineServiceAPI;", "machineDao", "Lpl/jaworskimateusz/machineservice/data/dao/MachineDao;", "context", "Landroid/content/Context;", "(Lpl/jaworskimateusz/machineservice/session/SessionManager;Lpl/jaworskimateusz/machineservice/services/MachineServiceAPI;Lpl/jaworskimateusz/machineservice/data/dao/MachineDao;Landroid/content/Context;)V", "getMachineServiceAPI", "()Lpl/jaworskimateusz/machineservice/services/MachineServiceAPI;", "getMachineByCode", "Landroidx/lifecycle/LiveData;", "Lpl/jaworskimateusz/machineservice/data/entity/Machine;", "code", "", "getMachineById", "machineId", "", "getMachinesByNameLiveData", "", "name", "makeToast", "", "text", "Companion", "DownloadMachines", "app_debug"})
public final class MachineRepository {
    private final pl.jaworskimateusz.machineservice.session.SessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull()
    private final pl.jaworskimateusz.machineservice.services.MachineServiceAPI machineServiceAPI = null;
    private final pl.jaworskimateusz.machineservice.data.dao.MachineDao machineDao = null;
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "Machine Repository";
    public static final pl.jaworskimateusz.machineservice.data.repository.MachineRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Machine>> getMachinesByNameLiveData(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pl.jaworskimateusz.machineservice.data.entity.Machine getMachineById(long machineId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<pl.jaworskimateusz.machineservice.data.entity.Machine> getMachineByCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return null;
    }
    
    private final void makeToast(java.lang.String text) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pl.jaworskimateusz.machineservice.services.MachineServiceAPI getMachineServiceAPI() {
        return null;
    }
    
    public MachineRepository(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.session.SessionManager sessionManager, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.services.MachineServiceAPI machineServiceAPI, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.dao.MachineDao machineDao, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0087\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0007\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lpl/jaworskimateusz/machineservice/data/repository/MachineRepository$DownloadMachines;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Lpl/jaworskimateusz/machineservice/dto/MachineDto;", "(Lpl/jaworskimateusz/machineservice/data/repository/MachineRepository;)V", "doInBackground", "params", "", "([Ljava/lang/Void;)Lpl/jaworskimateusz/machineservice/dto/MachineDto;", "app_debug"})
    public final class DownloadMachines extends android.os.AsyncTask<java.lang.Void, java.lang.Void, pl.jaworskimateusz.machineservice.dto.MachineDto> {
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected pl.jaworskimateusz.machineservice.dto.MachineDto doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
        
        public DownloadMachines() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lpl/jaworskimateusz/machineservice/data/repository/MachineRepository$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}