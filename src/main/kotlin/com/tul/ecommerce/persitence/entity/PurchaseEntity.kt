package com.tul.ecommerce.persitence.entity

import org.hibernate.annotations.GenericGenerator
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "purchase")
data class PurchaseEntity(
        @Id
        @GeneratedValue(generator = "uuid2")
        @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(name = "id_purchase",columnDefinition = "BINARY(16)")
        val idPurchase: UUID?,

        @Column(name = "id_customer")
        val idCustomer: UUID,

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