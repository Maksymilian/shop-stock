package com.example.inventory.dto

import java.time.Instant
import java.util.UUID

data class CreatedProductDTO(val id: UUID,
                             val name: String,
                             val createdAt: Instant,
                             val barcode: String,
                             val sku: String)