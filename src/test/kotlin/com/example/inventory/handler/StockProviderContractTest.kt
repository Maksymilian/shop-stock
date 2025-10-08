package com.example.inventory.handler

import au.com.dius.pact.provider.junit5.PactVerificationContext
import au.com.dius.pact.provider.junitsupport.Provider
import au.com.dius.pact.provider.junitsupport.State
import au.com.dius.pact.provider.junitsupport.loader.PactFolder
import au.com.dius.pact.provider.spring.spring6.PactVerificationSpring6Provider
import au.com.dius.pact.provider.spring.spring6.WebFluxSpring6Target
import com.example.inventory.config.ProductRouteConfiguration
import com.example.inventory.model.CancelTransportCommand
import com.example.inventory.model.DeductionsTransport
import com.example.inventory.model.TransportCommand
import com.example.inventory.service.TransportCancelSuccess
import com.example.inventory.service.TransportRequestSuccess
import com.example.inventory.service.TransportService
import com.example.inventory.service.TransportServiceResult
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestTemplate
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT
import org.springframework.test.context.bean.override.mockito.MockitoBean
import reactor.core.publisher.Mono

@Provider("StockProvider")
@PactFolder("pacts")
@SpringBootTest(webEnvironment = DEFINED_PORT)
class StockProviderContractTest {

    @Autowired
    lateinit private var handler: StockRouteHandler

    @MockitoBean
    lateinit var transportService: TransportService

    @BeforeEach
    fun setup(context: PactVerificationContext) {
        context.target = WebFluxSpring6Target(
            ProductRouteConfiguration().stockApiRoutes(handler)
        )
    }

    @TestTemplate
    @ExtendWith(PactVerificationSpring6Provider::class)
    fun pactVerificationTestTemplate(context: PactVerificationContext) {
        context.verifyInteraction()
    }

    @State("Failed order process")
    fun failedOrderProcessSetup() {
        Mockito.`when`(
            transportService.cancel(
                listOf(
                    CancelTransportCommand(
                        quantity = 4,
                        sku = "TSHIRT-REG-BLU-L-25"
                    )
                )
            )
        ).thenReturn(Mono.just(TransportServiceResult.TransportServiceResultSuccess(TransportCancelSuccess())))
    }

    @State("Prepared order")
    fun preparedOrderSetup() {
        Mockito.`when`(
            transportService.request(
                TransportCommand(
                    orderNumber = "20251004-00042",
                    deductions = listOf(DeductionsTransport(quantity = 4, sku = "TSHIRT-REG-BLU-L-25")),
                )
            )
        ).thenReturn(Mono.just(TransportServiceResult.TransportServiceResultSuccess(TransportRequestSuccess())))
    }

}