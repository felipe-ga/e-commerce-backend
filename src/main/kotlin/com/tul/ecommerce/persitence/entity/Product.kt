package com.tul.ecommerce.persitence.entity

import com.tul.ecommerce.domain.models.StatusPurchase
import org.hibernate.annotations.GenericGenerator
import javax.persistence.*
import com.tul.ecommerce.persitence.entity.Unit

@Entity
@Table(name = "product")
data class Product (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_product")
        val idProduct: Integer?,
        @Column(name = "id_category")
        val idCategory: Integer,
        @Column(name = "id_unit")
        val idUnit: Integer,

        @Column(name = "name_product")
        val name: String,
        val sku: String,
        val description: String,
        val price: Float,
        val status: StatusPurchase,
        val stock: Integer,
        val discount: Integer,
        val img: String,
        @ManyToOne
        @JoinColumn(name = "id_category", insertable = false, updatable = false)
        val category: Category?,

        @ManyToOne
        @JoinColumn(name = "id_unit", insertable = false, updatable = false)
        val unit: Unit?
)