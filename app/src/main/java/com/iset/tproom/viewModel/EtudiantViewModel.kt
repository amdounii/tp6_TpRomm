package com.iset.tproom.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iset.tproom.data.entity.Etudiant
import com.iset.tproom.data.repository.EtudiantRepository
import kotlinx.coroutines.launch

class EtudiantViewModel(private val repository: EtudiantRepository) : ViewModel() {

    // LiveData des étudiants récupérée directement du Repository (qui l'obtient du Room DAO)
    val allEtudiants: LiveData<List<Etudiant>> = repository.allEtudiants

    // Etudiant sélectionné (affiché dans DetailEtudiantFragment)
    private val _selectedEtudiant = MutableLiveData<Etudiant>()
    val selectedEtudiant: LiveData<Etudiant> = _selectedEtudiant

    // Résultat de la recherche par classe
    private val _etudiantsSearchResults = MutableLiveData<List<Etudiant>>()
    val etudiantsSearchResults: LiveData<List<Etudiant>> = _etudiantsSearchResults

    fun selectionnerEtudiant(etudiant: Etudiant) {
        _selectedEtudiant.value = etudiant // Notifie le DetailEtudiantFragment
    }

    // Fonction d'insertion (nécessite viewModelScope et Coroutines)
    fun insertEtudiant(etudiant: Etudiant) = viewModelScope.launch {
        repository.insert(etudiant)
    }

    // Fonction de suppression (nécessite viewModelScope et Coroutines)
    fun delete(etudiant: Etudiant) = viewModelScope.launch {
        repository.delete(etudiant)
    }

    // Fonction de mise à jour
    fun update(etudiant: Etudiant) = viewModelScope.launch {
        repository.update(etudiant)
    }

    fun setSearchQuery(query: String) { // Lancer l'opération de recherche dans une coroutine
        viewModelScope.launch {
            val searchQuery = "%$query%" // Préparer le format LIKE
            Log.d("EtudiantViewModel", "Recherche avec requête : $searchQuery")
            // Appeler la fonction suspend du DAO/Repository
            val results = repository.searchEtudiants(searchQuery)
            // Mettre à jour le MutableLiveData sur le Main Thread
            _etudiantsSearchResults.postValue(results)
        }
    }
}
