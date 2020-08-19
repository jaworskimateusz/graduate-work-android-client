package pl.jaworskimateusz.machineservice.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lpl/jaworskimateusz/machineservice/activity/TaskDetailActivity;", "Lpl/jaworskimateusz/machineservice/activity/base/BaseActivity;", "()V", "btnMarkAsSolved", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "task", "Lpl/jaworskimateusz/machineservice/data/entity/Task;", "taskViewModel", "Lpl/jaworskimateusz/machineservice/viewmodel/TaskViewModel;", "taskViewModelFactory", "Lpl/jaworskimateusz/machineservice/viewmodel/TaskViewModelFactory;", "getTaskViewModelFactory", "()Lpl/jaworskimateusz/machineservice/viewmodel/TaskViewModelFactory;", "setTaskViewModelFactory", "(Lpl/jaworskimateusz/machineservice/viewmodel/TaskViewModelFactory;)V", "twDate", "Landroid/widget/TextView;", "twDescription", "twSolved", "twTitle", "markAsSolved", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setContent", "app_debug"})
public final class TaskDetailActivity extends pl.jaworskimateusz.machineservice.activity.base.BaseActivity {
    private pl.jaworskimateusz.machineservice.viewmodel.TaskViewModel taskViewModel;
    private pl.jaworskimateusz.machineservice.data.entity.Task task;
    private android.widget.TextView twTitle;
    private android.widget.TextView twDate;
    private android.widget.TextView twSolved;
    private android.widget.TextView twDescription;
    private com.google.android.material.floatingactionbutton.FloatingActionButton btnMarkAsSolved;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public pl.jaworskimateusz.machineservice.viewmodel.TaskViewModelFactory taskViewModelFactory;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final pl.jaworskimateusz.machineservice.viewmodel.TaskViewModelFactory getTaskViewModelFactory() {
        return null;
    }
    
    public final void setTaskViewModelFactory(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.viewmodel.TaskViewModelFactory p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setContent() {
    }
    
    public final void markAsSolved(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public TaskDetailActivity() {
        super();
    }
}