package com.example.inventory.config

import com.example.inventory.handler.ProductRouteHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.web.reactive.function.server.router

@Configuration
internal class ProductRouteConfiguration {

    @Bean
    fun apiRoutes(handler: ProductRouteHandler) = router {
            accept(APPLICATION_JSON).nest {
                POST("/api/product", handler::addProduct)
            }
        }
}
