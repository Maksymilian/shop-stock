package com.example.inventory.service

import com.example.inventory.mapper.Mapper
import com.example.inventory.model.CancelTransportCommand
import com.example.inventory.model.CreateProduct
import com.example.inventory.model.CreatedProduct
import com.example.inventory.model.TransportCommand
import com.example.inventory.repository.ProductRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.reactive.TransactionalOperator
import reactor.core.publisher.Mono

@Service
class TransportServiceImpl(
    val mapper: Mapper,
    val productRepository: ProductRepository,
    val transactionalOperator: TransactionalOperator,
) : TransportService {
    override fun request(product: TransportCommand): Mono<TransportServiceResult<TransportRequestSuccess>> {
        TODO("Not yet implemented")
    }

    override fun cancel(product: List<CancelTransportCommand>): Mono<TransportServiceResult<TransportCancelSuccess>> {
        TODO("Not yet implemented")
    }

}
