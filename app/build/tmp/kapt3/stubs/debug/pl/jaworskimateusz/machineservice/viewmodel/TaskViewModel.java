package pl.jaworskimateusz.machineservice.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tJ\u001e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2 = {"Lpl/jaworskimateusz/machineservice/viewmodel/TaskViewModel;", "Landroidx/lifecycle/ViewModel;", "taskRepository", "Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository;", "(Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository;)V", "mutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lpl/jaworskimateusz/machineservice/viewmodel/TaskViewModel$SearchingParams;", "taskList", "Landroidx/lifecycle/LiveData;", "", "Lpl/jaworskimateusz/machineservice/data/entity/Task;", "getTaskRepository", "()Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository;", "getTasks", "getTasksByDates", "dateFrom", "Ljava/util/Date;", "dateTo", "solved", "", "params", "SearchingParams", "app_debug"})
public final class TaskViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<pl.jaworskimateusz.machineservice.viewmodel.TaskViewModel.SearchingParams> mutableLiveData = null;
    private final androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Task>> taskList = null;
    @org.jetbrains.annotations.NotNull()
    private final pl.jaworskimateusz.machineservice.data.repository.TaskRepository taskRepository = null;
    
    private final androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Task>> getTasksByDates(pl.jaworskimateusz.machineservice.viewmodel.TaskViewModel.SearchingParams params) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pl.jaworskimateusz.machineservice.viewmodel.TaskViewModel getTasksByDates(@org.jetbrains.annotations.NotNull()
    java.util.Date dateFrom, @org.jetbrains.annotations.NotNull()
    java.util.Date dateTo, int solved) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Task>> getTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pl.jaworskimateusz.machineservice.data.repository.TaskRepository getTaskRepository() {
        return null;
    }
    
    public TaskViewModel(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.repository.TaskRepository taskRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lpl/jaworskimateusz/machineservice/viewmodel/TaskViewModel$SearchingParams;", "", "dateFrom", "Ljava/util/Date;", "dateTo", "solved", "", "(Ljava/util/Date;Ljava/util/Date;I)V", "getDateFrom", "()Ljava/util/Date;", "setDateFrom", "(Ljava/util/Date;)V", "getDateTo", "setDateTo", "getSolved", "()I", "setSolved", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
    public static final class SearchingParams {
        @org.jetbrains.annotations.NotNull()
        private java.util.Date dateFrom;
        @org.jetbrains.annotations.NotNull()
        private java.util.Date dateTo;
        private int solved;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Date getDateFrom() {
            return null;
        }
        
        public final void setDateFrom(@org.jetbrains.annotations.NotNull()
        java.util.Date p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Date getDateTo() {
            return null;
        }
        
        public final void setDateTo(@org.jetbrains.annotations.NotNull()
        java.util.Date p0) {
        }
        
        public final int getSolved() {
            return 0;
        }
        
        public final void setSolved(int p0) {
        }
        
        public SearchingParams(@org.jetbrains.annotations.NotNull()
        java.util.Date dateFrom, @org.jetbrains.annotations.NotNull()
        java.util.Date dateTo, int solved) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Date component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Date component2() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final pl.jaworskimateusz.machineservice.viewmodel.TaskViewModel.SearchingParams copy(@org.jetbrains.annotations.NotNull()
        java.util.Date dateFrom, @org.jetbrains.annotations.NotNull()
        java.util.Date dateTo, int solved) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}