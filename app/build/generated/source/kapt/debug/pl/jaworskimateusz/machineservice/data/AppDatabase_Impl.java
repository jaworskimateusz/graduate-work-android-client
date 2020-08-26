package pl.jaworskimateusz.machineservice.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;
import pl.jaworskimateusz.machineservice.data.dao.MachineDao;
import pl.jaworskimateusz.machineservice.data.dao.MachineDao_Impl;
import pl.jaworskimateusz.machineservice.data.dao.TaskDao;
import pl.jaworskimateusz.machineservice.data.dao.TaskDao_Impl;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class AppDatabase_Impl extends AppDatabase {
  private volatile TaskDao _taskDao;

  private volatile MachineDao _machineDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `users` (`user_id` INTEGER NOT NULL, `username` TEXT NOT NULL, PRIMARY KEY(`user_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tasks` (`taskId` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `date` INTEGER NOT NULL, `solved` INTEGER NOT NULL, PRIMARY KEY(`taskId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `machines` (`machineId` INTEGER NOT NULL, `name` TEXT NOT NULL, `code` TEXT NOT NULL, `description` TEXT NOT NULL, `image` TEXT, `serviceInstruction` TEXT NOT NULL, PRIMARY KEY(`machineId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `issues` (`issueId` INTEGER, `keywords` TEXT NOT NULL, `description` TEXT NOT NULL, `solution` TEXT, `workerSignature` TEXT NOT NULL, `machineId` INTEGER NOT NULL, PRIMARY KEY(`issueId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"6c7e66d7d8bb37e07374f43a93e97696\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `users`");
        _db.execSQL("DROP TABLE IF EXISTS `tasks`");
        _db.execSQL("DROP TABLE IF EXISTS `machines`");
        _db.execSQL("DROP TABLE IF EXISTS `issues`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUsers = new HashMap<String, TableInfo.Column>(2);
        _columnsUsers.put("user_id", new TableInfo.Column("user_id", "INTEGER", true, 1));
        _columnsUsers.put("username", new TableInfo.Column("username", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUsers = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUsers = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUsers = new TableInfo("users", _columnsUsers, _foreignKeysUsers, _indicesUsers);
        final TableInfo _existingUsers = TableInfo.read(_db, "users");
        if (! _infoUsers.equals(_existingUsers)) {
          throw new IllegalStateException("Migration didn't properly handle users(pl.jaworskimateusz.machineservice.data.entity.User).\n"
                  + " Expected:\n" + _infoUsers + "\n"
                  + " Found:\n" + _existingUsers);
        }
        final HashMap<String, TableInfo.Column> _columnsTasks = new HashMap<String, TableInfo.Column>(5);
        _columnsTasks.put("taskId", new TableInfo.Column("taskId", "INTEGER", true, 1));
        _columnsTasks.put("title", new TableInfo.Column("title", "TEXT", true, 0));
        _columnsTasks.put("description", new TableInfo.Column("description", "TEXT", true, 0));
        _columnsTasks.put("date", new TableInfo.Column("date", "INTEGER", true, 0));
        _columnsTasks.put("solved", new TableInfo.Column("solved", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTasks = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTasks = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTasks = new TableInfo("tasks", _columnsTasks, _foreignKeysTasks, _indicesTasks);
        final TableInfo _existingTasks = TableInfo.read(_db, "tasks");
        if (! _infoTasks.equals(_existingTasks)) {
          throw new IllegalStateException("Migration didn't properly handle tasks(pl.jaworskimateusz.machineservice.data.entity.Task).\n"
                  + " Expected:\n" + _infoTasks + "\n"
                  + " Found:\n" + _existingTasks);
        }
        final HashMap<String, TableInfo.Column> _columnsMachines = new HashMap<String, TableInfo.Column>(6);
        _columnsMachines.put("machineId", new TableInfo.Column("machineId", "INTEGER", true, 1));
        _columnsMachines.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsMachines.put("code", new TableInfo.Column("code", "TEXT", true, 0));
        _columnsMachines.put("description", new TableInfo.Column("description", "TEXT", true, 0));
        _columnsMachines.put("image", new TableInfo.Column("image", "TEXT", false, 0));
        _columnsMachines.put("serviceInstruction", new TableInfo.Column("serviceInstruction", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMachines = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMachines = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMachines = new TableInfo("machines", _columnsMachines, _foreignKeysMachines, _indicesMachines);
        final TableInfo _existingMachines = TableInfo.read(_db, "machines");
        if (! _infoMachines.equals(_existingMachines)) {
          throw new IllegalStateException("Migration didn't properly handle machines(pl.jaworskimateusz.machineservice.data.entity.Machine).\n"
                  + " Expected:\n" + _infoMachines + "\n"
                  + " Found:\n" + _existingMachines);
        }
        final HashMap<String, TableInfo.Column> _columnsIssues = new HashMap<String, TableInfo.Column>(6);
        _columnsIssues.put("issueId", new TableInfo.Column("issueId", "INTEGER", false, 1));
        _columnsIssues.put("keywords", new TableInfo.Column("keywords", "TEXT", true, 0));
        _columnsIssues.put("description", new TableInfo.Column("description", "TEXT", true, 0));
        _columnsIssues.put("solution", new TableInfo.Column("solution", "TEXT", false, 0));
        _columnsIssues.put("workerSignature", new TableInfo.Column("workerSignature", "TEXT", true, 0));
        _columnsIssues.put("machineId", new TableInfo.Column("machineId", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysIssues = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesIssues = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoIssues = new TableInfo("issues", _columnsIssues, _foreignKeysIssues, _indicesIssues);
        final TableInfo _existingIssues = TableInfo.read(_db, "issues");
        if (! _infoIssues.equals(_existingIssues)) {
          throw new IllegalStateException("Migration didn't properly handle issues(pl.jaworskimateusz.machineservice.data.entity.Issue).\n"
                  + " Expected:\n" + _infoIssues + "\n"
                  + " Found:\n" + _existingIssues);
        }
      }
    }, "6c7e66d7d8bb37e07374f43a93e97696", "bae8fee2dad95825ecc63f8bbdb87a3e");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "users","tasks","machines","issues");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `users`");
      _db.execSQL("DELETE FROM `tasks`");
      _db.execSQL("DELETE FROM `machines`");
      _db.execSQL("DELETE FROM `issues`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public TaskDao taskDao() {
    if (_taskDao != null) {
      return _taskDao;
    } else {
      synchronized(this) {
        if(_taskDao == null) {
          _taskDao = new TaskDao_Impl(this);
        }
        return _taskDao;
      }
    }
  }

  @Override
  public MachineDao machineDao() {
    if (_machineDao != null) {
      return _machineDao;
    } else {
      synchronized(this) {
        if(_machineDao == null) {
          _machineDao = new MachineDao_Impl(this);
        }
        return _machineDao;
      }
    }
  }
}
