package pl.jaworskimateusz.machineservice.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\nJ\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\n2\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u0016\u001a\u00020\rJ\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\n2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lpl/jaworskimateusz/machineservice/services/MachineServiceAPI;", "", "retrofit", "Lretrofit2/Retrofit;", "sessionManager", "Lpl/jaworskimateusz/machineservice/session/SessionManager;", "(Lretrofit2/Retrofit;Lpl/jaworskimateusz/machineservice/session/SessionManager;)V", "machineService", "Lpl/jaworskimateusz/machineservice/services/MachineService;", "downloadFile", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "fileUrl", "", "downloadMachines", "", "Lpl/jaworskimateusz/machineservice/dto/MachineDto;", "getIssues", "Lpl/jaworskimateusz/machineservice/dto/IssueDto;", "page", "", "getMachineByCode", "code", "getMachineIssues", "machineId", "saveOrUpdateIssue", "issueDto", "app_debug"})
public final class MachineServiceAPI {
    private pl.jaworskimateusz.machineservice.services.MachineService machineService;
    private pl.jaworskimateusz.machineservice.session.SessionManager sessionManager;
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<pl.jaworskimateusz.machineservice.dto.MachineDto>> downloadMachines() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<pl.jaworskimateusz.machineservice.dto.MachineDto> getMachineByCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<okhttp3.ResponseBody> downloadFile(@org.jetbrains.annotations.NotNull()
    java.lang.String fileUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<pl.jaworskimateusz.machineservice.dto.IssueDto>> getMachineIssues(long machineId, long page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<pl.jaworskimateusz.machineservice.dto.IssueDto>> getIssues(long page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<pl.jaworskimateusz.machineservice.dto.IssueDto> saveOrUpdateIssue(long machineId, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.dto.IssueDto issueDto) {
        return null;
    }
    
    public MachineServiceAPI(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.session.SessionManager sessionManager) {
        super();
    }
}