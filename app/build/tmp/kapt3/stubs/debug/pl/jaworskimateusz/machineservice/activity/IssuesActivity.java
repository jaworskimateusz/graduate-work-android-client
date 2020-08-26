package pl.jaworskimateusz.machineservice.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u001cH\u0002J\u0012\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0015J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lpl/jaworskimateusz/machineservice/activity/IssuesActivity;", "Lpl/jaworskimateusz/machineservice/activity/base/BaseActivity;", "Lpl/jaworskimateusz/machineservice/adapter/IssueRecyclerViewAdapter$OnIssueListener;", "()V", "btnAddIssue", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "etKeywords", "Landroid/widget/EditText;", "issueAdapter", "Lpl/jaworskimateusz/machineservice/adapter/IssueRecyclerViewAdapter;", "issues", "", "Lpl/jaworskimateusz/machineservice/data/entity/Issue;", "issuesList", "Landroidx/recyclerview/widget/RecyclerView;", "machineId", "", "machineViewModel", "Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModel;", "machineViewModelFactory", "Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModelFactory;", "getMachineViewModelFactory", "()Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModelFactory;", "setMachineViewModelFactory", "(Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModelFactory;)V", "readonly", "", "addIssue", "", "view", "Landroid/view/View;", "observe", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onIssueClick", "position", "", "search", "app_debug"})
public final class IssuesActivity extends pl.jaworskimateusz.machineservice.activity.base.BaseActivity implements pl.jaworskimateusz.machineservice.adapter.IssueRecyclerViewAdapter.OnIssueListener {
    private pl.jaworskimateusz.machineservice.adapter.IssueRecyclerViewAdapter issueAdapter;
    private androidx.recyclerview.widget.RecyclerView issuesList;
    private android.widget.EditText etKeywords;
    private com.google.android.material.floatingactionbutton.FloatingActionButton btnAddIssue;
    private pl.jaworskimateusz.machineservice.viewmodel.MachineViewModel machineViewModel;
    private java.util.List<pl.jaworskimateusz.machineservice.data.entity.Issue> issues;
    private long machineId = 0L;
    private boolean readonly = true;
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
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observe() {
    }
    
    private final void search() {
    }
    
    @java.lang.Override()
    public void onIssueClick(int position) {
    }
    
    public final void addIssue(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public IssuesActivity() {
        super();
    }
}