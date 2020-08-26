package pl.jaworskimateusz.machineservice.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001bH\u0002J\u0012\u0010\u001f\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010#\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lpl/jaworskimateusz/machineservice/activity/IssueDetailActivity;", "Lpl/jaworskimateusz/machineservice/activity/base/BaseActivity;", "()V", "btnSaveIssue", "Landroid/widget/Button;", "etDescription", "Landroid/widget/EditText;", "etKeywords", "etSolution", "issue", "Lpl/jaworskimateusz/machineservice/data/entity/Issue;", "issueId", "", "machineId", "machineViewModel", "Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModel;", "machineViewModelFactory", "Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModelFactory;", "getMachineViewModelFactory", "()Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModelFactory;", "setMachineViewModelFactory", "(Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModelFactory;)V", "readonly", "", "signaturePad", "Lcom/github/gcacace/signaturepad/views/SignaturePad;", "clearSignaturePad", "", "view", "Landroid/view/View;", "findViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveIssue", "setContent", "Companion", "app_debug"})
public final class IssueDetailActivity extends pl.jaworskimateusz.machineservice.activity.base.BaseActivity {
    private pl.jaworskimateusz.machineservice.viewmodel.MachineViewModel machineViewModel;
    private pl.jaworskimateusz.machineservice.data.entity.Issue issue;
    private android.widget.EditText etKeywords;
    private android.widget.EditText etDescription;
    private android.widget.EditText etSolution;
    private android.widget.Button btnSaveIssue;
    private com.github.gcacace.signaturepad.views.SignaturePad signaturePad;
    private boolean readonly = false;
    private long issueId = 0L;
    private long machineId = 0L;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public pl.jaworskimateusz.machineservice.viewmodel.MachineViewModelFactory machineViewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "Issue Detail Activity";
    public static final pl.jaworskimateusz.machineservice.activity.IssueDetailActivity.Companion Companion = null;
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
    
    private final void setContent() {
    }
    
    public final void saveIssue(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void clearSignaturePad(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public IssueDetailActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lpl/jaworskimateusz/machineservice/activity/IssueDetailActivity$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}