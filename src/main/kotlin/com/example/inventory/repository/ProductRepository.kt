package com.example.inventory.repository

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import java.util.*

internal interface ProductRepository : ReactiveCrudRepository<ProductEntity, UUID>