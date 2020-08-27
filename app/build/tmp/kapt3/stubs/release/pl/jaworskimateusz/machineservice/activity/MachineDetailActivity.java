package pl.jaworskimateusz.machineservice.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020 H\u0002J\u000e\u0010$\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0012\u0010%\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\b\u0010(\u001a\u00020 H\u0002J\b\u0010)\u001a\u00020 H\u0002J\u0012\u0010*\u001a\u00020 2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0010\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020\u0007H\u0002J\u000e\u0010/\u001a\u00020 2\u0006\u0010!\u001a\u00020\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lpl/jaworskimateusz/machineservice/activity/MachineDetailActivity;", "Lpl/jaworskimateusz/machineservice/activity/base/BaseActivity;", "()V", "btnIssues", "Landroid/widget/Button;", "btnService", "code", "", "ibDownloadInstruction", "Landroid/widget/ImageView;", "iwImage", "machine", "Lpl/jaworskimateusz/machineservice/data/entity/Machine;", "machineId", "", "machineViewModel", "Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModel;", "machineViewModelFactory", "Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModelFactory;", "getMachineViewModelFactory", "()Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModelFactory;", "setMachineViewModelFactory", "(Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModelFactory;)V", "pdfView", "Lcom/github/barteksc/pdfviewer/PDFView;", "progressDialog", "Landroid/app/ProgressDialog;", "twCode", "Landroid/widget/TextView;", "twDescription", "twName", "downloadInstruction", "", "view", "Landroid/view/View;", "findViews", "makeMachineService", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setContent", "showDialog", "showPDF", "file", "Ljava/io/File;", "textToQrCode", "text", "viewMachineIssues", "Companion", "app_release"})
public final class MachineDetailActivity extends pl.jaworskimateusz.machineservice.activity.base.BaseActivity {
    private pl.jaworskimateusz.machineservice.viewmodel.MachineViewModel machineViewModel;
    private pl.jaworskimateusz.machineservice.data.entity.Machine machine;
    private android.widget.TextView twName;
    private android.widget.TextView twCode;
    private android.widget.TextView twDescription;
    private android.widget.ImageView iwImage;
    private android.widget.ImageView ibDownloadInstruction;
    private android.widget.Button btnIssues;
    private android.widget.Button btnService;
    private android.app.ProgressDialog progressDialog;
    private com.github.barteksc.pdfviewer.PDFView pdfView;
    private long machineId = 0L;
    private java.lang.String code;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public pl.jaworskimateusz.machineservice.viewmodel.MachineViewModelFactory machineViewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "Machine Detail Activity";
    public static final pl.jaworskimateusz.machineservice.activity.MachineDetailActivity.Companion Companion = null;
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
    
    private final void textToQrCode(java.lang.String text) {
    }
    
    public final void downloadInstruction(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void viewMachineIssues(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void showPDF(java.io.File file) {
    }
    
    public final void makeMachineService(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void showDialog() {
    }
    
    public MachineDetailActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lpl/jaworskimateusz/machineservice/activity/MachineDetailActivity$Companion;", "", "()V", "TAG", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}