package com.example.my_e_learning.fitur.tugas

import androidx.lifecycle.ViewModel
import com.example.my_e_learning.R
import com.example.my_e_learning.data.TugasInformation
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TugasViewModel @Inject constructor() : ViewModel(){
    fun tugasInformationProvider(id: Int): TugasInformation {

        return when(id){
            1 -> {
                TugasInformation(1,"Pengertian User Interface",null)
            }
            2 -> {
                TugasInformation(2,"apa yang di tunjukkan gambar diatas?",R.drawable.img_user_interface)
            }
            else -> {
                TugasInformation(3,"Pengertian User Experience",null)
            }
        }
    }
}