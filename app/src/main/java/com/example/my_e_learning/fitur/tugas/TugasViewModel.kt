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
                TugasInformation(1,"Jendela antar muka yang menghubungkan program dengan pengguna disebut?",null)
            }
            // Desain Interface
            2 -> {
                TugasInformation(2,"Sebutkan contoh tentang interface!",null)
            }
            else -> {
                TugasInformation(3,"Sebutkan 3 desain tools yang biasa digunakan untuk UI", null)
            }
        }
    }
}