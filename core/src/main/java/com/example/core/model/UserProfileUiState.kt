package com.example.core.model

import com.ian.junemon.foodiepedia.core.data.datasource.remote.firebaseuser.AuthenticatedUserInfo

data class UserProfileUiState(
    val errorMessage: String,
    val user: AuthenticatedUserInfo?
) {
    companion object {
        fun initial() = UserProfileUiState(
            errorMessage = "",
            user = null
        )
    }
}