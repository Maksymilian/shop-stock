package com.example.inventory.service

import com.example.inventory.mapper.Mapper
import com.example.inventory.model.CreateProduct
import com.example.inventory.model.CreatedProduct
import com.example.inventory.repository.ProductRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.reactive.TransactionalOperator
import reactor.core.publisher.Mono

@Service
internal class CreateProductService(
    val mapper: Mapper,
    val productRepository: ProductRepository,
    val transactionalOperator: TransactionalOperator
) {

    fun create(command: CreateProduct): Mono<CreatedProduct> {
        val entity = mapper.mapToEntity(command)
        return productRepository.save(entity).`as` (transactionalOperator::transactional)
            .map {
                CreatedProduct(
                    id = requireNotNull(it.id),
                    createdAt = it.createdAt,
                    sku = it.sku,
                    name = it.name,
                    barcode = it.barcodeNumber
                )
            }
    }
}