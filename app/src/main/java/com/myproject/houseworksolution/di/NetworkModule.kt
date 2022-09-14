package com.myproject.houseworksolution.di

import com.myproject.houseworksolution.data.dataSource.network.ApiService
import com.myproject.houseworksolution.data.dataSource.network.RetrofitBuilder.apiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideAuthApi(): ApiService {
        return apiService
    }

}