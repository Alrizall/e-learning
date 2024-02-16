package com.ian.junemon.foodiepedia.core.data.datasource.remote.firebaseuser;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ian/junemon/foodiepedia/core/data/datasource/remote/firebaseuser/AuthenticatedUserInfo;", "", "getDisplayName", "", "getEmail", "getUid", "core_debug"})
public abstract interface AuthenticatedUserInfo {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getEmail();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getDisplayName();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getUid();
}