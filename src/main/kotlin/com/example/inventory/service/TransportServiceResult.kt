package com.example.inventory.service

sealed class TransportServiceResult<out T> {
    data class TransportServiceResultSuccess<T>(val data: T) : TransportServiceResult<T>()

    data class TransportServiceResultFailure(val message: String) : TransportServiceResult<Nothing>()
}

class TransportRequestSuccess()

class TransportCancelSuccess()
