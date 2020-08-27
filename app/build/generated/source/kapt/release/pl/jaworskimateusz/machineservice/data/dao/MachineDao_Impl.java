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
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import pl.jaworskimateusz.machineservice.data.entity.Issue;
import pl.jaworskimateusz.machineservice.data.entity.Machine;
import pl.jaworskimateusz.machineservice.data.entity.Service;
import pl.jaworskimateusz.machineservice.utilities.Converters;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class MachineDao_Impl implements MachineDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfMachine;

  private final EntityInsertionAdapter __insertionAdapterOfIssue;

  private final EntityInsertionAdapter __insertionAdapterOfService;

  private final Converters __converters = new Converters();

  public MachineDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMachine = new EntityInsertionAdapter<Machine>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `machines`(`machineId`,`name`,`code`,`description`,`image`,`serviceInstruction`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Machine value) {
        stmt.bindLong(1, value.getMachineId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getCode() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCode());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getImage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImage());
        }
        if (value.getServiceInstruction() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getServiceInstruction());
        }
      }
    };
    this.__insertionAdapterOfIssue = new EntityInsertionAdapter<Issue>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `issues`(`issueId`,`keywords`,`description`,`solution`,`workerSignature`,`machineId`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Issue value) {
        if (value.getIssueId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getIssueId());
        }
        if (value.getKeywords() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getKeywords());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getSolution() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSolution());
        }
        if (value.getWorkerSignature() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getWorkerSignature());
        }
        stmt.bindLong(6, value.getMachineId());
      }
    };
    this.__insertionAdapterOfService = new EntityInsertionAdapter<Service>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `services`(`serviceId`,`date`,`componentName`,`description`,`result`,`machineId`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Service value) {
        if (value.getServiceId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getServiceId());
        }
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getDate());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        if (value.getComponentName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getComponentName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        stmt.bindLong(5, value.getResult());
        stmt.bindLong(6, value.getMachineId());
      }
    };
  }

  @Override
  public void insertAll(final List<Machine> machines) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfMachine.insert(machines);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final Machine item) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfMachine.insert(item);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertIssue(final Issue item) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfIssue.insert(item);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertAllIssues(final List<Issue> issues) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfIssue.insert(issues);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertService(final Service item) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfService.insert(item);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Machine>> getAllMachinesLiveData() {
    final String _sql = "SELECT * FROM machines ORDER BY name";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"machines"}, new Callable<List<Machine>>() {
      @Override
      public List<Machine> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfMachineId = CursorUtil.getColumnIndexOrThrow(_cursor, "machineId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfServiceInstruction = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceInstruction");
          final List<Machine> _result = new ArrayList<Machine>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Machine _item;
            final long _tmpMachineId;
            _tmpMachineId = _cursor.getLong(_cursorIndexOfMachineId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpCode;
            _tmpCode = _cursor.getString(_cursorIndexOfCode);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            final String _tmpServiceInstruction;
            _tmpServiceInstruction = _cursor.getString(_cursorIndexOfServiceInstruction);
            _item = new Machine(_tmpMachineId,_tmpName,_tmpCode,_tmpDescription,_tmpImage,_tmpServiceInstruction);
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
  public LiveData<List<Machine>> getMachinesByNameLiveData(final String name) {
    final String _sql = "SELECT * FROM machines WHERE name LIKE '%' || ? || '%' ORDER BY name";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (name == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, name);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"machines"}, new Callable<List<Machine>>() {
      @Override
      public List<Machine> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfMachineId = CursorUtil.getColumnIndexOrThrow(_cursor, "machineId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfServiceInstruction = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceInstruction");
          final List<Machine> _result = new ArrayList<Machine>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Machine _item;
            final long _tmpMachineId;
            _tmpMachineId = _cursor.getLong(_cursorIndexOfMachineId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpCode;
            _tmpCode = _cursor.getString(_cursorIndexOfCode);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            final String _tmpServiceInstruction;
            _tmpServiceInstruction = _cursor.getString(_cursorIndexOfServiceInstruction);
            _item = new Machine(_tmpMachineId,_tmpName,_tmpCode,_tmpDescription,_tmpImage,_tmpServiceInstruction);
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
  public List<Machine> getAllMachines() {
    final String _sql = "SELECT * FROM machines ORDER BY name";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfMachineId = CursorUtil.getColumnIndexOrThrow(_cursor, "machineId");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfServiceInstruction = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceInstruction");
      final List<Machine> _result = new ArrayList<Machine>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Machine _item;
        final long _tmpMachineId;
        _tmpMachineId = _cursor.getLong(_cursorIndexOfMachineId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpCode;
        _tmpCode = _cursor.getString(_cursorIndexOfCode);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpImage;
        _tmpImage = _cursor.getString(_cursorIndexOfImage);
        final String _tmpServiceInstruction;
        _tmpServiceInstruction = _cursor.getString(_cursorIndexOfServiceInstruction);
        _item = new Machine(_tmpMachineId,_tmpName,_tmpCode,_tmpDescription,_tmpImage,_tmpServiceInstruction);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Machine getById(final long machineId) {
    final String _sql = "SELECT * FROM machines WHERE machineId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, machineId);
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfMachineId = CursorUtil.getColumnIndexOrThrow(_cursor, "machineId");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfServiceInstruction = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceInstruction");
      final Machine _result;
      if(_cursor.moveToFirst()) {
        final long _tmpMachineId;
        _tmpMachineId = _cursor.getLong(_cursorIndexOfMachineId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpCode;
        _tmpCode = _cursor.getString(_cursorIndexOfCode);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpImage;
        _tmpImage = _cursor.getString(_cursorIndexOfImage);
        final String _tmpServiceInstruction;
        _tmpServiceInstruction = _cursor.getString(_cursorIndexOfServiceInstruction);
        _result = new Machine(_tmpMachineId,_tmpName,_tmpCode,_tmpDescription,_tmpImage,_tmpServiceInstruction);
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
  public Machine getByCode(final String code) {
    final String _sql = "SELECT * FROM machines WHERE code=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (code == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, code);
    }
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfMachineId = CursorUtil.getColumnIndexOrThrow(_cursor, "machineId");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfServiceInstruction = CursorUtil.getColumnIndexOrThrow(_cursor, "serviceInstruction");
      final Machine _result;
      if(_cursor.moveToFirst()) {
        final long _tmpMachineId;
        _tmpMachineId = _cursor.getLong(_cursorIndexOfMachineId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpCode;
        _tmpCode = _cursor.getString(_cursorIndexOfCode);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpImage;
        _tmpImage = _cursor.getString(_cursorIndexOfImage);
        final String _tmpServiceInstruction;
        _tmpServiceInstruction = _cursor.getString(_cursorIndexOfServiceInstruction);
        _result = new Machine(_tmpMachineId,_tmpName,_tmpCode,_tmpDescription,_tmpImage,_tmpServiceInstruction);
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
  public LiveData<List<Issue>> getIssuesByKeywordsLiveData(final String keywords) {
    final String _sql = "SELECT * FROM issues WHERE keywords LIKE '%' || ? || '%' ORDER BY keywords";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (keywords == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, keywords);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"issues"}, new Callable<List<Issue>>() {
      @Override
      public List<Issue> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfIssueId = CursorUtil.getColumnIndexOrThrow(_cursor, "issueId");
          final int _cursorIndexOfKeywords = CursorUtil.getColumnIndexOrThrow(_cursor, "keywords");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfSolution = CursorUtil.getColumnIndexOrThrow(_cursor, "solution");
          final int _cursorIndexOfWorkerSignature = CursorUtil.getColumnIndexOrThrow(_cursor, "workerSignature");
          final int _cursorIndexOfMachineId = CursorUtil.getColumnIndexOrThrow(_cursor, "machineId");
          final List<Issue> _result = new ArrayList<Issue>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Issue _item;
            final Long _tmpIssueId;
            if (_cursor.isNull(_cursorIndexOfIssueId)) {
              _tmpIssueId = null;
            } else {
              _tmpIssueId = _cursor.getLong(_cursorIndexOfIssueId);
            }
            final String _tmpKeywords;
            _tmpKeywords = _cursor.getString(_cursorIndexOfKeywords);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpSolution;
            _tmpSolution = _cursor.getString(_cursorIndexOfSolution);
            final String _tmpWorkerSignature;
            _tmpWorkerSignature = _cursor.getString(_cursorIndexOfWorkerSignature);
            final long _tmpMachineId;
            _tmpMachineId = _cursor.getLong(_cursorIndexOfMachineId);
            _item = new Issue(_tmpIssueId,_tmpKeywords,_tmpDescription,_tmpSolution,_tmpWorkerSignature,_tmpMachineId);
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
  public LiveData<List<Issue>> getIssuesByKeywordsLiveData(final String keywords,
      final long machineId) {
    final String _sql = "SELECT * FROM issues WHERE keywords LIKE '%' || ? || '%' AND machineId=? ORDER BY keywords";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (keywords == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, keywords);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, machineId);
    return __db.getInvalidationTracker().createLiveData(new String[]{"issues"}, new Callable<List<Issue>>() {
      @Override
      public List<Issue> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfIssueId = CursorUtil.getColumnIndexOrThrow(_cursor, "issueId");
          final int _cursorIndexOfKeywords = CursorUtil.getColumnIndexOrThrow(_cursor, "keywords");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfSolution = CursorUtil.getColumnIndexOrThrow(_cursor, "solution");
          final int _cursorIndexOfWorkerSignature = CursorUtil.getColumnIndexOrThrow(_cursor, "workerSignature");
          final int _cursorIndexOfMachineId = CursorUtil.getColumnIndexOrThrow(_cursor, "machineId");
          final List<Issue> _result = new ArrayList<Issue>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Issue _item;
            final Long _tmpIssueId;
            if (_cursor.isNull(_cursorIndexOfIssueId)) {
              _tmpIssueId = null;
            } else {
              _tmpIssueId = _cursor.getLong(_cursorIndexOfIssueId);
            }
            final String _tmpKeywords;
            _tmpKeywords = _cursor.getString(_cursorIndexOfKeywords);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpSolution;
            _tmpSolution = _cursor.getString(_cursorIndexOfSolution);
            final String _tmpWorkerSignature;
            _tmpWorkerSignature = _cursor.getString(_cursorIndexOfWorkerSignature);
            final long _tmpMachineId;
            _tmpMachineId = _cursor.getLong(_cursorIndexOfMachineId);
            _item = new Issue(_tmpIssueId,_tmpKeywords,_tmpDescription,_tmpSolution,_tmpWorkerSignature,_tmpMachineId);
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
  public Issue getIssueById(final long issueId) {
    final String _sql = "SELECT * FROM issues WHERE issueId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, issueId);
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfIssueId = CursorUtil.getColumnIndexOrThrow(_cursor, "issueId");
      final int _cursorIndexOfKeywords = CursorUtil.getColumnIndexOrThrow(_cursor, "keywords");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfSolution = CursorUtil.getColumnIndexOrThrow(_cursor, "solution");
      final int _cursorIndexOfWorkerSignature = CursorUtil.getColumnIndexOrThrow(_cursor, "workerSignature");
      final int _cursorIndexOfMachineId = CursorUtil.getColumnIndexOrThrow(_cursor, "machineId");
      final Issue _result;
      if(_cursor.moveToFirst()) {
        final Long _tmpIssueId;
        if (_cursor.isNull(_cursorIndexOfIssueId)) {
          _tmpIssueId = null;
        } else {
          _tmpIssueId = _cursor.getLong(_cursorIndexOfIssueId);
        }
        final String _tmpKeywords;
        _tmpKeywords = _cursor.getString(_cursorIndexOfKeywords);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpSolution;
        _tmpSolution = _cursor.getString(_cursorIndexOfSolution);
        final String _tmpWorkerSignature;
        _tmpWorkerSignature = _cursor.getString(_cursorIndexOfWorkerSignature);
        final long _tmpMachineId;
        _tmpMachineId = _cursor.getLong(_cursorIndexOfMachineId);
        _result = new Issue(_tmpIssueId,_tmpKeywords,_tmpDescription,_tmpSolution,_tmpWorkerSignature,_tmpMachineId);
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
