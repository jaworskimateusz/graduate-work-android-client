package pl.jaworskimateusz.machineservice.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository;", "", "sessionManager", "Lpl/jaworskimateusz/machineservice/session/SessionManager;", "userServiceAPI", "Lpl/jaworskimateusz/machineservice/services/UserServiceAPI;", "taskDao", "Lpl/jaworskimateusz/machineservice/data/dao/TaskDao;", "(Lpl/jaworskimateusz/machineservice/session/SessionManager;Lpl/jaworskimateusz/machineservice/services/UserServiceAPI;Lpl/jaworskimateusz/machineservice/data/dao/TaskDao;)V", "downloadTasksFromService", "", "getTasksLiveData", "Landroidx/lifecycle/LiveData;", "", "Lpl/jaworskimateusz/machineservice/data/entity/Task;", "Companion", "downloadTasks", "app_debug"})
public final class TaskRepository {
    private final pl.jaworskimateusz.machineservice.session.SessionManager sessionManager = null;
    private final pl.jaworskimateusz.machineservice.services.UserServiceAPI userServiceAPI = null;
    private final pl.jaworskimateusz.machineservice.data.dao.TaskDao taskDao = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "TaskRepository";
    public static final pl.jaworskimateusz.machineservice.data.repository.TaskRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Task>> getTasksLiveData() {
        return null;
    }
    
    public final void downloadTasksFromService() {
    }
    
    public TaskRepository(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.session.SessionManager sessionManager, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.services.UserServiceAPI userServiceAPI, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.dao.TaskDao taskDao) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0007\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository$downloadTasks;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Lpl/jaworskimateusz/machineservice/dto/TaskDto;", "(Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository;)V", "doInBackground", "params", "", "([Ljava/lang/Void;)Lpl/jaworskimateusz/machineservice/dto/TaskDto;", "app_debug"})
    public final class downloadTasks extends android.os.AsyncTask<java.lang.Void, java.lang.Void, pl.jaworskimateusz.machineservice.dto.TaskDto> {
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected pl.jaworskimateusz.machineservice.dto.TaskDto doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
        
        public downloadTasks() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}