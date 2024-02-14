package com.example.core.util

import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.channelFlow


fun FirebaseAuth.valueEventProfileFlow(): Flow<FirebaseAuth> = channelFlow {
    val profileListener = FirebaseAuth.AuthStateListener {
        channel.trySend(it).isSuccess
    }
    addAuthStateListener(profileListener)

    awaitClose {
        removeAuthStateListener(profileListener)
    }
}