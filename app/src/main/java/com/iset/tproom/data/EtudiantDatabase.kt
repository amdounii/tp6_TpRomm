package com.iset.tproom.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.iset.tproom.data.dao.EtudiantDao
import com.iset.tproom.data.entity.Etudiant

@Database(entities = [Etudiant::class], version = 1, exportSchema = false)
abstract class EtudiantDatabase : RoomDatabase() {
    // Déclare l'interface DAO pour que Room la gère
    abstract fun etudiantDao(): EtudiantDao

    // C'est ici que le companion object est utilisé
    companion object {
        // 1. L'instance volatile (Singleton)
        @Volatile
        private var INSTANCE: EtudiantDatabase? = null

        // 2. La Factory Method pour obtenir l'instance
        fun getDatabase(context: Context): EtudiantDatabase {
            // Verrou pour garantir qu'un seul thread crée la base de données à la fois
            return INSTANCE ?: synchronized(this) {
                // Vérification finale à l'intérieur du verrou
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    EtudiantDatabase::class.java,
                    "etudiant_database"
                ).build()
                INSTANCE = instance
                // Retourne l'instance créée
                instance
            }
        }
    }
}
