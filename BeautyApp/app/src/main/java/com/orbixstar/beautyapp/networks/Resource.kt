package com.orbixstar.beautyapp.networks

import com.orbixstar.beautyapp.enums.Status


data class Resource<out T>(val status: Status, val response: T?, val message: String?) {
    companion object {
        fun <T> success(response: T): Resource<T> =  Resource(status = Status.SUCCESS, response = response, message = null)

        fun <T> error(response: T?, message: String): Resource<T> =
            Resource(status = Status.ERROR, response = response, message = message)

        fun <T> loading(response: T?): Resource<T> = Resource(status = Status.LOADING, response = response, message = null)
    }
}