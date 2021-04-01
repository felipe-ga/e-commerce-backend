package com.tul.ecommerce.persitence.entity

import com.tul.ecommerce.domain.models.StatusCatalog
import javax.persistence.*

@Entity
@Table(name = "unit")
data class Unit (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_unit")
        val idUnit: Integer?,
        val name: String,
        val status: StatusCatalog
)