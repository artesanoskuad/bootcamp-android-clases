package com.artesanoskuad.consumos.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.artesanoskuad.consumos.databinding.ItemCheckRegisterBinding
import com.artesanoskuad.consumos.model.Items

class CheckItemAdapter() : RecyclerView.Adapter<CheckItemViewHolder>() {

    private lateinit var itemsList: List<Items>

    fun setItemsList(itemsList: List<Items>) {
        this.itemsList = itemsList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CheckItemViewHolder {
        val binding: ItemCheckRegisterBinding = ItemCheckRegisterBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CheckItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CheckItemViewHolder, position: Int) {
        holder.bind(itemsList[position])
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }
}