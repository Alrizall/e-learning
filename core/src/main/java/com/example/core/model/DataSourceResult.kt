package com.example.core.model

sealed interface DataSourceResult<out T> {

    data class Success<out T>(val data: T) : DataSourceResult<T>

    data class Error(val errorMessage: String) : DataSourceResult<Nothing>
}
