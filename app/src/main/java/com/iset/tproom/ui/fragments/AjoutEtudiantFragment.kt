package com.iset.tproom.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.iset.tproom.EtudiantApplication
import com.iset.tproom.R
import com.iset.tproom.data.entity.Etudiant
import com.iset.tproom.databinding.FragmentAjoutEtudiantBinding
import com.iset.tproom.viewModel.EtudiantViewModel
import com.iset.tproom.viewModel.EtudiantViewModelFactory

class AjoutEtudiantFragment : Fragment() {

    private var _binding: FragmentAjoutEtudiantBinding? = null
    private val binding get() = _binding!!

    private val etudiantViewModel: EtudiantViewModel by activityViewModels {
        val application = requireActivity().application as EtudiantApplication
        val repository = application.repository
        EtudiantViewModelFactory(repository)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAjoutEtudiantBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnAjouter.setOnClickListener {
            val id = binding.etId.text.toString().toIntOrNull()
            val mail = binding.etMail.text.toString()
            val classe = binding.etClasse.text.toString()

            if (id == null || mail.isEmpty() || classe.isEmpty()) {
                Toast.makeText(requireContext(), "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            etudiantViewModel.insertEtudiant(Etudiant(id, mail, classe))
            Toast.makeText(requireContext(), "Etudiant ajouté", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_nav_ajout_etudiant_to_nav_liste_etudiants)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
