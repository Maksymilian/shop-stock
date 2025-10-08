package com.example.inventory.dto

import java.math.BigDecimal
import java.time.Instant

data class CreateProductRequest(
    val name: String,
    val createdAt: Instant,
    val sku: String,
    val price: BigDecimal,
    val barcode: String,
    val stock: ProductStockRequest,
    val review: ProductReviewRequest?,
) // ochrona przed xss
