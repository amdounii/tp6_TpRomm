package com.iset.tproom.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// Une entité = une table dans SQLite : la table 'etudiant_table'
@Entity(tableName = "etudiant_table")
data class Etudiant(
    @PrimaryKey
    @ColumnInfo(name = "identifiant")
    val id: Int,
    @ColumnInfo(name = "email")
    val mail: String,
    @ColumnInfo(name = "classe")
    val classe: String
)
