package com.example.inventory.model

import java.time.Instant
import java.util.UUID

data class CreatedProduct(val id: UUID,
                          val name: String,
                          val createdAt: Instant,
                          val sku: String,
                          val barcode: String)
