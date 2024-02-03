package com.example.my_e_learning.fitur.nilai

import androidx.lifecycle.ViewModel
import com.example.my_e_learning.R
import com.example.my_e_learning.data.DashboardInformation
import com.example.my_e_learning.data.NilaiInformation
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class NilaiViewModel @Inject constructor() : ViewModel() {
    fun nilaiInformationProvider(): List<NilaiInformation> {

        return listOf (
            NilaiInformation(1, "hasil nilai =",90),
            NilaiInformation(2,"hasil nilai =", 80)
                )
    }
}