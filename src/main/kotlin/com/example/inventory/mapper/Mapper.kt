package com.example.inventory.mapper

import com.example.inventory.dto.CancelTransportRequest
import com.example.inventory.dto.CreateProductRequest
import com.example.inventory.dto.CreatedProductResponse
import com.example.inventory.dto.TransportRequest
import com.example.inventory.model.BarcodeVO
import com.example.inventory.model.CancelTransportCommand
import com.example.inventory.model.CreateProduct
import com.example.inventory.model.CreatedProduct
import com.example.inventory.model.DeductionsTransport
import com.example.inventory.model.PriceVO
import com.example.inventory.model.ProductReview
import com.example.inventory.model.ProductStock
import com.example.inventory.model.TransportCommand
import com.example.inventory.repository.ProductEntity
import org.springframework.stereotype.Component
import java.util.UUID

// TODO possible enhancement: implement with MapStruct
@Component
class Mapper {
    fun mapToAggregate(
        id: UUID,
        productDto: CreateProductRequest,
    ) = with(productDto) {
        CreateProduct(
            name = name,
            sku = sku,
            createdAt = productDto.createdAt,
            price = PriceVO(price, "USD"),
            review = review?.let { ProductReview(it.text) },
            barcodeVO = BarcodeVO(barcode),
            stock =
                with(stock) {
                    ProductStock(
                        amount = amount,
                        locationId = locationId,
                    )
                },
        )
    }

    fun mapToAggregate(request: Array<CancelTransportRequest>) =
        request.map {
            CancelTransportCommand(quantity = it.quantity, sku = it.sku)
        }

    fun mapToAggregate(request: TransportRequest) =
        with(request) {
            TransportCommand(
                orderNumber = orderNumber,
                deductions = deductions.map { DeductionsTransport(quantity = it.quantity, sku = it.sku) },
            )
        }

    fun mapToDto(createdProduct: CreatedProduct) =
        with(createdProduct) {
            CreatedProductResponse(
                id = id,
                name = name,
                createdAt = createdAt,
                barcode = barcode,
                sku = sku,
            )
        }

    fun mapToEntity(createProduct: CreateProduct) =
        with(createProduct) {
            ProductEntity(
                id = null,
                name = name,
                sku = sku,
                barcodeNumber = barcodeVO.number,
                createdAt = createdAt,
                price = price.amount,
                priceCurrency = price.currency,
                review = review?.text,
            )
        }
}
