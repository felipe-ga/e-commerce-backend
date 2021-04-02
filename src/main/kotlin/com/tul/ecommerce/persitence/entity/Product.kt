package com.tul.ecommerce.persitence.entity

import com.tul.ecommerce.domain.models.StatusPurchase
import org.hibernate.annotations.GenericGenerator
import javax.persistence.*
import java.util.*

@Entity
@Table(name = "product")
data class Product (
        @Id
        @GeneratedValue(generator = "uuid2")
        @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(name = "id_product",columnDefinition = "BINARY(16)")
        val idProduct: UUID?,
        @Column(name = "id_category")
        val idCategory: UUID,
        @Column(name = "id_unit")
        val idUnit: UUID,

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
        val unit: UnitE?
)