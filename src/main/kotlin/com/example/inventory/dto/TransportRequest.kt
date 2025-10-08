package com.example.inventory.dto

data class TransportRequest(val orderNumber: String, val deductions: List<DeductionsTransportRequest>)
