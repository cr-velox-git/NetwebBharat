package com.netweb.netwebbharat.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.netweb.netwebbharat.databinding.ItemViewDashboardItemBinding

class GridLayoutAdapter() : RecyclerView.Adapter<GridLayoutAdapter.ViewHolder>() {
    lateinit var binding: ItemViewDashboardItemBinding

    inner class ViewHolder(val binding: ItemViewDashboardItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding =
            ItemViewDashboardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //
    }

    override fun getItemCount() = 18
}