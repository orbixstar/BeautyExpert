package com.orbixstar.beautyapp.repo

import android.content.Context
import com.google.gson.GsonBuilder
import com.orbixstar.beautyapp.interfaces.RetrofitService
import com.orbixstar.beautyapp.networks.NetworkConnectionInterceptor
import okhttp3.OkHttpClient
import okhttp3.RequestBody
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class Repository(var context: Context) {

    private val BASE_URL = "https://"+  ".pakid.dev/IdentityDM/api/wrapper/"
    private var retrofitService: RetrofitService

    init {

        retrofitService = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(provideOkHttpClient(provideLoggingInterceptor()))
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(RetrofitService::class.java)

    }

    private fun provideOkHttpClient(interceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .addInterceptor(interceptor)
            .addInterceptor(NetworkConnectionInterceptor(context))
            .retryOnConnectionFailure(true)
            .build()
    }

    private fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BASIC
        return interceptor
    }

    suspend fun callLogin(params: RequestBody) = retrofitService.callLoginApi(params)


}