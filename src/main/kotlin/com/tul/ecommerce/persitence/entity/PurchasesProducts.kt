package com.tul.ecommerce.persitence.entity

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "purchases_products")
data class PurchasesProducts (
        @Id
        @GeneratedValue(generator = "uuid2")
        @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(name = "id_purchases_products",columnDefinition = "BINARY(16)")
        val id: UUID?,

        @Column(name = "id_purchase")
        val idPurchase: UUID,
        @Column(name = "id_product")
        val idProduct: UUID,
        val quantity: Int,
        val total: Float,
        val status: Int
)