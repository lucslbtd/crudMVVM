package com.example.crudapp.data.repository

import com.example.crudapp.data.network.EndPoints
import kotlinx.coroutines.flow.flow

class CRUDRepository(private val endPoints: EndPoints) {

    suspend fun createTask() = flow{}

    suspend fun updateTask() = flow{}

    suspend fun deleteTask() = flow{}

    suspend fun loadTasks() = flow{}
}