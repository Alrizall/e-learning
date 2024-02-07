package com.example.profil

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.fragment.app.viewModels
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.profil.databinding.FragmentProfilBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentProfil : Fragment() {
    private val viewModel : ProfilViewModel by viewModels()
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
                val request = NavDeepLinkRequest.Builder
                    .fromUri("android-app://example.google.app/login".toUri())
                    .build()
                findNavController().navigate(request)
            }
            Glide.with(binding.imageViewProfil.context).load(R.drawable.pass_foto_profil).into(binding.imageViewProfil)
            binding.tvUsername.text = viewModel.getUserName()
            binding.tvNis.text = (1000  .. 9999).random().toString()
            binding.tvNamaProfil.text = viewModel.getUserName()
            binding.tvAlamat.text = "Jalan Villa Regency 1, Blok OB 8 no.29"
            binding.tvJurusan.text = "Teknik Informatika"
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}