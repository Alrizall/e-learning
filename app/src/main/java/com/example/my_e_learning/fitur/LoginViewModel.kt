package com.example.my_e_learning.fitur

import androidx.lifecycle.ViewModel
import com.example.my_e_learning.local.PreferenceHelper
import com.example.my_e_learning.util.KeyConstant.USERNAME_KEY
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val preferenceHelper: PreferenceHelper) : ViewModel() {

    fun saveUserName (username: String) {
        preferenceHelper.saveStringInSharedPreference(USERNAME_KEY,username)
    } //parameter function

    fun getUserName () : String{
        return preferenceHelper.getStringInSharedPreference(USERNAME_KEY)
    }

    fun deleteUserName(){
        preferenceHelper.deleteSharedPreference(USERNAME_KEY)
    }
}