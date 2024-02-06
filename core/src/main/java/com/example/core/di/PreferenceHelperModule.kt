package com.example.core.di

import com.example.core.local.PreferenceHelper
import com.example.core.local.PreferenceHelperImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface PreferenceHelperModule {

    @Binds
    fun bindsPreferenceHelper(impl: PreferenceHelperImpl): PreferenceHelper
}
