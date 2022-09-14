package com.myproject.houseworksolution.data.dataSource.network

import okhttp3.OkHttpClient

object MyOkHttpClient {
    var client: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(BasicAuthInterceptor("OneClickSolution", "OneClickSolution@123"))
        .build()
}