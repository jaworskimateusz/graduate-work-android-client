package pl.jaworskimateusz.machineservice.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J\u0018\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020(H\u0002J\u0006\u0010)\u001a\u00020!J\b\u0010*\u001a\u00020!H\u0016J\u0012\u0010+\u001a\u00020!2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0006\u0010.\u001a\u00020!J\u0006\u0010/\u001a\u00020!J\b\u00100\u001a\u000201H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lpl/jaworskimateusz/machineservice/activity/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "authenticationServiceApi", "Lpl/jaworskimateusz/machineservice/services/AuthenticationServiceAPI;", "getAuthenticationServiceApi", "()Lpl/jaworskimateusz/machineservice/services/AuthenticationServiceAPI;", "setAuthenticationServiceApi", "(Lpl/jaworskimateusz/machineservice/services/AuthenticationServiceAPI;)V", "btnLogin", "Landroid/widget/Button;", "getBtnLogin", "()Landroid/widget/Button;", "setBtnLogin", "(Landroid/widget/Button;)V", "cbRememberMe", "Landroid/widget/CheckBox;", "getCbRememberMe", "()Landroid/widget/CheckBox;", "setCbRememberMe", "(Landroid/widget/CheckBox;)V", "etPassword", "Landroid/widget/EditText;", "getEtPassword", "()Landroid/widget/EditText;", "setEtPassword", "(Landroid/widget/EditText;)V", "etUsername", "getEtUsername", "setEtUsername", "sessionManager", "Lpl/jaworskimateusz/machineservice/session/SessionManager;", "createToken", "", "username", "", "password", "initSessionData", "token", "user", "Lpl/jaworskimateusz/machineservice/dto/UserDto;", "login", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLoginFailed", "onLoginSuccess", "validate", "", "app_debug"})
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private android.widget.EditText etUsername;
    @org.jetbrains.annotations.Nullable()
    private android.widget.EditText etPassword;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button btnLogin;
    @org.jetbrains.annotations.Nullable()
    private android.widget.CheckBox cbRememberMe;
    private pl.jaworskimateusz.machineservice.session.SessionManager sessionManager;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI authenticationServiceApi;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.EditText getEtUsername() {
        return null;
    }
    
    public final void setEtUsername(@org.jetbrains.annotations.Nullable()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.EditText getEtPassword() {
        return null;
    }
    
    public final void setEtPassword(@org.jetbrains.annotations.Nullable()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getBtnLogin() {
        return null;
    }
    
    public final void setBtnLogin(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.CheckBox getCbRememberMe() {
        return null;
    }
    
    public final void setCbRememberMe(@org.jetbrains.annotations.Nullable()
    android.widget.CheckBox p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI getAuthenticationServiceApi() {
        return null;
    }
    
    public final void setAuthenticationServiceApi(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI p0) {
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