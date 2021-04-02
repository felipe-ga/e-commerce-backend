package com.tul.ecommerce.persitence.entity

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "customer")
data class Customer (

        @Id
        @GeneratedValue(generator = "uuid2")
        @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(name = "id_customer",columnDefinition = "BINARY(16)")
    val idCustomer: UUID,

    val name: String,

    @Column(name = "last_name")
    val lastName: String,

    val phone: String,
    val address: String,
    val email: String,
    val password: String?
)