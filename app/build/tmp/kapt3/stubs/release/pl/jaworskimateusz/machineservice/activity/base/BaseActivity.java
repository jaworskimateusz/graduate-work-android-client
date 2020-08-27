package pl.jaworskimateusz.machineservice.activity.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0012J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0004@\u0004X\u0085.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006$"}, d2 = {"Lpl/jaworskimateusz/machineservice/activity/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "authenticationServiceApi", "Lpl/jaworskimateusz/machineservice/services/AuthenticationServiceAPI;", "getAuthenticationServiceApi", "()Lpl/jaworskimateusz/machineservice/services/AuthenticationServiceAPI;", "setAuthenticationServiceApi", "(Lpl/jaworskimateusz/machineservice/services/AuthenticationServiceAPI;)V", "mDrawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "sessionManager", "Lpl/jaworskimateusz/machineservice/session/SessionManager;", "getSessionManager", "()Lpl/jaworskimateusz/machineservice/session/SessionManager;", "setSessionManager", "(Lpl/jaworskimateusz/machineservice/session/SessionManager;)V", "dataSendFailed", "", "dataSendSuccess", "initDrawerLayout", "makeToast", "text", "", "noInternetConnection", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onError", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "startActivityWithIntent", "intent", "Landroid/content/Intent;", "app_release"})
public class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.drawerlayout.widget.DrawerLayout mDrawerLayout;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    protected pl.jaworskimateusz.machineservice.session.SessionManager sessionManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI authenticationServiceApi;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final pl.jaworskimateusz.machineservice.session.SessionManager getSessionManager() {
        return null;
    }
    
    protected final void setSessionManager(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.session.SessionManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI getAuthenticationServiceApi() {
        return null;
    }
    
    public final void setAuthenticationServiceApi(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void initDrawerLayout() {
    }
    
    private final void startActivityWithIntent(android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void noInternetConnection() {
    }
    
    public final void dataSendSuccess() {
    }
    
    public final void dataSendFailed() {
    }
    
    public final void onError(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void makeToast(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public BaseActivity() {
        super();
    }
}