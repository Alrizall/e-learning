package com.ian.junemon.foodiepedia.core.data.datasource.remote.firebaseuser;

import com.google.firebase.auth.FirebaseUser;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/ian/junemon/foodiepedia/core/data/datasource/remote/firebaseuser/FirebaseUserInfo;", "Lcom/ian/junemon/foodiepedia/core/data/datasource/remote/firebaseuser/AuthenticatedUserInfo;", "firebaseUser", "Lcom/google/firebase/auth/FirebaseUser;", "(Lcom/google/firebase/auth/FirebaseUser;)V", "getDisplayName", "", "getEmail", "getUid", "core_debug"})
public class FirebaseUserInfo implements com.ian.junemon.foodiepedia.core.data.datasource.remote.firebaseuser.AuthenticatedUserInfo {
    @org.jetbrains.annotations.Nullable
    private final com.google.firebase.auth.FirebaseUser firebaseUser = null;
    
    public FirebaseUserInfo(@org.jetbrains.annotations.Nullable
    com.google.firebase.auth.FirebaseUser firebaseUser) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.String getEmail() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.String getDisplayName() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.String getUid() {
        return null;
    }
}