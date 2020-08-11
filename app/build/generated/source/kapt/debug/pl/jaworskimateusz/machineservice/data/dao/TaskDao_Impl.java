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
import pl.jaworskimateusz.machineservice.utilities.Converters;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class TaskDao_Impl implements TaskDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfTask;

  private final Converters __converters = new Converters();

  public TaskDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTask = new EntityInsertionAdapter<Task>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `tasks`(`task_id`,`title`,`description`,`date`,`solved`) VALUES (?,?,?,?,?)";
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
  public LiveData<List<Task>> getAllTasksLiveData() {
    final String _sql = "SELECT * FROM tasks ORDER BY date";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"tasks"}, new Callable<List<Task>>() {
      @Override
      public List<Task> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "task_id");
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
  public List<Task> getAllTasks() {
    final String _sql = "SELECT * FROM tasks ORDER BY date";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfTaskId = CursorUtil.getColumnIndexOrThrow(_cursor, "task_id");
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
}