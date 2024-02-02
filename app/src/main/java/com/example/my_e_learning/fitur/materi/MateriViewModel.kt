package com.example.my_e_learning.fitur.materi

import androidx.lifecycle.ViewModel
import com.example.my_e_learning.R
import com.example.my_e_learning.data.MateriInformation
import com.example.my_e_learning.data.TugasInformation
import javax.inject.Inject

class MateriViewModel @Inject constructor() : ViewModel() {
    fun materiViewModelProvider(id: Int): MateriInformation {

        return when (id) {
            1 -> {
                MateriInformation(
                    1,
                    " Desain antarmuka pengguna (UI) adalah hal pertama yang Anda temui saat menggunakan aplikasi atau mengunjungi situs web. Desain antarmuka pengguna bertanggung jawab atas tampilan produk, interaktivitas, kegunaan, perilaku, dan nuansa keseluruhan. Desain UI dapat menentukan apakah pengguna memiliki pengalaman positif dengan suatu produk, sehingga penting bagi perusahaan dan pembuat konten untuk memahami praktik terbaik desain UI.",
                    "Jenis Desain Interface",
                    R.drawable.ss_materi_1,
                    "User Interface"
                )
            }

            2 -> {
                MateriInformation(
                    2,
                    "Desain pengalaman pengguna adalah sebuah konsep yang memiliki banyak dimensi, dan mencakup berbagai disiplin ilmu—seperti desain interaksi, arsitektur informasi, desain visual, kegunaan, dan interaksi manusia-komputer.",
                    "Dengan kata lain, desain UX adalah proses mendesain produk (digital atau fisik) yang berguna, mudah digunakan, dan menyenangkan untuk berinteraksi. Ini tentang meningkatkan pengalaman yang dimiliki orang-orang saat berinteraksi dengan produk Anda, dan memastikan mereka menemukan nilai dalam apa yang Anda berikan.",
                    R.drawable.ss_ux,
                    "User Experience"
                )
            }

            3 -> {
                MateriInformation(
                    3,
                    "Desain Tools adalah aplikasi perangkat lunak yang membantu Anda membuat desain. Alat-alat ini membantu Anda membuat wireframes, mockups, prototypes,dan hasil desain lainnya.",
                    "Berikut contoh - contoh desain tools yang paling populer : Figma, Adobe XD, Sketch, Protopie, Framer",
                    R.drawable.img_desain_tools,
                    "Desain Tools"
                )
            }

            else -> {
                MateriInformation(
                    4,
                    " Unsur atau prinsip desain visual meliputi Kontras, Keseimbangan, Penekanan, Gerakan, Ruang Putih, Proporsi, Hierarki, Pengulangan, Irama, Pola, Kesatuan, dan Variasi. Prinsip-prinsip desain ini bekerja sama untuk menciptakan sesuatu yang estetis dan mengoptimalkan pengalaman pengguna.",
                    "Tipografi adalah seni dan teknik mengatur jenis huruf agar bahasa tulisan dapat dibaca, dibaca, dan menarik saat ditampilkan. Penataan tipe meliputi pemilihan tipografi, ukuran titik, panjang garis, spasi baris (leading), dan spasi huruf (tracking), serta pengaturan jarak antar pasangan huruf (kerning).",
                    R.drawable.img_desain_visual,
                    "Visual Desain"
                )
            }
        }
    }
}