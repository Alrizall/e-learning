package com.example.my_e_learning.fitur.materi

import androidx.lifecycle.ViewModel
import com.example.my_e_learning.R
import com.example.my_e_learning.data.MateriInformation
import com.example.my_e_learning.data.TugasInformation
import javax.inject.Inject

class MateriViewModel @Inject constructor() : ViewModel(){
    fun materiViewModelProvider(id: Int): MateriInformation {

        return when(id){
            1 -> {
                MateriInformation(1,"User Interface adalah titik interaksi antara manusia dan komputer. Desain User Interface adalah proses merancang bagaimana antarmuka ini terlihat dan berperilaku",R.drawable.img_user_interface, "User Interface")
            }
            2 -> {
                MateriInformation(2,"User Experience adalah ...", R.drawable.img_user_interface, "User Experience")
            }
            3 -> {
                MateriInformation (3,"Perbedaan User Interface dengan User Experience", R.drawable.ui_ux_desain, "Desain Tools")
            }
            else -> {
                MateriInformation(4," Desain Tools yagn digunakan adalah",R.drawable.ui_ux_desain,"Visual Desain")
            }
        }
    }
}