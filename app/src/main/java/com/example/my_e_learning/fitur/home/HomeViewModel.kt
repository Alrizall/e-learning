package com.example.my_e_learning.fitur.home

import androidx.lifecycle.ViewModel
import com.example.my_e_learning.R
import com.example.my_e_learning.data.DashboardInformation
import com.example.my_e_learning.data.DuedateInformation
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() :
    ViewModel() {
    fun dashboardInformationProvider(): List<DashboardInformation> {

        return listOf(
            DashboardInformation(1, R.drawable.img_kurikulum, "Kurikulum Baru"),
            DashboardInformation(2, R.drawable.img_bakti_kominfo, " Kemajuan Pendidikan "),
            DashboardInformation(3, R.drawable.img_user_interface, " Kemajuan Desain UI "),
            DashboardInformation(4, R.drawable.img_anak_sd, " Infrastruktur Sekolah Di Pedesaan  ")
        )
    }

    fun duedateInformationProvider(): List<DuedateInformation> {

        return listOf(
            DuedateInformation(1, "Kurikulum Baru"),
            DuedateInformation(2,  " Kemajuan Pendidikan "),
            DuedateInformation(3,  " Kemajuan Desain UI "),
        )
    }

}