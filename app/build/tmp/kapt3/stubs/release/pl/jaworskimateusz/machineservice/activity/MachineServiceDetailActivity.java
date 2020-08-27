package pl.jaworskimateusz.machineservice.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001d"}, d2 = {"Lpl/jaworskimateusz/machineservice/activity/MachineServiceDetailActivity;", "Lpl/jaworskimateusz/machineservice/activity/base/BaseActivity;", "()V", "btnSaveService", "Landroid/widget/Button;", "cbResult", "Landroid/widget/CheckBox;", "etComponentName", "Landroid/widget/EditText;", "etDescription", "machineId", "", "machineViewModel", "Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModel;", "machineViewModelFactory", "Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModelFactory;", "getMachineViewModelFactory", "()Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModelFactory;", "setMachineViewModelFactory", "(Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModelFactory;)V", "findViews", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveService", "view", "Landroid/view/View;", "Companion", "app_release"})
public final class MachineServiceDetailActivity extends pl.jaworskimateusz.machineservice.activity.base.BaseActivity {
    private pl.jaworskimateusz.machineservice.viewmodel.MachineViewModel machineViewModel;
    private android.widget.EditText etComponentName;
    private android.widget.EditText etDescription;
    private android.widget.CheckBox cbResult;
    private android.widget.Button btnSaveService;
    private long machineId = 0L;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public pl.jaworskimateusz.machineservice.viewmodel.MachineViewModelFactory machineViewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "Machine Service Detail Activity";
    public static final pl.jaworskimateusz.machineservice.activity.MachineServiceDetailActivity.Companion Companion = null;
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
    
    private final void findViews() {
    }
    
    public final void saveService(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public MachineServiceDetailActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lpl/jaworskimateusz/machineservice/activity/MachineServiceDetailActivity$Companion;", "", "()V", "TAG", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}