package com.example.inventory.dto

import java.math.BigDecimal
import java.time.Instant

data class ProductDTO(val name: String,
                      val createdAt: Instant,
                      val sku: String,
                      val price: BigDecimal,
                      val barcode: String,
                      val stock: ProductStockDTO,
                      val review: ProductReviewDTO?)// ochrona przed xss
