package com.example.core.di

import com.example.core.data.ProfileRemoteDataSource
import com.example.core.data.ProfileRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface ProfileRemoteDataSourceModule {

    @Binds
    fun bindsProfileRemoteDataSource(impl: ProfileRemoteDataSourceImpl): ProfileRemoteDataSource
}