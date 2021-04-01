package com.tul.ecommerce.persitence.entity

import javax.persistence.*

@Entity
@Table(name = "purchases_products")
data class PurchasesProducts (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_purchases_products")
        val id: Int?,

        @Column(name = "id_purchase")
        val idPurchase: Int,
        @Column(name = "id_product")
        val idProduct: Int,
        val quantity: Int,
        val total: Float,
        val status: Int
)