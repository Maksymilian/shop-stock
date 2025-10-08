package com.example.inventory.handler

import com.example.inventory.dto.CreateProductRequest
import com.example.inventory.mapper.Mapper
import com.example.inventory.service.CreateProductService
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.created
import reactor.core.publisher.Mono
import java.net.URI
import java.util.UUID

@Component
class ProductRouteHandler(val mapper: Mapper, val createProductService: CreateProductService) {
    fun addProduct(request: ServerRequest): Mono<ServerResponse> {
        return request
            .bodyToMono(CreateProductRequest::class.java)
            .map { mapper.mapToAggregate(UUID.randomUUID(), it) }
            .flatMap { product -> createProductService.create(product) }
            .map(mapper::mapToDto)
            .flatMap { created -> created(URI.create("http://localhost:8020/test/" + created.id)).bodyValue(created) }
    }
}
