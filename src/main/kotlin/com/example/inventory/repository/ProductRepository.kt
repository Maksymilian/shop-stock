package com.example.inventory.repository

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import java.util.UUID

interface ProductRepository : ReactiveCrudRepository<ProductEntity, UUID>
