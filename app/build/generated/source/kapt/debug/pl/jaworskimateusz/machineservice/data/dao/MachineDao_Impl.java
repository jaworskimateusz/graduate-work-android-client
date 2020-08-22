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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import pl.jaworskimateusz.machineservice.data.entity.Machine;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class MachineDao_Impl implements MachineDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfMachine;

  public MachineDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMachine = new EntityInsertionAdapter<Machine>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `machines`(`machineId`,`code`,`name`,`description`,`image`,`service_instruction`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Machine value) {
        stmt.bindLong(1, value.getMachineId());
        if (value.getCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCode());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getImage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindBlob(5, value.getImage());
        }
        if (value.getService_instruction() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindBlob(6, value.getService_instruction());
        }
      }
    };
  }

  @Override
  public void insertAll(final List<Machine> tasks) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfMachine.insert(tasks);
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
  public LiveData<List<Machine>> getAllMachinesLiveData() {
    final String _sql = "SELECT * FROM machines ORDER BY name";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"machines"}, new Callable<List<Machine>>() {
      @Override
      public List<Machine> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfMachineId = CursorUtil.getColumnIndexOrThrow(_cursor, "machineId");
          final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfServiceInstruction = CursorUtil.getColumnIndexOrThrow(_cursor, "service_instruction");
          final List<Machine> _result = new ArrayList<Machine>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Machine _item;
            final long _tmpMachineId;
            _tmpMachineId = _cursor.getLong(_cursorIndexOfMachineId);
            final String _tmpCode;
            _tmpCode = _cursor.getString(_cursorIndexOfCode);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final byte[] _tmpImage;
            _tmpImage = _cursor.getBlob(_cursorIndexOfImage);
            final byte[] _tmpService_instruction;
            _tmpService_instruction = _cursor.getBlob(_cursorIndexOfServiceInstruction);
            _item = new Machine(_tmpMachineId,_tmpCode,_tmpName,_tmpDescription,_tmpImage,_tmpService_instruction);
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
          final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfServiceInstruction = CursorUtil.getColumnIndexOrThrow(_cursor, "service_instruction");
          final List<Machine> _result = new ArrayList<Machine>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Machine _item;
            final long _tmpMachineId;
            _tmpMachineId = _cursor.getLong(_cursorIndexOfMachineId);
            final String _tmpCode;
            _tmpCode = _cursor.getString(_cursorIndexOfCode);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final byte[] _tmpImage;
            _tmpImage = _cursor.getBlob(_cursorIndexOfImage);
            final byte[] _tmpService_instruction;
            _tmpService_instruction = _cursor.getBlob(_cursorIndexOfServiceInstruction);
            _item = new Machine(_tmpMachineId,_tmpCode,_tmpName,_tmpDescription,_tmpImage,_tmpService_instruction);
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
      final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfServiceInstruction = CursorUtil.getColumnIndexOrThrow(_cursor, "service_instruction");
      final List<Machine> _result = new ArrayList<Machine>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Machine _item;
        final long _tmpMachineId;
        _tmpMachineId = _cursor.getLong(_cursorIndexOfMachineId);
        final String _tmpCode;
        _tmpCode = _cursor.getString(_cursorIndexOfCode);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final byte[] _tmpImage;
        _tmpImage = _cursor.getBlob(_cursorIndexOfImage);
        final byte[] _tmpService_instruction;
        _tmpService_instruction = _cursor.getBlob(_cursorIndexOfServiceInstruction);
        _item = new Machine(_tmpMachineId,_tmpCode,_tmpName,_tmpDescription,_tmpImage,_tmpService_instruction);
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
      final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfServiceInstruction = CursorUtil.getColumnIndexOrThrow(_cursor, "service_instruction");
      final Machine _result;
      if(_cursor.moveToFirst()) {
        final long _tmpMachineId;
        _tmpMachineId = _cursor.getLong(_cursorIndexOfMachineId);
        final String _tmpCode;
        _tmpCode = _cursor.getString(_cursorIndexOfCode);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final byte[] _tmpImage;
        _tmpImage = _cursor.getBlob(_cursorIndexOfImage);
        final byte[] _tmpService_instruction;
        _tmpService_instruction = _cursor.getBlob(_cursorIndexOfServiceInstruction);
        _result = new Machine(_tmpMachineId,_tmpCode,_tmpName,_tmpDescription,_tmpImage,_tmpService_instruction);
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
