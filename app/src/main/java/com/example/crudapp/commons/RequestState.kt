package com.example.crudapp.commons

sealed class RequestState<out T> {
    //    data class Loading (val t: Boolean): RequestState<Nothing>()
    object Loading : RequestState<Nothing>()
    //    data class Success<T>(val data: T) : RequestState<T>()
    data class Error(val t: Throwable) : RequestState<Nothing>()
    data class Success<T>(val list: List<T>) : RequestState<List<T>>()
//    data class Success<T>(val list: T) : RequestState<T>()


}