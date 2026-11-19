package com.iset.tproom.data.dao;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import com.iset.tproom.data.entity.Etudiant;
import java.lang.Class;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class EtudiantDao_Impl implements EtudiantDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<Etudiant> __insertAdapterOfEtudiant;

  private final EntityDeleteOrUpdateAdapter<Etudiant> __deleteAdapterOfEtudiant;

  private final EntityDeleteOrUpdateAdapter<Etudiant> __updateAdapterOfEtudiant;

  public EtudiantDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfEtudiant = new EntityInsertAdapter<Etudiant>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `etudiant_table` (`identifiant`,`email`,`classe`) VALUES (?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final Etudiant entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getMail() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getMail());
        }
        if (entity.getClasse() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getClasse());
        }
      }
    };
    this.__deleteAdapterOfEtudiant = new EntityDeleteOrUpdateAdapter<Etudiant>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `etudiant_table` WHERE `identifiant` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final Etudiant entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfEtudiant = new EntityDeleteOrUpdateAdapter<Etudiant>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `etudiant_table` SET `identifiant` = ?,`email` = ?,`classe` = ? WHERE `identifiant` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final Etudiant entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getMail() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getMail());
        }
        if (entity.getClasse() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getClasse());
        }
        statement.bindLong(4, entity.getId());
      }
    };
  }

  @Override
  public Object insert(final Etudiant etudiant, final Continuation<? super Unit> $completion) {
    if (etudiant == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __insertAdapterOfEtudiant.insert(_connection, etudiant);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object delete(final Etudiant etudiant, final Continuation<? super Unit> $completion) {
    if (etudiant == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __deleteAdapterOfEtudiant.handle(_connection, etudiant);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object update(final Etudiant etudiant, final Continuation<? super Unit> $completion) {
    if (etudiant == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __updateAdapterOfEtudiant.handle(_connection, etudiant);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public LiveData<List<Etudiant>> getAllEtudiants() {
    final String _sql = "SELECT * FROM etudiant_table ORDER BY identifiant ASC";
    return __db.getInvalidationTracker().createLiveData(new String[] {"etudiant_table"}, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "identifiant");
        final int _columnIndexOfMail = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "email");
        final int _columnIndexOfClasse = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "classe");
        final List<Etudiant> _result = new ArrayList<Etudiant>();
        while (_stmt.step()) {
          final Etudiant _item;
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final String _tmpMail;
          if (_stmt.isNull(_columnIndexOfMail)) {
            _tmpMail = null;
          } else {
            _tmpMail = _stmt.getText(_columnIndexOfMail);
          }
          final String _tmpClasse;
          if (_stmt.isNull(_columnIndexOfClasse)) {
            _tmpClasse = null;
          } else {
            _tmpClasse = _stmt.getText(_columnIndexOfClasse);
          }
          _item = new Etudiant(_tmpId,_tmpMail,_tmpClasse);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public Object searchEtudiants(final String query,
      final Continuation<? super List<Etudiant>> $completion) {
    final String _sql = "SELECT * FROM etudiant_table WHERE classe LIKE ? ORDER BY identifiant ASC";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        if (query == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindText(_argIndex, query);
        }
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "identifiant");
        final int _columnIndexOfMail = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "email");
        final int _columnIndexOfClasse = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "classe");
        final List<Etudiant> _result = new ArrayList<Etudiant>();
        while (_stmt.step()) {
          final Etudiant _item;
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final String _tmpMail;
          if (_stmt.isNull(_columnIndexOfMail)) {
            _tmpMail = null;
          } else {
            _tmpMail = _stmt.getText(_columnIndexOfMail);
          }
          final String _tmpClasse;
          if (_stmt.isNull(_columnIndexOfClasse)) {
            _tmpClasse = null;
          } else {
            _tmpClasse = _stmt.getText(_columnIndexOfClasse);
          }
          _item = new Etudiant(_tmpId,_tmpMail,_tmpClasse);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> $completion) {
    final String _sql = "DELETE FROM etudiant_table";
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        _stmt.step();
        return Unit.INSTANCE;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
