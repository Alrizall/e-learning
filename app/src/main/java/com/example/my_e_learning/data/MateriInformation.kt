package com.example.my_e_learning.data

import android.icu.text.CaseMap.Title
import androidx.annotation.DrawableRes

data class MateriInformation (
    val id: Int,
    val decription: String,
    @DrawableRes
    val image: Int,
    val title: String)