package com.example.nilai

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.example.core.NilaiInformation
import com.example.core.util.overrideFragmentBackPressed
import com.example.nilai.adapter.NilaiAdapter
import com.example.nilai.databinding.FragmentNilaiBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentNilai : Fragment(), NilaiAdapter.NilaiAdapterListener {
    private val nilaiViewModel: NilaiViewModel by viewModels()
    private var _binding: FragmentNilaiBinding? = null
    private val binding get() = _binding!!
    private val nilaiAdapter: NilaiAdapter by lazy { NilaiAdapter(this) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNilaiBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }


    private fun initView() {
        val data = nilaiViewModel.nilaiInformationProvider()
        binding.tvBackNilai.setOnClickListener {
            val request = NavDeepLinkRequest.Builder
                .fromUri("android-app://example.google.app/home".toUri())
                .build()
            findNavController().navigate(request)
        }
        overrideFragmentBackPressed {
            val request = NavDeepLinkRequest.Builder
                .fromUri("android-app://example.google.app/home".toUri())
                .build()
            findNavController().navigate(request)
        }

        binding.rvNilai.apply {
            adapter = nilaiAdapter
        }
        if (data.isNotEmpty()){
            nilaiAdapter.submitList(data)
            binding.tvNilaiEmpty.visibility =View.GONE
        }else {
            binding.tvNilaiEmpty.visibility =View.VISIBLE
        }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onclick(data: NilaiInformation) {
    }
}


