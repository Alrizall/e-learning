package com.example.my_e_learning.profil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.my_e_learning.databinding.FragmentProfilBinding
import com.example.my_e_learning.fitur.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentProfil : Fragment() {
    private val viewModel : LoginViewModel by viewModels()
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
        if (viewModel.getUserName().isNotEmpty()){
            binding.btnLogout.setOnClickListener{
                viewModel.deleteUserName()

                findNavController().navigate(FragmentProfilDirections.actionFragmentProfilToFragmentLogin())
            }
            binding.tvUsername.text = viewModel.getUserName()
            binding.tvNis.text = (1000  .. 9999).random().toString()
            binding.tvNamaProfil.text = "Moch alrizal"
            binding.tvAlamat.text = "jalan no 1"
            binding.tvJurusan.text = "tkj"
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}