package pl.jaworskimateusz.machineservice.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lpl/jaworskimateusz/machineservice/activity/TasksActivity;", "Lpl/jaworskimateusz/machineservice/activity/base/BaseActivity;", "()V", "taskAdapter", "Lpl/jaworskimateusz/machineservice/adapter/TaskRecyclerViewAdapter;", "taskRepository", "Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository;", "getTaskRepository", "()Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository;", "setTaskRepository", "(Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository;)V", "taskViewModel", "Lpl/jaworskimateusz/machineservice/viewmodel/TaskViewModel;", "taskViewModelFactory", "Lpl/jaworskimateusz/machineservice/viewmodel/TaskViewModelFactory;", "getTaskViewModelFactory", "()Lpl/jaworskimateusz/machineservice/viewmodel/TaskViewModelFactory;", "setTaskViewModelFactory", "(Lpl/jaworskimateusz/machineservice/viewmodel/TaskViewModelFactory;)V", "tasksList", "Landroidx/recyclerview/widget/RecyclerView;", "observe", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class TasksActivity extends pl.jaworskimateusz.machineservice.activity.base.BaseActivity {
    private pl.jaworskimateusz.machineservice.adapter.TaskRecyclerViewAdapter taskAdapter;
    private androidx.recyclerview.widget.RecyclerView tasksList;
    private pl.jaworskimateusz.machineservice.viewmodel.TaskViewModel taskViewModel;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public pl.jaworskimateusz.machineservice.viewmodel.TaskViewModelFactory taskViewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public pl.jaworskimateusz.machineservice.data.repository.TaskRepository taskRepository;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final pl.jaworskimateusz.machineservice.viewmodel.TaskViewModelFactory getTaskViewModelFactory() {
        return null;
    }
    
    public final void setTaskViewModelFactory(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.viewmodel.TaskViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pl.jaworskimateusz.machineservice.data.repository.TaskRepository getTaskRepository() {
        return null;
    }
    
    public final void setTaskRepository(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.repository.TaskRepository p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observe() {
    }
    
    public TasksActivity() {
        super();
    }
}