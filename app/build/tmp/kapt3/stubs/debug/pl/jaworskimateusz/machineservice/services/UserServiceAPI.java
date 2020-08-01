package pl.jaworskimateusz.machineservice.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lpl/jaworskimateusz/machineservice/services/UserServiceAPI;", "", "retrofit", "Lretrofit2/Retrofit;", "sessionManager", "Lpl/jaworskimateusz/machineservice/session/SessionManager;", "(Lretrofit2/Retrofit;Lpl/jaworskimateusz/machineservice/session/SessionManager;)V", "userService", "Lpl/jaworskimateusz/machineservice/services/UserService;", "reportApplicationProblem", "Lretrofit2/Call;", "Lpl/jaworskimateusz/machineservice/dto/ApplicationProblemDto;", "keywords", "", "description", "app_debug"})
public final class UserServiceAPI {
    private pl.jaworskimateusz.machineservice.services.UserService userService;
    private pl.jaworskimateusz.machineservice.session.SessionManager sessionManager;
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<pl.jaworskimateusz.machineservice.dto.ApplicationProblemDto> reportApplicationProblem(@org.jetbrains.annotations.NotNull()
    java.lang.String keywords, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
        return null;
    }
    
    public UserServiceAPI(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.session.SessionManager sessionManager) {
        super();
    }
}