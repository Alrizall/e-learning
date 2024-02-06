package com.example.nilai.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.core.NilaiInformation
import com.example.nilai.databinding.ItemNilaiBinding

class NilaiAdapter(private val listener: NilaiAdapter.NilaiAdapterListener) :
    ListAdapter<NilaiInformation, NilaiViewHolder>(NilaiAdapter.adapterCallback) {
    companion object {
        val adapterCallback = object : DiffUtil.ItemCallback<NilaiInformation>() {
            override fun areItemsTheSame(
                oldItem: NilaiInformation,
                newItem: NilaiInformation
            ): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: NilaiInformation,
                newItem: NilaiInformation
            ): Boolean {
                return oldItem.id == newItem.id
            }
        }
    }
    interface NilaiAdapterListener {
        fun onclick(data: NilaiInformation)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NilaiViewHolder {
        return NilaiViewHolder(
            ItemNilaiBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: NilaiViewHolder, position: Int) {
        val data = getItem(position)
        holder.bind(data)
        holder.itemView.setOnClickListener {
            listener.onclick(data)
        }
    }
}
