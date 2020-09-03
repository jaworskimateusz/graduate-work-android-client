package pl.jaworskimateusz.machineservice.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0006\u0010!\u001a\u00020\u0019J\b\u0010\"\u001a\u00020\u0019H\u0016J\u0012\u0010#\u001a\u00020\u00192\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0006\u0010&\u001a\u00020\u0019J\u0006\u0010\'\u001a\u00020\u0019J\b\u0010(\u001a\u00020)H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006*"}, d2 = {"Lpl/jaworskimateusz/machineservice/activity/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "authenticationServiceApi", "Lpl/jaworskimateusz/machineservice/services/AuthenticationServiceAPI;", "getAuthenticationServiceApi", "()Lpl/jaworskimateusz/machineservice/services/AuthenticationServiceAPI;", "setAuthenticationServiceApi", "(Lpl/jaworskimateusz/machineservice/services/AuthenticationServiceAPI;)V", "btnLogin", "Landroid/widget/Button;", "etPassword", "Landroid/widget/EditText;", "etUsername", "loadingDialog", "Landroid/app/ProgressDialog;", "sessionManager", "Lpl/jaworskimateusz/machineservice/session/SessionManager;", "taskRepository", "Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository;", "getTaskRepository", "()Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository;", "setTaskRepository", "(Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository;)V", "createToken", "", "username", "", "password", "initSessionData", "token", "user", "Lpl/jaworskimateusz/machineservice/dto/UserDto;", "login", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLoginFailed", "onLoginSuccess", "validate", "", "app_debug"})
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.EditText etUsername;
    private android.widget.EditText etPassword;
    private android.widget.Button btnLogin;
    private android.app.ProgressDialog loadingDialog;
    private pl.jaworskimateusz.machineservice.session.SessionManager sessionManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI authenticationServiceApi;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public pl.jaworskimateusz.machineservice.data.repository.TaskRepository taskRepository;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI getAuthenticationServiceApi() {
        return null;
    }
    
    public final void setAuthenticationServiceApi(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pl.jaworskimateusz.machineservice.data.repository.TaskRepository getTaskRepository() {
        return null;
    }
    
    public final void setTaskRepository(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.repository.TaskRepository p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void login() {
    }
    
    private final void createToken(java.lang.String username, java.lang.String password) {
    }
    
    private final void initSessionData(java.lang.String token, pl.jaworskimateusz.machineservice.dto.UserDto user) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final boolean validate() {
        return false;
    }
    
    public final void onLoginSuccess() {
    }
    
    public final void onLoginFailed() {
    }
    
    public LoginActivity() {
        super();
    }
}