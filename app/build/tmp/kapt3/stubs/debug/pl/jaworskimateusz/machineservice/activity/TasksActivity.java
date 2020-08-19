package pl.jaworskimateusz.machineservice.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u0012\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lpl/jaworskimateusz/machineservice/activity/TasksActivity;", "Lpl/jaworskimateusz/machineservice/activity/base/BaseActivity;", "Lpl/jaworskimateusz/machineservice/adapter/TaskRecyclerViewAdapter$OnTaskListener;", "()V", "cbTaskSolved", "Landroid/widget/CheckBox;", "dateFromPicker", "Lpl/jaworskimateusz/machineservice/utilities/DatePicker;", "dateToPicker", "etDateFrom", "Landroid/widget/EditText;", "etDateTo", "taskAdapter", "Lpl/jaworskimateusz/machineservice/adapter/TaskRecyclerViewAdapter;", "taskViewModel", "Lpl/jaworskimateusz/machineservice/viewmodel/TaskViewModel;", "taskViewModelFactory", "Lpl/jaworskimateusz/machineservice/viewmodel/TaskViewModelFactory;", "getTaskViewModelFactory", "()Lpl/jaworskimateusz/machineservice/viewmodel/TaskViewModelFactory;", "setTaskViewModelFactory", "(Lpl/jaworskimateusz/machineservice/viewmodel/TaskViewModelFactory;)V", "tasks", "", "Lpl/jaworskimateusz/machineservice/data/entity/Task;", "tasksList", "Landroidx/recyclerview/widget/RecyclerView;", "initDatePickers", "", "observe", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onTaskClick", "position", "", "searchTasks", "app_debug"})
public final class TasksActivity extends pl.jaworskimateusz.machineservice.activity.base.BaseActivity implements pl.jaworskimateusz.machineservice.adapter.TaskRecyclerViewAdapter.OnTaskListener {
    private pl.jaworskimateusz.machineservice.adapter.TaskRecyclerViewAdapter taskAdapter;
    private androidx.recyclerview.widget.RecyclerView tasksList;
    private pl.jaworskimateusz.machineservice.utilities.DatePicker dateFromPicker;
    private pl.jaworskimateusz.machineservice.utilities.DatePicker dateToPicker;
    private android.widget.EditText etDateFrom;
    private android.widget.EditText etDateTo;
    private android.widget.CheckBox cbTaskSolved;
    private pl.jaworskimateusz.machineservice.viewmodel.TaskViewModel taskViewModel;
    private java.util.List<pl.jaworskimateusz.machineservice.data.entity.Task> tasks;
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
    
    private final void observe() {
    }
    
    private final void searchTasks() {
    }
    
    private final void initDatePickers() {
    }
    
    @java.lang.Override()
    public void onTaskClick(int position) {
    }
    
    public TasksActivity() {
        super();
    }
}