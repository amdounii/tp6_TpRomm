package com.iset.tproom

import android.app.Application
import com.iset.tproom.data.EtudiantDatabase
import com.iset.tproom.data.repository.EtudiantRepository

class EtudiantApplication : Application() {
    // 1. Initialisation de la base de données Room (le DAO est obtenu via cette instance)
    // by lazy : Garantit que la base de données n'est ouverte et créée qu'une seule fois
    private val database by lazy {
        EtudiantDatabase.getDatabase(this)
    }

    // 2. Initialisation du Repository (Instance Unique)
    // Cette variable est publique (val) pour être accessible par les Fragments.
    val repository by lazy {
        EtudiantRepository(database.etudiantDao())
    }
}
