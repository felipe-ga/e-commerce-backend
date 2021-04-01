package com.tul.ecommerce.persitence.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "purchase")
data class PurchaseEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_purchase")
        val idPurchase: Int?,

        @Column(name = "id_customer")
        val idCustomer: Int,

        @Column(name = "date_purchase")
        val date: LocalDateTime,

        @Column(name = "payment_method")
        val paymentMethod: String,
        @Column(name = "comments")
        val comment: String,
        @Column(name = "status_purchase")
        val status: Int,

        @ManyToOne
        @JoinColumn(name = "id_customer", insertable = false, updatable = false)
        val customer:Customer?

)