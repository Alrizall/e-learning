package com.example.my_e_learning.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.my_e_learning.databinding.FragmentHomeBinding


class FragmentHome : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView ()
    }

    private fun initView (){
        binding.textView.text = "Hi, Alrizal"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}