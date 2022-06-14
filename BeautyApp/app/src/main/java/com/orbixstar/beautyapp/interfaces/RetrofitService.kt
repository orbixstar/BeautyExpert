package com.orbixstar.beautyapp.interfaces

import com.orbixstar.beautyapp.models.ResultResponse
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.*

interface RetrofitService {

    @POST("Authenticate/Start")
    suspend fun callLoginApi(@Body params: RequestBody): Response<ResultResponse>

}