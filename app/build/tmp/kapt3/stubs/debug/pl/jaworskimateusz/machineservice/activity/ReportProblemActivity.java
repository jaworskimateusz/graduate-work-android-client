package pl.jaworskimateusz.machineservice.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lpl/jaworskimateusz/machineservice/activity/ReportProblemActivity;", "Lpl/jaworskimateusz/machineservice/activity/base/BaseActivity;", "()V", "etKeywords", "Landroid/widget/TextView;", "etProblemDescription", "userServiceAPI", "Lpl/jaworskimateusz/machineservice/services/UserServiceAPI;", "getUserServiceAPI", "()Lpl/jaworskimateusz/machineservice/services/UserServiceAPI;", "setUserServiceAPI", "(Lpl/jaworskimateusz/machineservice/services/UserServiceAPI;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "sendProblem", "view", "Landroid/view/View;", "app_debug"})
public final class ReportProblemActivity extends pl.jaworskimateusz.machineservice.activity.base.BaseActivity {
    private android.widget.TextView etProblemDescription;
    private android.widget.TextView etKeywords;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public pl.jaworskimateusz.machineservice.services.UserServiceAPI userServiceAPI;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final pl.jaworskimateusz.machineservice.services.UserServiceAPI getUserServiceAPI() {
        return null;
    }
    
    public final void setUserServiceAPI(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.services.UserServiceAPI p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void sendProblem(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public ReportProblemActivity() {
        super();
    }
}