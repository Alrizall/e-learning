package com.example.my_e_learning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.my_e_learning.databinding.FragmentLoginBinding
import com.example.my_e_learning.databinding.FragmentProfilBinding


class FragmentProfil : Fragment() {

    private var _binding : FragmentProfilBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfilBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView ()
    }

    private fun initView (){
        binding.tvUsername.text = "alrizal"
        binding.tvNis.text = (1000  .. 9999).random().toString()
        binding.tvNamaProfil.text = "Moch alrizal"
        binding.tvAlamat.text = "jalan no 1"
        binding.tvJurusan.text = "tkj"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}