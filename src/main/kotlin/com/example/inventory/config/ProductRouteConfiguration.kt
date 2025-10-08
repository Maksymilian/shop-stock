package com.example.inventory.config

import com.example.inventory.handler.ProductRouteHandler
import com.example.inventory.handler.StockRouteHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.web.reactive.function.server.router

@Configuration
class ProductRouteConfiguration {
    @Bean
    fun productApiRoutes(handler: ProductRouteHandler) =
        router {
            accept(APPLICATION_JSON).nest {
                POST("/api/product", handler::addProduct)
            }
        }

    @Bean
    fun stockApiRoutes(handler: StockRouteHandler) =
        router {
            (accept(APPLICATION_JSON)).nest {
                POST("/requestTransport", handler::requestTransport)
                POST("/cancelTransport", handler::cancelTransport)
            }
        }
}
