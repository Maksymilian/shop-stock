package com.example.inventory.security

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod.POST
import org.springframework.security.config.web.server.ServerHttpSecurity
import org.springframework.security.oauth2.jwt.NimbusReactiveJwtDecoder
import org.springframework.security.oauth2.jwt.ReactiveJwtDecoder
import org.springframework.security.web.server.SecurityWebFilterChain
import org.springframework.security.web.server.context.NoOpServerSecurityContextRepository

@Configuration
class SecurityConfig {
    @Bean
    fun reactiveJwtDecoder(
        @Value("\${spring.security.oauth2.resourceserver.jwt.issuer-uri}")
        issuerUri: String,
    ): ReactiveJwtDecoder {
        return NimbusReactiveJwtDecoder
            .withIssuerLocation(issuerUri)
            .build()
    }

    @Bean
    fun securityWebFilterChain(
        http: ServerHttpSecurity,
        jwtConverter: JwtConverter,
        reactiveJwtDecoder: ReactiveJwtDecoder,
    ): SecurityWebFilterChain {
        return http.csrf { it.disable() }
            .oauth2ResourceServer { oauth2 ->
                oauth2.jwt { jwt ->
                    jwt.jwtAuthenticationConverter(jwtConverter)
                    jwt.jwtDecoder(reactiveJwtDecoder)
                }
            }.authorizeExchange { exchanges ->
                exchanges
                    .pathMatchers(POST, "/api/product").hasAuthority("ADD_PRODUCT")
                    .anyExchange().authenticated()
            }
            .securityContextRepository(NoOpServerSecurityContextRepository.getInstance()).build()
    }
}
