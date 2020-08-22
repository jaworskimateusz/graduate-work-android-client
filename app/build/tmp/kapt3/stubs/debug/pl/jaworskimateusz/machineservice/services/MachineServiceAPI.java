package pl.jaworskimateusz.machineservice.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lpl/jaworskimateusz/machineservice/services/MachineServiceAPI;", "", "retrofit", "Lretrofit2/Retrofit;", "sessionManager", "Lpl/jaworskimateusz/machineservice/session/SessionManager;", "(Lretrofit2/Retrofit;Lpl/jaworskimateusz/machineservice/session/SessionManager;)V", "machineService", "Lpl/jaworskimateusz/machineservice/services/MachineService;", "downloadMachines", "Lretrofit2/Call;", "", "Lpl/jaworskimateusz/machineservice/dto/MachineDto;", "app_debug"})
public final class MachineServiceAPI {
    private pl.jaworskimateusz.machineservice.services.MachineService machineService;
    private pl.jaworskimateusz.machineservice.session.SessionManager sessionManager;
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<java.util.List<pl.jaworskimateusz.machineservice.dto.MachineDto>> downloadMachines() {
        return null;
    }
    
    public MachineServiceAPI(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.session.SessionManager sessionManager) {
        super();
    }
}