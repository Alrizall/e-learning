package com.example.my_e_learning.fitur.quiz

import androidx.lifecycle.ViewModel
import com.example.my_e_learning.R
import com.example.my_e_learning.data.MateriInformation
import com.example.my_e_learning.data.NilaiInformation
import com.example.my_e_learning.data.QuizInformation
import com.example.my_e_learning.local.PreferenceHelper
import com.example.my_e_learning.util.KeyConstant
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.lifecycle.HiltViewModel
import java.lang.reflect.Type
import javax.inject.Inject

@HiltViewModel
class QuizViewModel @Inject constructor(private val preferenceHelper: PreferenceHelper): ViewModel() {

    fun provideQuiz(): List<QuizInformation> {
        return listOf(
            QuizInformation(
                id = 1,
                question = "a1",
                answer1 = "b1",
                answer2 = "c1",
                answer3 = "d1",
                answer4 = "e1",
                correctAnswer = "b1",
            ),
            QuizInformation(
                id = 2,
                question = "a2",
                answer1 = "b2",
                answer2 = "c2",
                answer3 = "d2",
                answer4 = "e2",
                correctAnswer = "c2",
            ),
            QuizInformation(
                id = 3,
                question = "a3",
                answer1 = "b3",
                answer2 = "c3",
                answer3 = "d3",
                answer4 = "e3",
                correctAnswer = "d3",
            ),
            QuizInformation(
                id = 4,
                question = "a4",
                answer1 = "b4",
                answer2 = "c4",
                answer3 = "d4",
                answer4 = "e4",
                correctAnswer = "e4",
            ),
            QuizInformation(
                id = 5,
                question = "a5",
                answer1 = "b5",
                answer2 = "c5",
                answer3 = "d5",
                answer4 = "e5",
                correctAnswer = "e5",
            ),
        )
    }

    fun saveNilai (nilai : Int){
        val consumeType: Type =
            object : TypeToken<List<NilaiInformation>>() {}.type
        val userName = preferenceHelper.getStringInSharedPreference(KeyConstant.USERNAME_KEY)
        val listOfHasil = preferenceHelper.getStringInSharedPreference("$userName${userName.first()}")
        if (!listOfHasil.isNullOrEmpty()) {
            val consume: MutableList<NilaiInformation> =
                Gson().fromJson<List<NilaiInformation>?>(listOfHasil, consumeType).toMutableList()
            consume.add(NilaiInformation(consume.last().id + 1, "hasil nilai =", nilai * 20))
            val saveValue = Gson().toJson(consume)
            preferenceHelper.saveStringInSharedPreference("$userName${userName.first()}", saveValue)

        }else {
           val listOfHasil = listOf(NilaiInformation(1, "hasil nilai =", nilai * 20))
            val saveValue = Gson().toJson(listOfHasil)
            preferenceHelper.saveStringInSharedPreference("$userName${userName.first()}", saveValue)
        }
    }

    fun getQuestion(id:Int): QuizInformation {
        return provideQuiz()[id]
    }
}