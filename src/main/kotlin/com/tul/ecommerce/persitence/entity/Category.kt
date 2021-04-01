package com.tul.ecommerce.persitence.entity

import com.tul.ecommerce.domain.models.StatusCatalog
import javax.persistence.*

@Entity
@Table(name = "category")
data class Category (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    val idCategory: Integer?,
    val description: String,
    val status: StatusCatalog
)