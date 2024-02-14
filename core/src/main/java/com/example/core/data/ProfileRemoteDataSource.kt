package com.example.core.data

import android.content.Intent
import com.example.core.model.DataSourceResult
import com.ian.junemon.foodiepedia.core.data.datasource.remote.firebaseuser.AuthenticatedUserInfo
import kotlinx.coroutines.flow.Flow

interface ProfileRemoteDataSource {

    fun getUserProfile(): Flow<DataSourceResult<AuthenticatedUserInfo>>

    suspend fun initSignIn(): Intent

    suspend fun initLogout(onComplete: () -> Unit)
}