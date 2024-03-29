package com.example.materi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.materi.databinding.FragmentMateriBinding

class FragmentMateri : Fragment() {

    private var _binding: FragmentMateriBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMateriBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.tvBackMateri.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.cvMateri1.setOnClickListener {
            findNavController().navigate(
                FragmentMateriDirections.actionFragmentMateri2ToFragmentDetailMateri2(
                    1
                )
            )
        }
        binding.cvMateri2.setOnClickListener {
            findNavController().navigate(
                FragmentMateriDirections.actionFragmentMateri2ToFragmentDetailMateri2(
                    2
                )
            )
        }
        binding.cvMateri3.setOnClickListener {
            findNavController().navigate(
                FragmentMateriDirections.actionFragmentMateri2ToFragmentDetailMateri2(
                    3
                )
            )
        }
        binding.cvMateri4.setOnClickListener {
            findNavController().navigate(
                FragmentMateriDirections.actionFragmentMateri2ToFragmentDetailMateri2(
                    4
                )
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


