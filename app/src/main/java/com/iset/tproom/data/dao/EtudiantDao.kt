package com.iset.tproom.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.iset.tproom.data.entity.Etudiant

@Dao
interface EtudiantDao {
    // 1. Insertion : Insère un nouvel étudiant ou remplace en cas de conflit
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(etudiant: Etudiant)

    // 2. Suppression : Supprime un étudiant spécifique
    @Delete
    suspend fun delete(etudiant: Etudiant)

    // 3. Lecture : Récupère TOUS les étudiants.
    // LiveData permet d'observer les changements en temps réel (MVVM!)
    @Query("SELECT * FROM etudiant_table ORDER BY identifiant ASC")
    fun getAllEtudiants(): LiveData<List<Etudiant>>

    // 4. Suppression de tous les étudiants (utile pour les tests)
    @Query("DELETE FROM etudiant_table")
    suspend fun deleteAll()

    // 5. Mise à jour d'un étudiant
    @Update
    suspend fun update(etudiant: Etudiant)

    // 6. Recherche par classe
    @Query("SELECT * FROM etudiant_table WHERE classe LIKE :query ORDER BY identifiant ASC")
    suspend fun searchEtudiants(query: String): List<Etudiant>
}
