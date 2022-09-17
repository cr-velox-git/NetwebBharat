package com.netweb.netwebbharat.repo

import com.netweb.netwebbharat.network.apisevices.ApiProvider
import com.netweb.netwebbharat.utils.Response
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import org.json.JSONObject
import retrofit2.HttpException
import timber.log.Timber
import java.io.IOException

class Repository {
    private val _any = MutableSharedFlow<Response<Any>>()
    val any: SharedFlow<Response<Any>> = _any.asSharedFlow()

   /* suspend fun getAny(any: Any) {
        _any.emit(Response.Loading())
        try {
            val result = ApiProvider.getApiServices().getAny("")
            if (result.isSuccessful && result.body() != null) {
                _any.emit(Response.Success(result.body()!!))
            } else if (result.errorBody() != null) {
                val errorObj = JSONObject(result.errorBody()!!.charStream().readText())
                _any.emit(Response.Error(errorObj!!.getString("message")))
                Timber.e("${result.code()} ${result.message()}")
            } else {
                _any.emit(Response.Error("Something is Wrong"))
            }
        } catch (e: HttpException) {
            _any.emit(
                Response.Error(
                    message = e.localizedMessage ?: "An Unknown error occurred"
                )
            )
        } catch (e: IOException) {
            _any.emit(
                Response.Error(
                    message = e.localizedMessage ?: "Check Connectivity"
                )
            )
        } catch (e: Exception) {
            _any.emit(
                Response.Error(
                    message = e.localizedMessage ?: "Something is Wrong"
                )
            )
        }

    }*/



}