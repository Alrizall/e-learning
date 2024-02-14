package com.example.core.data

import android.content.Context
import android.content.Intent
import com.example.core.model.DataSourceResult
import com.example.core.util.valueEventProfileFlow
import com.firebase.ui.auth.AuthUI
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.auth.FirebaseAuth
import com.ian.junemon.foodiepedia.core.data.datasource.remote.firebaseuser.AuthenticatedUserInfo
import com.ian.junemon.foodiepedia.core.data.datasource.remote.firebaseuser.FirebaseUserInfo
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Created by Ian Damping on 27,January,2020
 * Github https://github.com/iandamping
 * Indonesia.
 */

class ProfileRemoteDataSourceImpl @Inject constructor(
    @ApplicationContext
    private val context: Context,
    private val mFirebaseAuth: FirebaseAuth
) :
    ProfileRemoteDataSource {

    override fun getUserProfile(): Flow<DataSourceResult<AuthenticatedUserInfo>> {
        return mFirebaseAuth.valueEventProfileFlow().map { auth ->
            if (auth.currentUser != null) {
                DataSourceResult.Success(FirebaseUserInfo(auth.currentUser))
            } else {
                DataSourceResult.Error("User not login")
            }
        }
    }

    override suspend fun initSignIn(): Intent {
        return withContext(Dispatchers.IO) {
            // this is mutable because FirebaseUI requires it to be mutable
            val providers = mutableListOf(
                AuthUI.IdpConfig.GoogleBuilder().setSignInOptions(
                    GoogleSignInOptions.Builder()
                        .requestId()
                        .requestEmail()
                        .build()
                ).build()
            )
            AuthUI.getInstance()
                .createSignInIntentBuilder()
                .setAvailableProviders(providers)
                .setIsSmartLockEnabled(false)
                .build()
        }
    }

    override suspend fun initLogout(onComplete: () -> Unit) {
        withContext(Dispatchers.IO) {
            AuthUI.getInstance()
                .signOut(context)
                .addOnCompleteListener { onComplete() }
        }
    }

}