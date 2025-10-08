package com.example.inventory.handler

import com.example.inventory.dto.CancelTransportRequest
import com.example.inventory.dto.TransportRequest
import com.example.inventory.mapper.Mapper
import com.example.inventory.service.TransportService
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.noContent
import reactor.core.publisher.Mono

@Component
class StockRouteHandler(val mapper: Mapper, val transportService: TransportService) {
    fun requestTransport(request: ServerRequest): Mono<ServerResponse> {
        return request
            .bodyToMono(TransportRequest::class.java)
            .map { mapper.mapToAggregate(it) }
            .flatMap { product -> transportService.request(product) }
            .flatMap { result -> noContent().build() }
    }

    fun cancelTransport(request: ServerRequest): Mono<ServerResponse> {
        return request
            .bodyToMono(Array<CancelTransportRequest>::class.java)
            .map { mapper.mapToAggregate(it) }
            .flatMap { product -> transportService.cancel(product) }
            .flatMap { result -> noContent().build() }
    }
}
