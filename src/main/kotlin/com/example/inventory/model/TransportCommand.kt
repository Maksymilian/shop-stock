package com.example.inventory.model

data class TransportCommand(val orderNumber: String, val deductions: List<DeductionsTransport>)
