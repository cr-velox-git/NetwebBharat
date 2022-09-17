package com.netweb.netwebbharat.network

import com.netweb.netwebbharat.application.AppController
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitClientProvider {
    @Volatile
    private var retrofit: Retrofit? = null
    private var app: AppController = AppController()
    fun getRetrofitClient(): Retrofit {
        var singletonInstant: Retrofit? = retrofit
        if (singletonInstant == null) {
            synchronized(app) {
                singletonInstant = retrofit
                if (singletonInstant == null) {
                    retrofit = Retrofit.Builder()
                        .baseUrl("BASE_URL")
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(OkHttpProvider.getOkHttpClient())
                        .build()
                }
            }
        }
        return retrofit!!
    }

}