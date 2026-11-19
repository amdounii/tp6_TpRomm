package com.iset.tproom.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.iset.tproom.EtudiantApplication
import com.iset.tproom.databinding.FragmentDetailEtudiantBinding
import com.iset.tproom.viewModel.EtudiantViewModel
import com.iset.tproom.viewModel.EtudiantViewModelFactory

class DetailEtudiantFragment : Fragment() {

    private var _binding: FragmentDetailEtudiantBinding? = null
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
        _binding = FragmentDetailEtudiantBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Observer l'étudiant sélectionné dans le ViewModel partagé
        etudiantViewModel.selectedEtudiant.observe(viewLifecycleOwner) { etudiant ->
            binding.tvDetailId.text = "Identifiant : ${etudiant.id}"
            binding.tvDetailMail.text = "Email : ${etudiant.mail}"
            binding.tvDetailClasse.text = "Classe : ${etudiant.classe}"
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
