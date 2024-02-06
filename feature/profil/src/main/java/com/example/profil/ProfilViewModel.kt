package com.example.profil

import androidx.lifecycle.ViewModel
import com.example.core.local.PreferenceHelper
import com.example.core.util.KeyConstant
import com.example.core.util.KeyConstant.ADMIN_KEY
import com.example.core.util.KeyConstant.USERNAME_KEY
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProfilViewModel @Inject constructor(private val preferenceHelper: PreferenceHelper) :
    ViewModel() {
    fun getUserName(): String {
        return preferenceHelper.getStringInSharedPreference(KeyConstant.USERNAME_KEY)
    }
    fun deleteUserName(){
        preferenceHelper.deleteSharedPreference(USERNAME_KEY)
        preferenceHelper.deleteSharedPreference(ADMIN_KEY)
    }
}