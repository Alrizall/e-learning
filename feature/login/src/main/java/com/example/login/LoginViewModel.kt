package com.example.login

import androidx.lifecycle.ViewModel
import com.example.core.local.PreferenceHelper
import com.example.core.util.KeyConstant.ADMIN_KEY
import com.example.core.util.KeyConstant.USERNAME_KEY
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val preferenceHelper: PreferenceHelper) :
    ViewModel() {

    fun saveUserName(username: String) {
        preferenceHelper.saveStringInSharedPreference(USERNAME_KEY, username)
    }

    fun saveAdmin() {
        preferenceHelper.saveStringInSharedPreference(ADMIN_KEY, "admin")
    }
}