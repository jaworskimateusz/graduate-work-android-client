package pl.jaworskimateusz.machineservice.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lpl/jaworskimateusz/machineservice/services/AuthenticationService;", "", "createToken", "Lretrofit2/Call;", "Lpl/jaworskimateusz/machineservice/dto/LoginResponse;", "auth", "", "body", "Lpl/jaworskimateusz/machineservice/dto/LoginCredentials;", "app_debug"})
public abstract interface AuthenticationService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/login")
    @retrofit2.http.Headers(value = {"Content-Type: application/vnd.api+json"})
    public abstract retrofit2.Call<pl.jaworskimateusz.machineservice.dto.LoginResponse> createToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    pl.jaworskimateusz.machineservice.dto.LoginCredentials body);
}