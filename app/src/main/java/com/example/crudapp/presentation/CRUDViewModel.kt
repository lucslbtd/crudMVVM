package com.example.crudapp.presentation

import androidx.lifecycle.ViewModel
import com.example.crudapp.commons.RequestState
import com.example.crudapp.domain.model.TaskInformations
import com.example.crudapp.domain.usecase.CRUDUseCase
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.flow

class CRUDViewModel(private val crudUseCase: CRUDUseCase) : ViewModel() {

    private val _loadTasks = MutableSharedFlow<RequestState<TaskInformations>>()
    val loadTasks = _loadTasks.asSharedFlow()

    fun loadTasks() = flow{
        crudUseCase.loadTasks()
            .onStart { }
            .onCompletion { }
            .catch { _loadTasks.emit(RequestState.Error(it))}
            .collect{ _loadTasks.emit(RequestState.Success(it))}
    }

    fun createTask(name: String, description: String) = flow{
        crudUseCase.createTask(name, description)
            .onStart { }
            .onCompletion { }
            .catch { _loadTasks.emit(RequestState.Error(it))}
            .collect { _loadTasks.emit(RequestState.Success(it))}
    }

    fun deleteTask(id: String) = flow{
        crudUseCase.deleteTask(id)
            .onStart { }
            .onCompletion { }
            .catch { _loadTasks.emit(RequestState.Error(it))}
            .collect { _loadTasks.emit(RequestState.Success(it))}
    }

    // fun updateTask(id: String, name)
}
