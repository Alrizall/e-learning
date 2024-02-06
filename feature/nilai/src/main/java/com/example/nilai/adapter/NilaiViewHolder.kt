package com.example.nilai.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.core.NilaiInformation
import com.example.nilai.databinding.ItemNilaiBinding

class NilaiViewHolder (private val binding: ItemNilaiBinding) : RecyclerView.ViewHolder (binding.root){
    fun bind (data : NilaiInformation) {
        binding.tvNilai1.text = "${data.title} ${data.value.toString()}"
    }
}