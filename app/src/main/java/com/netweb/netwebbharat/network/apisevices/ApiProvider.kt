package com.netweb.netwebbharat.network.apisevices

import com.netweb.netwebbharat.application.AppController
import com.netweb.netwebbharat.network.RetrofitClientProvider
import com.netweb.netwebbharat.network.services.ApiServices

object ApiProvider {
    @Volatile
    private var apiServices: ApiServices? = null
    private var any: AppController = AppController()

    fun getApiServices(): ApiServices {
        var singletonInstant: ApiServices? = apiServices
        if (singletonInstant == null) {
            synchronized(any) {
                singletonInstant = apiServices
                if (singletonInstant == null) {
                    apiServices = RetrofitClientProvider.getRetrofitClient().create(
                        ApiServices::class.java
                    )
                }
            }
        }
        return apiServices!!
    }
}