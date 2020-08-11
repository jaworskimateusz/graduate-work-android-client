package pl.jaworskimateusz.machineservice.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lpl/jaworskimateusz/machineservice/viewmodel/TaskViewModel;", "Landroidx/lifecycle/ViewModel;", "taskRepository", "Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository;", "(Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository;)V", "tasks", "Landroidx/lifecycle/LiveData;", "", "Lpl/jaworskimateusz/machineservice/data/entity/Task;", "getTasks", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class TaskViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Task>> tasks = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Task>> getTasks() {
        return null;
    }
    
    public TaskViewModel(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.repository.TaskRepository taskRepository) {
        super();
    }
}