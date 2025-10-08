package com.example.inventory.repository

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table
data class ProductStockEntity(
    @Id
    val id: String,
    val productId: String,
    val amount: Int,
    val locationId: String,
)
