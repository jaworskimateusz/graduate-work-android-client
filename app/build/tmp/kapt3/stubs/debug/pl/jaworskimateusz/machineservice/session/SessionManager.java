package pl.jaworskimateusz.machineservice.session;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0001,B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\'\u001a\u00020(2\u0006\u0010#\u001a\u00020$2\u0006\u0010)\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010!\u001a\u00020\fJ\u0006\u0010*\u001a\u00020(J\b\u0010+\u001a\u00020(H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0014\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u000eR$\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00108F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u000eR\u0011\u0010#\u001a\u00020$8F\u00a2\u0006\u0006\u001a\u0004\b%\u0010&\u00a8\u0006-"}, d2 = {"Lpl/jaworskimateusz/machineservice/session/SessionManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "editor", "Landroid/content/SharedPreferences$Editor;", "getEditor$app_debug", "()Landroid/content/SharedPreferences$Editor;", "setEditor$app_debug", "(Landroid/content/SharedPreferences$Editor;)V", "fullName", "", "getFullName", "()Ljava/lang/String;", "isLoggedIn", "", "()Z", "login", "getLogin", "password", "getPassword", "value", "rememberMe", "getRememberMe", "setRememberMe", "(Z)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences$app_debug", "()Landroid/content/SharedPreferences;", "setSharedPreferences$app_debug", "(Landroid/content/SharedPreferences;)V", "token", "getToken", "userId", "", "getUserId", "()J", "logIn", "", "username", "logout", "startLoginActivity", "Companion", "app_debug"})
public final class SessionManager {
    @org.jetbrains.annotations.NotNull()
    private android.content.SharedPreferences sharedPreferences;
    @org.jetbrains.annotations.NotNull()
    private android.content.SharedPreferences.Editor editor;
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_LOGGED_IN = "isLoggedIn";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOKEN = "TokenKey";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REMEMBER_ME = "RememberMe";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USERNAME = "Username";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PASSWORD = "Password";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FULL_NAME = "FullName";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_ID = "UserId";
    public static final pl.jaworskimateusz.machineservice.session.SessionManager.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPreferences$app_debug() {
        return null;
    }
    
    public final void setSharedPreferences$app_debug(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences.Editor getEditor$app_debug() {
        return null;
    }
    
    public final void setEditor$app_debug(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.Editor p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLogin() {
        return null;
    }
    
    public final long getUserId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFullName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final boolean isLoggedIn() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final boolean getRememberMe() {
        return false;
    }
    
    public final void setRememberMe(boolean value) {
    }
    
    public final void logIn(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String fullName, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public final void logout() {
    }
    
    private final void startLoginActivity() {
    }
    
    public SessionManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lpl/jaworskimateusz/machineservice/session/SessionManager$Companion;", "", "()V", "FULL_NAME", "", "IS_LOGGED_IN", "PASSWORD", "REMEMBER_ME", "TOKEN", "USERNAME", "USER_ID", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}