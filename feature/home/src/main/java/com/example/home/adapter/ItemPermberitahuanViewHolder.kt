package com.example.home.adapter

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.core.DashboardInformation
import com.example.home.databinding.ItemPemberitahuanBinding


class ItemPermberitahuanViewHolder (private val binding: ItemPemberitahuanBinding) : RecyclerView.ViewHolder (binding.root){
    fun bind (data : DashboardInformation) {
        binding.tvInformation.text = data.title
        Glide.with(binding.uvUx1.context).load(data.image).into(binding.uvUx1) //load image
    }
}