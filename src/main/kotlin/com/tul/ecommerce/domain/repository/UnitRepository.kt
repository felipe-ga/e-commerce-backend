package com.tul.ecommerce.domain.repository

import com.tul.ecommerce.persitence.entity.UnitE
import java.util.*

interface UnitRepository {
    fun getAll(): List<UnitE>;
    fun save(unit: UnitE): UnitE;
    fun findById(id: UUID): Optional<UnitE>;
    fun deleteById(id: UUID);
}