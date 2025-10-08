package com.example.inventory.model

import java.time.Instant

data class CreateProduct(
    val name: String,
    val sku: String,
    val barcodeVO: BarcodeVO,
    val createdAt: Instant,
    val price: PriceVO,
    val stock: ProductStock,
    val review: ProductReview?,
)
