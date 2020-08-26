package pl.jaworskimateusz.machineservice.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J(\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\fH\'J(\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\fH\'J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0006H\'J2\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\fH\'J,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010\u0015\u001a\u00020\u000eH\'\u00a8\u0006\u0016"}, d2 = {"Lpl/jaworskimateusz/machineservice/services/MachineService;", "", "downloadFile", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "fileUrl", "", "downloadMachines", "", "Lpl/jaworskimateusz/machineservice/dto/MachineDto;", "auth", "userId", "", "getIssues", "Lpl/jaworskimateusz/machineservice/dto/IssueDto;", "page", "getMachineByCode", "code", "getMachineIssues", "machineId", "saveOrUpdateIssue", "issue", "app_debug"})
public abstract interface MachineService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/users/{userId}/machines")
    @retrofit2.http.Headers(value = {"Content-Type: application/vnd.api+json"})
    public abstract retrofit2.Call<java.util.List<pl.jaworskimateusz.machineservice.dto.MachineDto>> downloadMachines(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @retrofit2.http.Path(value = "userId")
    long userId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/machines")
    @retrofit2.http.Headers(value = {"Content-Type: application/vnd.api+json"})
    public abstract retrofit2.Call<pl.jaworskimateusz.machineservice.dto.MachineDto> getMachineByCode(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "code")
    java.lang.String code);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET()
    @retrofit2.http.Streaming()
    public abstract retrofit2.Call<okhttp3.ResponseBody> downloadFile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String fileUrl);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/machines/{machineId}/issues")
    @retrofit2.http.Headers(value = {"Content-Type: application/vnd.api+json"})
    public abstract retrofit2.Call<java.util.List<pl.jaworskimateusz.machineservice.dto.IssueDto>> getMachineIssues(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @retrofit2.http.Path(value = "machineId")
    long machineId, @retrofit2.http.Query(value = "page")
    long page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/issues")
    @retrofit2.http.Headers(value = {"Content-Type: application/vnd.api+json"})
    public abstract retrofit2.Call<java.util.List<pl.jaworskimateusz.machineservice.dto.IssueDto>> getIssues(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @retrofit2.http.Query(value = "page")
    long page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/machines/{machineId}/issues")
    @retrofit2.http.Streaming()
    @retrofit2.http.Headers(value = {"Content-Type: application/vnd.api+json"})
    public abstract retrofit2.Call<pl.jaworskimateusz.machineservice.dto.IssueDto> saveOrUpdateIssue(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String auth, @retrofit2.http.Path(value = "machineId")
    long machineId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    pl.jaworskimateusz.machineservice.dto.IssueDto issue);
}