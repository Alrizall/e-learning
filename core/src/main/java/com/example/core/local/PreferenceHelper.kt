package com.example.core.local

interface PreferenceHelper {

    fun saveStringInSharedPreference(key: String, value: String?)

    fun getStringInSharedPreference(key: String): String

    fun deleteSharedPreference(key: String)

    fun deleteAllSharedPrefrence()
}
