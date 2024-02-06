package com.example.nilai

import androidx.lifecycle.ViewModel
import com.example.core.NilaiInformation
import com.example.core.local.PreferenceHelper
import com.example.core.util.KeyConstant
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.lifecycle.HiltViewModel
import java.lang.reflect.Type
import javax.inject.Inject

@HiltViewModel
class NilaiViewModel @Inject constructor(private val preferenceHelper: PreferenceHelper) :
    ViewModel() {
    fun nilaiInformationProvider(): List<NilaiInformation> {
        val consumeType: Type =
            object : TypeToken<List<NilaiInformation>>() {}.type
        val userName = preferenceHelper.getStringInSharedPreference(KeyConstant.USERNAME_KEY)
        val listOfHasil =
            preferenceHelper.getStringInSharedPreference("$userName${userName.first()}")
        return if (!listOfHasil.isNullOrEmpty()) {
            Gson().fromJson<List<NilaiInformation>?>(listOfHasil, consumeType)

        } else {
            emptyList()
        }
    }
}