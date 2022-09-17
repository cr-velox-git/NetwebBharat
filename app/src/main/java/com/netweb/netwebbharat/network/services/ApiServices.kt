package com.netweb.netwebbharat.network.services

import com.netweb.netwebbharat.utils.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST


interface ApiServices {
    @POST("any")
    @Headers("username: any")
    suspend fun getAny(@Body any: Any): Response<Any>


}