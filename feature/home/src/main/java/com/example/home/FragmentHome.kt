package com.example.home

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.core.DashboardInformation
import com.example.core.DuedateInformation
import com.example.home.adapter.DuedateAdapter
import com.example.home.adapter.PemberitahuanAdapter
import com.example.home.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class FragmentHome : Fragment(), PemberitahuanAdapter.PemberitahuanAdapterListener,
    DuedateAdapter.DuedateAdapterListener {
    private val homeViewModel: HomeViewModel by viewModels()
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val pemberitahuanAdapter: PemberitahuanAdapter by lazy { PemberitahuanAdapter(this) }
    private val duedateAdapter: DuedateAdapter by lazy { DuedateAdapter(this) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        if (homeViewModel.getUserName().isEmpty()) {
            val request = NavDeepLinkRequest.Builder
                .fromUri("android-app://example.google.app/login".toUri())
                .build()
            findNavController().navigate(request)
        } else {
            Glide.with(binding.ibProfilhome.context).load(R.drawable.pass_foto_profil)
                .into(binding.ibProfilhome)
            binding.cvCat1.setOnClickListener {
                val request = NavDeepLinkRequest.Builder
                    .fromUri("android-app://example.google.app/materi".toUri())
                    .build()
                findNavController().navigate(request)
            }
            binding.cvCat2.setOnClickListener {
                val request = NavDeepLinkRequest.Builder
                    .fromUri("android-app://example.google.app/tugas".toUri())
                    .build()
                findNavController().navigate(request)
            }
            binding.cvCat3.setOnClickListener {
                val request = NavDeepLinkRequest.Builder
                    .fromUri("android-app://example.google.app/quiz".toUri())
                    .build()
                findNavController().navigate(request)
            }
            binding.cvCat4.setOnClickListener {
                val request = NavDeepLinkRequest.Builder
                    .fromUri("android-app://example.google.app/nilai".toUri())
                    .build()
                findNavController().navigate(request)
            }
            binding.textView.text = "Hi, ${homeViewModel.getUserName()}"

            binding.rvPemberitahuan.apply {
                adapter = pemberitahuanAdapter
            }
            pemberitahuanAdapter.submitList(homeViewModel.dashboardInformationProvider())

            binding.rvPopuler.apply {
                adapter = duedateAdapter
            }
            duedateAdapter.submitList(homeViewModel.duedateInformationProvider())
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onclick(data: DashboardInformation) {
        val i = Intent(ACTION_VIEW, Uri.parse("https://www.google.com"))
        i.setPackage("com.android.chrome")
        startActivity(i)
    }

    override fun onclick(data: DuedateInformation) {
        val request = NavDeepLinkRequest.Builder
            .fromUri("android-app://example.google.app/tugas".toUri())
            .build()
        findNavController().navigate(request)
    }

}