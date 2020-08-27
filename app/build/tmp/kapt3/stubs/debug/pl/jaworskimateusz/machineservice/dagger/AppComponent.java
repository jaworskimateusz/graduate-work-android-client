package pl.jaworskimateusz.machineservice.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\nH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000eH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000fH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0010H&\u00a8\u0006\u0011"}, d2 = {"Lpl/jaworskimateusz/machineservice/dagger/AppComponent;", "", "inject", "", "target", "Lpl/jaworskimateusz/machineservice/MachineServiceApplication;", "Lpl/jaworskimateusz/machineservice/activity/IssueDetailActivity;", "Lpl/jaworskimateusz/machineservice/activity/IssuesActivity;", "Lpl/jaworskimateusz/machineservice/activity/LoginActivity;", "Lpl/jaworskimateusz/machineservice/activity/MachineDetailActivity;", "Lpl/jaworskimateusz/machineservice/activity/MachineServiceDetailActivity;", "Lpl/jaworskimateusz/machineservice/activity/MachinesActivity;", "Lpl/jaworskimateusz/machineservice/activity/MainActivity;", "Lpl/jaworskimateusz/machineservice/activity/ReportProblemActivity;", "Lpl/jaworskimateusz/machineservice/activity/TaskDetailActivity;", "Lpl/jaworskimateusz/machineservice/activity/TasksActivity;", "Lpl/jaworskimateusz/machineservice/activity/base/BaseActivity;", "app_debug"})
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
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.activity.TasksActivity target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.activity.TaskDetailActivity target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.activity.MachinesActivity target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.activity.MachineDetailActivity target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.activity.IssuesActivity target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.activity.IssueDetailActivity target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.activity.MachineServiceDetailActivity target);
}