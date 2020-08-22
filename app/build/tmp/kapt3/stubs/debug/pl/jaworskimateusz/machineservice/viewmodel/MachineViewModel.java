package pl.jaworskimateusz.machineservice.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0012\u001a\u00020\rH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModel;", "Landroidx/lifecycle/ViewModel;", "machineRepository", "Lpl/jaworskimateusz/machineservice/data/repository/MachineRepository;", "(Lpl/jaworskimateusz/machineservice/data/repository/MachineRepository;)V", "machineList", "Landroidx/lifecycle/LiveData;", "", "Lpl/jaworskimateusz/machineservice/data/entity/Machine;", "getMachineRepository", "()Lpl/jaworskimateusz/machineservice/data/repository/MachineRepository;", "mutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModel$SearchingParams;", "getMachines", "getMachinesByName", "name", "", "params", "SearchingParams", "app_debug"})
public final class MachineViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<pl.jaworskimateusz.machineservice.viewmodel.MachineViewModel.SearchingParams> mutableLiveData = null;
    private final androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Machine>> machineList = null;
    @org.jetbrains.annotations.NotNull()
    private final pl.jaworskimateusz.machineservice.data.repository.MachineRepository machineRepository = null;
    
    private final androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Machine>> getMachinesByName(pl.jaworskimateusz.machineservice.viewmodel.MachineViewModel.SearchingParams params) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pl.jaworskimateusz.machineservice.viewmodel.MachineViewModel getMachinesByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<pl.jaworskimateusz.machineservice.data.entity.Machine>> getMachines() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final pl.jaworskimateusz.machineservice.data.repository.MachineRepository getMachineRepository() {
        return null;
    }
    
    public MachineViewModel(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.repository.MachineRepository machineRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModel$SearchingParams;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class SearchingParams {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        public SearchingParams(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final pl.jaworskimateusz.machineservice.viewmodel.MachineViewModel.SearchingParams copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}