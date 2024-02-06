package com.example.tugas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.tugas.databinding.FragmentTugasBinding
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
        binding.imageView2.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.cvTugas1.setOnClickListener{
            findNavController().navigate(FragmentTugasDirections.actionFragmentTugas2ToFragmentDetailTugas2(1))
        }
        binding.cvTugas2.setOnClickListener{
            findNavController().navigate(FragmentTugasDirections.actionFragmentTugas2ToFragmentDetailTugas2(2))
        }
        binding.cvTugas3.setOnClickListener{
            findNavController().navigate(FragmentTugasDirections.actionFragmentTugas2ToFragmentDetailTugas2(3))
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}


