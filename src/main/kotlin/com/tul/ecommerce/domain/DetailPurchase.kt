package com.tul.ecommerce.domain

import java.time.LocalDateTime

class DetailPurchase {
    val id_purchase: Int = 0
    val id_customer: Int = 0
    val dat_purchase: LocalDateTime = LocalDateTime.now()
    val payment_method: String = ""
    val comments: String = ""
    val status_purchase: String = ""
    val quantity: Int = 0
    val total: Int = 0
    val sku: String = ""
    val description: String = ""
    val price: Int = 0

}