package com.example.crudapp.domain.usecase

import com.example.crudapp.data.repository.CRUDRepository
import kotlinx.coroutines.flow.flow

class CRUDUseCase(private val crudRepository: CRUDRepository) {

    suspend fun createTask(name: String, description: Id) = flow{}

    suspend fun updateTask() = flow{}

    suspend fun deleteTask(id: String) = flow{}

    suspend fun loadTasks() = flow{
        val tasks = crudRepository.loadTasks()
        tasks.collect{
            emit(it)
        }
    }
}