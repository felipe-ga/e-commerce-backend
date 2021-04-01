package com.tul.ecommerce.persitence.entity

import javax.persistence.*

@Entity
@Table(name = "customer")
data class Customer (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    val idCustomer: Integer,

    val name: String,

    @Column(name = "last_name")
    val lastName: String,

    val phone: String,
    val address: String,
    val email: String,
    val password: String?
)