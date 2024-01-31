package com.example.my_e_learning.materi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.my_e_learning.databinding.FragmentMateriBinding
import com.example.my_e_learning.databinding.FragmentTugasBinding

class FragmentTugas : Fragment() {

    private var _binding: FragmentTugasBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTugasBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


