package com.iset.tproom.data;

import androidx.annotation.NonNull;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.iset.tproom.data.dao.EtudiantDao;
import com.iset.tproom.data.dao.EtudiantDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class EtudiantDatabase_Impl extends EtudiantDatabase {
  private volatile EtudiantDao _etudiantDao;

  @Override
  @NonNull
  protected RoomOpenDelegate createOpenDelegate() {
    final RoomOpenDelegate _openDelegate = new RoomOpenDelegate(1, "16536046a4187ef93bdf10aafcbfe1c3", "5bf42c910dfd4bca2c903c8620eac6d8") {
      @Override
      public void createAllTables(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `etudiant_table` (`identifiant` INTEGER NOT NULL, `email` TEXT NOT NULL, `classe` TEXT NOT NULL, PRIMARY KEY(`identifiant`))");
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '16536046a4187ef93bdf10aafcbfe1c3')");
      }

      @Override
      public void dropAllTables(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "DROP TABLE IF EXISTS `etudiant_table`");
      }

      @Override
      public void onCreate(@NonNull final SQLiteConnection connection) {
      }

      @Override
      public void onOpen(@NonNull final SQLiteConnection connection) {
        internalInitInvalidationTracker(connection);
      }

      @Override
      public void onPreMigrate(@NonNull final SQLiteConnection connection) {
        DBUtil.dropFtsSyncTriggers(connection);
      }

      @Override
      public void onPostMigrate(@NonNull final SQLiteConnection connection) {
      }

      @Override
      @NonNull
      public RoomOpenDelegate.ValidationResult onValidateSchema(
          @NonNull final SQLiteConnection connection) {
        final Map<String, TableInfo.Column> _columnsEtudiantTable = new HashMap<String, TableInfo.Column>(3);
        _columnsEtudiantTable.put("identifiant", new TableInfo.Column("identifiant", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEtudiantTable.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEtudiantTable.put("classe", new TableInfo.Column("classe", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final Set<TableInfo.ForeignKey> _foreignKeysEtudiantTable = new HashSet<TableInfo.ForeignKey>(0);
        final Set<TableInfo.Index> _indicesEtudiantTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoEtudiantTable = new TableInfo("etudiant_table", _columnsEtudiantTable, _foreignKeysEtudiantTable, _indicesEtudiantTable);
        final TableInfo _existingEtudiantTable = TableInfo.read(connection, "etudiant_table");
        if (!_infoEtudiantTable.equals(_existingEtudiantTable)) {
          return new RoomOpenDelegate.ValidationResult(false, "etudiant_table(com.iset.tproom.data.entity.Etudiant).\n"
                  + " Expected:\n" + _infoEtudiantTable + "\n"
                  + " Found:\n" + _existingEtudiantTable);
        }
        return new RoomOpenDelegate.ValidationResult(true, null);
      }
    };
    return _openDelegate;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final Map<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final Map<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "etudiant_table");
  }

  @Override
  public void clearAllTables() {
    super.performClear(false, "etudiant_table");
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final Map<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(EtudiantDao.class, EtudiantDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final Set<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public EtudiantDao etudiantDao() {
    if (_etudiantDao != null) {
      return _etudiantDao;
    } else {
      synchronized(this) {
        if(_etudiantDao == null) {
          _etudiantDao = new EtudiantDao_Impl(this);
        }
        return _etudiantDao;
      }
    }
  }
}
