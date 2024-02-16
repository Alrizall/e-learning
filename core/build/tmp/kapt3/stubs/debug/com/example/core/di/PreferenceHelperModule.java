package com.example.core.di;

import com.example.core.local.PreferenceHelper;
import com.example.core.local.PreferenceHelperImpl;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/example/core/di/PreferenceHelperModule;", "", "bindsPreferenceHelper", "Lcom/example/core/local/PreferenceHelper;", "impl", "Lcom/example/core/local/PreferenceHelperImpl;", "core_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract interface PreferenceHelperModule {
    
    @dagger.Binds
    @org.jetbrains.annotations.NotNull
    public abstract com.example.core.local.PreferenceHelper bindsPreferenceHelper(@org.jetbrains.annotations.NotNull
    com.example.core.local.PreferenceHelperImpl impl);
}