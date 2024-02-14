package com.example.login

import android.content.Intent
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.data.ProfileRemoteDataSource
import com.example.core.local.PreferenceHelper
import com.example.core.model.DataSourceResult
import com.example.core.util.KeyConstant.ADMIN_KEY
import com.example.core.util.KeyConstant.USERNAME_KEY
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val preferenceHelper: PreferenceHelper,
    private val profileRemoteDataSource: ProfileRemoteDataSource
) :
    ViewModel() {

    private val _userDataState: MutableStateFlow<UserProfileUiState> = MutableStateFlow(
        UserProfileUiState.initial())
    val userDataState : StateFlow<UserProfileUiState> get() = _userDataState.asStateFlow()

    init {
        viewModelScope.launch {
            profileRemoteDataSource.getUserProfile().onEach{ result ->
                when(result) {
                    is DataSourceResult.Error -> _userDataState.update { currentUiState ->
                        currentUiState.copy(errorMessage = result.errorMessage, user = null)
                    }
                    is DataSourceResult.Success -> _userDataState.update { currentUiState ->
                        currentUiState.copy(errorMessage = "", user = result.data)

                    }
                }
            }.launchIn(this)
        }
    }
    fun saveUserName(username: String) {
        preferenceHelper.saveStringInSharedPreference(USERNAME_KEY, username)
    }

    fun saveAdmin() {
        preferenceHelper.saveStringInSharedPreference(ADMIN_KEY, "admin")
    }
    suspend fun initSignIn(): Intent = profileRemoteDataSource.initSignIn()




}