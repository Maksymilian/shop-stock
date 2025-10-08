package com.example.inventory.service

import com.example.inventory.model.CancelTransportCommand
import com.example.inventory.model.TransportCommand
import reactor.core.publisher.Mono

interface TransportService {
    fun request(product: TransportCommand): Mono<TransportServiceResult<TransportRequestSuccess>>
    fun cancel(product: List<CancelTransportCommand>): Mono<TransportServiceResult<TransportCancelSuccess>>
}