package com.example.inventory.repository

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.math.BigDecimal
import java.time.Instant
import java.util.UUID

@Table("product")
internal data class ProductEntity(
    @Id
    val id: UUID?,
    val name: String,
    val sku: String,
    val barcodeNumber: String,
    val createdAt: Instant,
    val price: BigDecimal,
    val priceCurrency: String,
    val review: String?
)