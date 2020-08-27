package pl.jaworskimateusz.machineservice.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lpl/jaworskimateusz/machineservice/activity/MachinesActivity;", "Lpl/jaworskimateusz/machineservice/activity/base/BaseActivity;", "Lpl/jaworskimateusz/machineservice/adapter/MachineRecyclerViewAdapter$OnMachineListener;", "()V", "etName", "Landroid/widget/EditText;", "machineAdapter", "Lpl/jaworskimateusz/machineservice/adapter/MachineRecyclerViewAdapter;", "machineViewModel", "Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModel;", "machineViewModelFactory", "Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModelFactory;", "getMachineViewModelFactory", "()Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModelFactory;", "setMachineViewModelFactory", "(Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModelFactory;)V", "machines", "", "Lpl/jaworskimateusz/machineservice/data/entity/Machine;", "machinesList", "Landroidx/recyclerview/widget/RecyclerView;", "findByQrCode", "", "view", "Landroid/view/View;", "observe", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMachineClick", "position", "", "search", "app_release"})
public final class MachinesActivity extends pl.jaworskimateusz.machineservice.activity.base.BaseActivity implements pl.jaworskimateusz.machineservice.adapter.MachineRecyclerViewAdapter.OnMachineListener {
    private pl.jaworskimateusz.machineservice.adapter.MachineRecyclerViewAdapter machineAdapter;
    private androidx.recyclerview.widget.RecyclerView machinesList;
    private android.widget.EditText etName;
    private pl.jaworskimateusz.machineservice.viewmodel.MachineViewModel machineViewModel;
    private java.util.List<pl.jaworskimateusz.machineservice.data.entity.Machine> machines;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public pl.jaworskimateusz.machineservice.viewmodel.MachineViewModelFactory machineViewModelFactory;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final pl.jaworskimateusz.machineservice.viewmodel.MachineViewModelFactory getMachineViewModelFactory() {
        return null;
    }
    
    public final void setMachineViewModelFactory(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.viewmodel.MachineViewModelFactory p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observe() {
    }
    
    private final void search() {
    }
    
    @java.lang.Override()
    public void onMachineClick(int position) {
    }
    
    public final void findByQrCode(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public MachinesActivity() {
        super();
    }
}