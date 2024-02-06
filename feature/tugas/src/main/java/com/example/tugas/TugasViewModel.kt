package com.example.tugas

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.core.TugasInformation
import com.example.core.local.PreferenceHelper
import com.example.core.util.KeyConstant
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.lifecycle.HiltViewModel
import java.lang.reflect.Type
import javax.inject.Inject

@HiltViewModel
class TugasViewModel @Inject constructor(private val preferenceHelper: PreferenceHelper) : ViewModel(){
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
    fun lockJawaban (data: TugasInformation){
        val userName = preferenceHelper.getStringInSharedPreference(KeyConstant.USERNAME_KEY)
        val listOfHasil = preferenceHelper.getStringInSharedPreference("$userName${userName.last()}")
        if (!listOfHasil.isNullOrEmpty()){
            val consumeType: Type =
                object : TypeToken<List<TugasInformation>>() {}.type
            val consume: MutableList<TugasInformation> =
                Gson().fromJson<List<TugasInformation>?>(listOfHasil, consumeType).toMutableList()
            consume.add(data)
            val saveValue = Gson().toJson(consume)
            preferenceHelper.saveStringInSharedPreference("$userName${userName.last()}",saveValue)
        }else {
            val consumeType: Type =
                object : TypeToken<List<TugasInformation>>() {}.type
            val consume: List<TugasInformation> = listOf(data)
            val saveValue = Gson().toJson(consume)
            preferenceHelper.saveStringInSharedPreference("$userName${userName.last()}",saveValue)
        }

    }
    fun locked (data: TugasInformation) : Boolean {
        val userName = preferenceHelper.getStringInSharedPreference(KeyConstant.USERNAME_KEY)
        val listOfHasil = preferenceHelper.getStringInSharedPreference("$userName${userName.last()}")
        Log.e("TAG", "locked:$listOfHasil ", )
        if (!listOfHasil.isNullOrEmpty()){
            val consumeType: Type =
                object : TypeToken<List<TugasInformation>>() {}.type
            val consume: MutableList<TugasInformation> =
                Gson().fromJson<List<TugasInformation>?>(listOfHasil, consumeType).toMutableList()
            val returnValue = consume.any{it.id == data.id}
            return returnValue
        }else return false

    }
}