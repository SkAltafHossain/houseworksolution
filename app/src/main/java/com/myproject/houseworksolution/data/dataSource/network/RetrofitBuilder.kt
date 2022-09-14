package com.myproject.houseworksolution.data.dataSource.network

import com.myproject.houseworksolution.BuildConfig
import com.myproject.houseworksolution.data.dataSource.network.ApiService
import com.myproject.houseworksolution.data.dataSource.network.MyOkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .client(MyOkHttpClient.client)
            .addConverterFactory(GsonConverterFactory.create())
            .build() //Doesn't require the adapter
    }

    val apiService: ApiService = getRetrofit().create(ApiService::class.java)

}