package pl.jaworskimateusz.machineservice.data;

import java.lang.System;

/**
 * The Room database for this app
 */
@androidx.room.TypeConverters(value = {pl.jaworskimateusz.machineservice.utilities.Converters.class})
@androidx.room.Database(entities = {pl.jaworskimateusz.machineservice.data.entity.User.class, pl.jaworskimateusz.machineservice.data.entity.Task.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lpl/jaworskimateusz/machineservice/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "taskDao", "Lpl/jaworskimateusz/machineservice/data/dao/TaskDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    private static volatile pl.jaworskimateusz.machineservice.data.AppDatabase instance;
    public static final pl.jaworskimateusz.machineservice.data.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract pl.jaworskimateusz.machineservice.data.dao.TaskDao taskDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lpl/jaworskimateusz/machineservice/data/AppDatabase$Companion;", "", "()V", "instance", "Lpl/jaworskimateusz/machineservice/data/AppDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final pl.jaworskimateusz.machineservice.data.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final pl.jaworskimateusz.machineservice.data.AppDatabase buildDatabase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}