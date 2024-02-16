package com.example.profil;

import androidx.lifecycle.ViewModel;
import com.example.core.data.ProfileRemoteDataSource;
import com.example.core.local.PreferenceHelper;
import com.example.core.util.KeyConstant;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u001f\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/profil/ProfilViewModel;", "Landroidx/lifecycle/ViewModel;", "preferenceHelper", "Lcom/example/core/local/PreferenceHelper;", "profileRemoteDataSource", "Lcom/example/core/data/ProfileRemoteDataSource;", "(Lcom/example/core/local/PreferenceHelper;Lcom/example/core/data/ProfileRemoteDataSource;)V", "deleteUserName", "", "getUserName", "", "initLogout", "successLogout", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "profil_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ProfilViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.core.local.PreferenceHelper preferenceHelper = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.core.data.ProfileRemoteDataSource profileRemoteDataSource = null;
    
    @javax.inject.Inject
    public ProfilViewModel(@org.jetbrains.annotations.NotNull
    com.example.core.local.PreferenceHelper preferenceHelper, @org.jetbrains.annotations.NotNull
    com.example.core.data.ProfileRemoteDataSource profileRemoteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void deleteUserName() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object initLogout(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> successLogout, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}