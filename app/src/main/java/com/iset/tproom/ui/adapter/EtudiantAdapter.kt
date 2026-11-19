package com.iset.tproom.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.iset.tproom.data.entity.Etudiant
import com.iset.tproom.databinding.ItemEtudiantBinding

class EtudiantAdapter(
    private var etudiants: List<Etudiant>,
    private val onItemClick: (Etudiant) -> Unit,
    private val onItemLongClick: (Etudiant) -> Unit,
    private val onItemUpdate: (Etudiant) -> Unit
) : RecyclerView.Adapter<EtudiantAdapter.EtudiantViewHolder>() {

    inner class EtudiantViewHolder(val binding: ItemEtudiantBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EtudiantViewHolder {
        val binding = ItemEtudiantBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EtudiantViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EtudiantViewHolder, position: Int) {
        val etudiant = etudiants[position]
        holder.binding.tvMail.text = etudiant.mail
        holder.binding.tvClasse.text = "Classe : ${etudiant.classe}"

        holder.binding.root.setOnClickListener { onItemClick(etudiant) }
        holder.binding.root.setOnLongClickListener {
            onItemLongClick(etudiant)
            true
        }
        holder.binding.btnUpdate.setOnClickListener { onItemUpdate(etudiant) }
    }

    override fun getItemCount(): Int = etudiants.size

    fun updateList(newList: List<Etudiant>) {
        etudiants = newList
        notifyDataSetChanged()
    }
}
