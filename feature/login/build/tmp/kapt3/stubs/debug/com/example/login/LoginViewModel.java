package com.example.login;

import android.content.Intent;
import androidx.lifecycle.ViewModel;
import com.example.core.data.ProfileRemoteDataSource;
import com.example.core.local.PreferenceHelper;
import com.example.core.model.DataSourceResult;
import com.example.core.model.UserProfileUiState;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.StateFlow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "preferenceHelper", "Lcom/example/core/local/PreferenceHelper;", "profileRemoteDataSource", "Lcom/example/core/data/ProfileRemoteDataSource;", "(Lcom/example/core/local/PreferenceHelper;Lcom/example/core/data/ProfileRemoteDataSource;)V", "_userDataState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/core/model/UserProfileUiState;", "userDataState", "Lkotlinx/coroutines/flow/StateFlow;", "getUserDataState", "()Lkotlinx/coroutines/flow/StateFlow;", "initSignIn", "Landroid/content/Intent;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAdmin", "", "saveUserName", "username", "", "login_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.core.local.PreferenceHelper preferenceHelper = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.core.data.ProfileRemoteDataSource profileRemoteDataSource = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.core.model.UserProfileUiState> _userDataState = null;
    
    @javax.inject.Inject
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    com.example.core.local.PreferenceHelper preferenceHelper, @org.jetbrains.annotations.NotNull
    com.example.core.data.ProfileRemoteDataSource profileRemoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.core.model.UserProfileUiState> getUserDataState() {
        return null;
    }
    
    public final void saveUserName(@org.jetbrains.annotations.NotNull
    java.lang.String username) {
    }
    
    public final void saveAdmin() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object initSignIn(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super android.content.Intent> $completion) {
        return null;
    }
}