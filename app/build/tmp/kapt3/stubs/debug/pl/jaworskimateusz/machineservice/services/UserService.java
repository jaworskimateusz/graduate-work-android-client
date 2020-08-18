package pl.jaworskimateusz.machineservice.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0007H\'J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\fH\'\u00a8\u0006\u000e"}, d2 = {"Lpl/jaworskimateusz/machineservice/services/UserService;", "", "downloadTasks", "Lretrofit2/Call;", "", "Lpl/jaworskimateusz/machineservice/dto/TaskDto;", "auth", "", "userId", "", "date", "reportApplicationProblem", "Lpl/jaworskimateusz/machineservice/dto/ApplicationProblemDto;", "body", "app_debug"})
public abstract interface UserService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/application-problems")
    @retrofit2.http.Headers(value = {"Content-Type: application/vnd.api+json"})
    public abstract retrofit2.Call<pl.jaworskimateusz.machineservice.dto.ApplicationProblemDto> reportApplicationProblem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    pl.jaworskimateusz.machineservice.dto.ApplicationProblemDto body);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/users/{userId}/tasks")
    @retrofit2.http.Headers(value = {"Content-Type: application/vnd.api+json"})
    public abstract retrofit2.Call<java.util.List<pl.jaworskimateusz.machineservice.dto.TaskDto>> downloadTasks(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @retrofit2.http.Path(value = "userId")
    long userId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "date")
    java.lang.String date);
}