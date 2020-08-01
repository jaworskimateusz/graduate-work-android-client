package pl.jaworskimateusz.machineservice.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lpl/jaworskimateusz/machineservice/dagger/AppComponent;", "", "inject", "", "target", "Lpl/jaworskimateusz/machineservice/MachineServiceApplication;", "Lpl/jaworskimateusz/machineservice/activity/LoginActivity;", "Lpl/jaworskimateusz/machineservice/activity/MainActivity;", "Lpl/jaworskimateusz/machineservice/activity/ReportProblemActivity;", "Lpl/jaworskimateusz/machineservice/activity/base/BaseActivity;", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, pl.jaworskimateusz.machineservice.dagger.AppModule.class, pl.jaworskimateusz.machineservice.dagger.PresenterModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.activity.base.BaseActivity target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.activity.MainActivity target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.MachineServiceApplication target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.activity.LoginActivity target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.activity.ReportProblemActivity target);
}