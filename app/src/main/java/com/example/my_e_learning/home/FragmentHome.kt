package com.example.my_e_learning.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.my_e_learning.databinding.FragmentHomeBinding
import com.example.my_e_learning.fitur.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentHome : Fragment() {
    private val viewModel : LoginViewModel by viewModels()
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
        if (viewModel.getUserName().isEmpty()) {
            findNavController().navigate(FragmentHomeDirections.actionFragmentHomeToFragmentLogin()) }
        else {
            binding.textView.text = "Hi, ${viewModel.getUserName()}"
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}