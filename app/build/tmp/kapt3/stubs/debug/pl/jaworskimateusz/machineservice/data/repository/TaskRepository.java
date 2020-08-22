package pl.jaworskimateusz.machineservice.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0003\u001b\u001c\u001dB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ*\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository;", "", "sessionManager", "Lpl/jaworskimateusz/machineservice/session/SessionManager;", "userServiceAPI", "Lpl/jaworskimateusz/machineservice/services/UserServiceAPI;", "taskDao", "Lpl/jaworskimateusz/machineservice/data/dao/TaskDao;", "context", "Landroid/content/Context;", "(Lpl/jaworskimateusz/machineservice/session/SessionManager;Lpl/jaworskimateusz/machineservice/services/UserServiceAPI;Lpl/jaworskimateusz/machineservice/data/dao/TaskDao;Landroid/content/Context;)V", "getTaskById", "Lpl/jaworskimateusz/machineservice/data/entity/Task;", "taskId", "", "getTasksByDatesLiveData", "Landroidx/lifecycle/LiveData;", "", "dateFrom", "Ljava/util/Date;", "dateTo", "solved", "", "makeToast", "", "text", "", "Companion", "DownloadTasks", "UpdateTask", "app_debug"})
public final class TaskRepository {
    private final pl.jaworskimateusz.machineservice.session.SessionManager sessionManager = null;
    private final pl.jaworskimateusz.machineservice.services.UserServiceAPI userServiceAPI = null;
    private final pl.jaworskimateusz.machineservice.data.dao.TaskDao taskDao = null;
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "Task Repository";
    public static final pl.jaworskimateusz.machineservice.data.repository.TaskRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Task>> getTasksByDatesLiveData(@org.jetbrains.annotations.NotNull()
    java.util.Date dateFrom, @org.jetbrains.annotations.NotNull()
    java.util.Date dateTo, int solved) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pl.jaworskimateusz.machineservice.data.entity.Task getTaskById(long taskId) {
        return null;
    }
    
    private final void makeToast(java.lang.String text) {
    }
    
    public TaskRepository(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.session.SessionManager sessionManager, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.services.UserServiceAPI userServiceAPI, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.dao.TaskDao taskDao, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0087\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0007\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository$DownloadTasks;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Lpl/jaworskimateusz/machineservice/dto/TaskDto;", "(Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository;)V", "doInBackground", "params", "", "([Ljava/lang/Void;)Lpl/jaworskimateusz/machineservice/dto/TaskDto;", "app_debug"})
    public final class DownloadTasks extends android.os.AsyncTask<java.lang.Void, java.lang.Void, pl.jaworskimateusz.machineservice.dto.TaskDto> {
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected pl.jaworskimateusz.machineservice.dto.TaskDto doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
        
        public DownloadTasks() {
            super();
        }
    }
    
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0087\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\t\u001a\u0004\u0018\u00010\u00032\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000b\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository$UpdateTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Lpl/jaworskimateusz/machineservice/dto/TaskDto;", "task", "Lpl/jaworskimateusz/machineservice/data/entity/Task;", "(Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository;Lpl/jaworskimateusz/machineservice/data/entity/Task;)V", "getTask", "()Lpl/jaworskimateusz/machineservice/data/entity/Task;", "doInBackground", "params", "", "([Ljava/lang/Void;)Lpl/jaworskimateusz/machineservice/dto/TaskDto;", "app_debug"})
    public final class UpdateTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, pl.jaworskimateusz.machineservice.dto.TaskDto> {
        @org.jetbrains.annotations.NotNull()
        private final pl.jaworskimateusz.machineservice.data.entity.Task task = null;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected pl.jaworskimateusz.machineservice.dto.TaskDto doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final pl.jaworskimateusz.machineservice.data.entity.Task getTask() {
            return null;
        }
        
        public UpdateTask(@org.jetbrains.annotations.NotNull()
        pl.jaworskimateusz.machineservice.data.entity.Task task) {
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