package com.iset.tproom.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.SearchView
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.iset.tproom.EtudiantApplication
import com.iset.tproom.R
import com.iset.tproom.data.entity.Etudiant
import com.iset.tproom.databinding.FragmentListeEtudiantsBinding
import com.iset.tproom.ui.adapter.EtudiantAdapter
import com.iset.tproom.viewModel.EtudiantViewModel
import com.iset.tproom.viewModel.EtudiantViewModelFactory

class ListeEtudiantsFragment : Fragment() {

    private var _binding: FragmentListeEtudiantsBinding? = null
    private val binding get() = _binding!!

    private val etudiantViewModel: EtudiantViewModel by activityViewModels {
        // 1. Assurez-vous d'avoir une classe EtudiantApplication qui expose le Repository
        val application = requireActivity().application as EtudiantApplication
        val repository = application.repository
        // 2. Retourne la Factory une seule fois (correctement)
        EtudiantViewModelFactory(repository)
    }

    private lateinit var adapter: EtudiantAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListeEtudiantsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = EtudiantAdapter(
            emptyList(),
            onItemClick = { etudiant ->
                // 1- Afficher les détails de l'étudiant
                etudiantViewModel.selectionnerEtudiant(etudiant)
                findNavController().navigate(R.id.action_nav_liste_etudiants_to_nav_detail_etudiant)
            },
            onItemLongClick = { etudiant ->
                // 2- Suppression avec dialogue de confirmation
                AlertDialog.Builder(requireContext())
                    .setTitle("Suppression")
                    .setMessage("Voulez-vous supprimer l'étudiant ${etudiant.id} ?")
                    .setPositiveButton("Supprimer") { _, _ -> etudiantViewModel.delete(etudiant) }
                    .setNegativeButton("Annuler", null)
                    .show()
            },
            onItemUpdate = { etudiant ->
                // 3- Mise à jour dans une boîte de dialogue
                val dialogView = LayoutInflater.from(requireContext())
                    .inflate(R.layout.dialog_edit_details, null)
                val etMail = dialogView.findViewById<EditText>(R.id.etEditMail)
                val etClasse = dialogView.findViewById<EditText>(R.id.etEditClasse)
                etMail.setText(etudiant.mail)
                etClasse.setText(etudiant.classe)

                AlertDialog.Builder(requireContext())
                    .setTitle("Modifier les détails de ${etudiant.id}")
                    .setView(dialogView)
                    .setPositiveButton("Sauvegarder") { _, _ ->
                        val modifie = etudiant.copy(
                            mail = etMail.text.toString(),
                            classe = etClasse.text.toString()
                        )
                        etudiantViewModel.update(modifie)
                    }
                    .setNegativeButton("Annuler", null)
                    .show()
            }
        )
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter

        // Observer la liste des étudiants (Room -> LiveData)
        etudiantViewModel.allEtudiants.observe(viewLifecycleOwner) { etudiants ->
            adapter.updateList(etudiants)
        }

        // C. Observer le résultat de la recherche
        etudiantViewModel.etudiantsSearchResults.observe(viewLifecycleOwner) { resultats ->
            adapter.updateList(resultats)
        }

        // Déclaration moderne du menu d'options
        requireActivity().addMenuProvider(object : MenuProvider {
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                // Gonfler votre fichier de menu XML ici
                menuInflater.inflate(R.menu.main, menu)
                // Configuration de la SearchView
                val searchItem = menu.findItem(R.id.action_search)
                val searchView = searchItem.actionView as SearchView
                searchView.queryHint = "Rechercher par classe"
                searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                    override fun onQueryTextSubmit(query: String?): Boolean {
                        etudiantViewModel.setSearchQuery(query ?: "")
                        return true
                    }

                    override fun onQueryTextChange(newText: String?): Boolean {
                        etudiantViewModel.setSearchQuery(newText ?: "")
                        return true
                    }
                })
            }

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                return false
            }
        }, viewLifecycleOwner, Lifecycle.State.RESUMED)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
