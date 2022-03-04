package com.example.crudapp.data.network

import com.example.crudapp.domain.model.TaskInformations
import retrofit2.Response
import retrofit2.http.GET

interface EndPoints {

    @GET("api/read.php")
    suspend fun read(): Response<TaskInformations>

    @GET("api/create.php")
    suspend fun create()

    @GET("api/update.php")
    suspend fun update()

    @GET("api/delete.php")
    suspend fun delete()
}
