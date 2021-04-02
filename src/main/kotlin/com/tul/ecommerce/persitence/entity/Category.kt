package com.tul.ecommerce.persitence.entity

import com.tul.ecommerce.domain.models.StatusCatalog
import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "category")
data class Category (
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id_category",columnDefinition = "BINARY(16)")
    val idCategory: UUID?,
    val description: String,
    val status: StatusCatalog
)