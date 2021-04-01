package com.tul.ecommerce.persitence.entity

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
data class PurchasesProductsPK(

    @Column(name = "id_purchase")
    val idPurchase: Integer? = null,

    @Column(name = "id_product")
    val idProduct: Integer? = null

): Serializable