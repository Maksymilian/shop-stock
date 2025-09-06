package com.example.inventory.mapper

import com.example.inventory.dto.CreatedProductDTO
import com.example.inventory.dto.ProductDTO
import com.example.inventory.model.*
import com.example.inventory.repository.ProductEntity
import org.springframework.stereotype.Component
import java.util.*

@Component
internal class Mapper {
    fun mapToAggregate(id: UUID, productDto: ProductDTO) = with(productDto) {
        CreateProduct(
            name = name,
            sku = sku,
            createdAt = productDto.createdAt,
            price = PriceVO(price, "USD"),
            review = review?.let { ProductReview(it.text) },
            barcodeVO = BarcodeVO(barcode),
            stock = with(stock) {
                ProductStock(
                    amount = amount,
                    locationId = locationId
                )
            }
        )
    }

    fun mapToDto(createdProduct: CreatedProduct) = with(createdProduct) {
        CreatedProductDTO(
            id = id,
            name = name,
            createdAt = createdAt,
            barcode = barcode,
            sku = sku
        )
    }

    fun mapToEntity(createProduct: CreateProduct) = with(createProduct) {
        ProductEntity(
            id = null,
            name = name,
            sku = sku,
            barcodeNumber = barcodeVO.number,
            createdAt = createdAt,
            price = price.amount,
            priceCurrency = price.currency,
            review = review?.text
        )
    }
}