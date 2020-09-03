package pl.jaworskimateusz.machineservice.data.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import pl.jaworskimateusz.machineservice.data.entity.Task;
import pl.jaworskimateusz.machineservice.data.entity.User;
import pl.jaworskimateusz.machineservice.data.entity.UserTask;
import pl.jaworskimateusz.machineservice.utilities.Converters;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class TaskDao_Impl implements TaskDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfTask;

  private final Converters __converters = new Converters();

  private final EntityInsertionAdapter __insertionAdapterOfUserTask;

  private final EntityInsertionAdapter __insertionAdapterOfUser;

  public TaskDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTask = new EntityInsertionAdapter<Task>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `tasks`(`taskId`,`title`,`description`,`date`,`solved`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Task value) {
        stmt.bindLong(1, value.getTaskId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp);
        }
        stmt.bindLong(5, value.getSolved());
      }
    };
    this.__insertionAdapterOfUserTask = new EntityInsertionAdapter<UserTask>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `users_tasks`(`userId`,`taskId`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserTask value) {
        stmt.bindLong(1, value.getUserId());
        stmt.bindLong(2, value.getTaskId());
      }
    };
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `users`(`userId`,`username`,`firstName`,`lastName`,`password`,`phoneNumber`,`role`,`enabled`,`department`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getUserId());
        if (value.getUsername() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUsername());
        }
        if (value.getFirstName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFirstName());
        }
        if (value.getLastName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLastName());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPassword());
        }
        stmt.bindLong(6, value.getPhoneNumber());
        if (value.getRole() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getRole());
        }
        stmt.bindLong(8, value.getEnabled());
        if (value.getDepartment() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getDepartment());
        }
      }
    };
  }

  @Override
  public void insertAllTasks(final List<Task> tasks) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfTask.insert(tasks);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertUserTask(final UserTask userTask) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserTask.insert(userTask);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final Task item) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfTask.insert(item);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final User item) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUser.insert(item);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Task>> getAllTasksLiveData() {
    final String _sql = "SELECT * FROM tasks ORDER BY date";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"tasks"}, new Callable<List<Task>>() {
      @Override
      public List<Task> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfSolved = CursorUtil.getColumnIndexOrThrow(_cursor, "solved");
          final List<Task> _result = new ArrayList<Task>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Task _item;
            final long _tmpTaskId;
            _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final Date _tmpDate;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __converters.fromTimeStamp(_tmp);
            final int _tmpSolved;
            _tmpSolved = _cursor.getInt(_cursorIndexOfSolved);
            _item = new Task(_tmpTaskId,_tmpTitle,_tmpDescription,_tmpDate,_tmpSolved);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<Task>> getAllTasksByDatesLiveData(final long userId, final Date dateFrom,
      final Date dateTo, final int solved) {
    final String _sql = "SELECT t.taskId, t.title, t.description, t.date, t.solved \n"
            + "             FROM tasks AS t \n"
            + "             JOIN users_tasks AS ut USING (taskId)\n"
            + "             WHERE (t.date BETWEEN ? AND ?) \n"
            + "             AND t.solved = ?\n"
            + "             AND ut.userId = ?\n"
            + "             ORDER BY t.date";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    final Long _tmp;
    _tmp = __converters.dateToTimestamp(dateFrom);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp);
    }
    _argIndex = 2;
    final Long _tmp_1;
    _tmp_1 = __converters.dateToTimestamp(dateTo);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp_1);
    }
    _argIndex = 3;
    _statement.bindLong(_argIndex, solved);
    _argIndex = 4;
    _statement.bindLong(_argIndex, userId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"tasks","users_tasks"}, new Callable<List<Task>>() {
      @Override
      public List<Task> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfSolved = CursorUtil.getColumnIndexOrThrow(_cursor, "solved");
          final List<Task> _result = new ArrayList<Task>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Task _item;
            final long _tmpTaskId;
            _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final Date _tmpDate;
            final Long _tmp_2;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(_cursorIndexOfDate);
            }
            _tmpDate = __converters.fromTimeStamp(_tmp_2);
            final int _tmpSolved;
            _tmpSolved = _cursor.getInt(_cursorIndexOfSolved);
            _item = new Task(_tmpTaskId,_tmpTitle,_tmpDescription,_tmpDate,_tmpSolved);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<Task> getAllTasks() {
    final String _sql = "SELECT * FROM tasks ORDER BY date";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfSolved = CursorUtil.getColumnIndexOrThrow(_cursor, "solved");
      final List<Task> _result = new ArrayList<Task>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Task _item;
        final long _tmpTaskId;
        _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final Date _tmpDate;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfDate);
        }
        _tmpDate = __converters.fromTimeStamp(_tmp);
        final int _tmpSolved;
        _tmpSolved = _cursor.getInt(_cursorIndexOfSolved);
        _item = new Task(_tmpTaskId,_tmpTitle,_tmpDescription,_tmpDate,_tmpSolved);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Date getMaxTaskDate(final long userId) {
    final String _sql = "SELECT MAX(date) FROM tasks JOIN users_tasks AS ut USING (taskId) WHERE ut.userId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userId);
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final Date _result;
      if(_cursor.moveToFirst()) {
        final Long _tmp;
        if (_cursor.isNull(0)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(0);
        }
        _result = __converters.fromTimeStamp(_tmp);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Task getTaskById(final long taskId) {
    final String _sql = "SELECT * FROM tasks WHERE taskId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, taskId);
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "taskId");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfSolved = CursorUtil.getColumnIndexOrThrow(_cursor, "solved");
      final Task _result;
      if(_cursor.moveToFirst()) {
        final long _tmpTaskId;
        _tmpTaskId = _cursor.getLong(_cursorIndexOfTaskId);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final Date _tmpDate;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfDate);
        }
        _tmpDate = __converters.fromTimeStamp(_tmp);
        final int _tmpSolved;
        _tmpSolved = _cursor.getInt(_cursorIndexOfSolved);
        _result = new Task(_tmpTaskId,_tmpTitle,_tmpDescription,_tmpDate,_tmpSolved);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
