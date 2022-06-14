package com.orbixstar.beautyapp.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.liveData
import com.orbixstar.beautyapp.networks.Resource
import com.orbixstar.beautyapp.repo.Repository
import kotlinx.coroutines.Dispatchers
import okhttp3.RequestBody

class AuthViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: Repository = Repository(application.applicationContext)

    fun callLogin(params: RequestBody) = liveData(Dispatchers.IO) {
        emit(Resource.loading(response = null))
        try {
            emit(Resource.success(response = repository.callLogin(params)))
        } catch (exception: Exception) {
            emit(Resource.error(response = null, message = exception.message ?: "Error Occurred!"))
        }
    }

    private fun callContinueLogin(session: String, params: RequestBody) = liveData(Dispatchers.IO) {
        emit(Resource.loading(response = null))
        try {
          //  emit(Resource.success(response = repository.callContinueLogin(session, params)))
        } catch (exception: Exception) {
            emit(Resource.error(response = null, message = exception.message ?: "Error Occurred!"))
        }
    }

}