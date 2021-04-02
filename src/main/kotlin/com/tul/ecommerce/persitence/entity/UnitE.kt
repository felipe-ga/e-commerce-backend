package com.tul.ecommerce.persitence.entity

import com.tul.ecommerce.domain.models.StatusCatalog
import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "unit")
data class UnitE (
        @Id
        @GeneratedValue(generator = "uuid2")
        @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
        @Column(name = "id_unit",columnDefinition = "BINARY(16)")
        val idUnit: UUID?,
        val name: String,
        val status: StatusCatalog
)