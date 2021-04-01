package com.tul.ecommerce.persitence.entity

import org.apache.tomcat.jni.Local
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "purchases_customer")
data class PurchasesCustomersView (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id_purchase")
        val idPurchase: Int,
        @Column(name = "id_customer")
        val idCustomer: Int,
        @Column(name = "date_purchase")
        val date: LocalDateTime,
        @Column(name = "payment_method")
        val paymentMethod: String,
        val comments: String,
        @Column(name = "status_purchase")
        val status: Int,

        val quantity: Int,
        val total: Float,
        @Column(name = "name_product")
        val name: String,
        val sku: String,
        val description: String,
        val price: Float
)