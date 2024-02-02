package com.example.my_e_learning.fitur.materi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.my_e_learning.databinding.FragmentDetailMateriBinding
import com.example.my_e_learning.fitur.tugas.FragmentTugasDirections
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentDetailMateri : Fragment() {
    private val materiViewModel : MateriViewModel by viewModels()
    private var _binding: FragmentDetailMateriBinding? = null
    private val binding get() = _binding!!
    private val idMateri : FragmentDetailMateriArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailMateriBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        val data = materiViewModel.materiViewModelProvider(idMateri.idMateri)
        binding.ivTomboolbackDetail.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.tvDetailMateri.text = data.decription
        Glide.with(binding.ivDetailMateri.context).load(data.image).into(binding.ivDetailMateri)
        binding.tvBackDetaillMateri.text = data.title
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}