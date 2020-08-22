package pl.jaworskimateusz.machineservice.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0014H\u0007J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u00a8\u0006!"}, d2 = {"Lpl/jaworskimateusz/machineservice/dagger/PresenterModule;", "", "()V", "provideAuthenticationServiceApi", "Lpl/jaworskimateusz/machineservice/services/AuthenticationServiceAPI;", "retrofit", "Lretrofit2/Retrofit;", "provideMachineListViewModelFactory", "Lpl/jaworskimateusz/machineservice/viewmodel/MachineViewModelFactory;", "machineRepository", "Lpl/jaworskimateusz/machineservice/data/repository/MachineRepository;", "provideMachineRepository", "context", "Landroid/content/Context;", "sessionManager", "Lpl/jaworskimateusz/machineservice/session/SessionManager;", "machineServiceAPI", "Lpl/jaworskimateusz/machineservice/services/MachineServiceAPI;", "provideMachineServiceAPI", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideRetrofit", "okHttpClient", "provideSessionManager", "provideTaskListViewModelFactory", "Lpl/jaworskimateusz/machineservice/viewmodel/TaskViewModelFactory;", "taskRepository", "Lpl/jaworskimateusz/machineservice/data/repository/TaskRepository;", "provideTaskRepository", "userServiceAPI", "Lpl/jaworskimateusz/machineservice/services/UserServiceAPI;", "provideUserServiceAPI", "Companion", "app_debug"})
@dagger.Module()
public final class PresenterModule {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "http://10.0.2.2:8080";
    public static final pl.jaworskimateusz.machineservice.dagger.PresenterModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final pl.jaworskimateusz.machineservice.services.AuthenticationServiceAPI provideAuthenticationServiceApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final pl.jaworskimateusz.machineservice.services.UserServiceAPI provideUserServiceAPI(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.session.SessionManager sessionManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final pl.jaworskimateusz.machineservice.services.MachineServiceAPI provideMachineServiceAPI(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.session.SessionManager sessionManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final pl.jaworskimateusz.machineservice.session.SessionManager provideSessionManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final pl.jaworskimateusz.machineservice.data.repository.TaskRepository provideTaskRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.session.SessionManager sessionManager, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.services.UserServiceAPI userServiceAPI) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final pl.jaworskimateusz.machineservice.data.repository.MachineRepository provideMachineRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.session.SessionManager sessionManager, @org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.services.MachineServiceAPI machineServiceAPI) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final pl.jaworskimateusz.machineservice.viewmodel.TaskViewModelFactory provideTaskListViewModelFactory(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.repository.TaskRepository taskRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final pl.jaworskimateusz.machineservice.viewmodel.MachineViewModelFactory provideMachineListViewModelFactory(@org.jetbrains.annotations.NotNull()
    pl.jaworskimateusz.machineservice.data.repository.MachineRepository machineRepository) {
        return null;
    }
    
    public PresenterModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lpl/jaworskimateusz/machineservice/dagger/PresenterModule$Companion;", "", "()V", "BASE_URL", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}