package com.tul.ecommerce.domain.repository

import com.tul.ecommerce.persitence.entity.Category
import com.tul.ecommerce.persitence.entity.Unit
import java.util.*

interface UnitRepository {
    fun getAll(): List<Unit>;
    fun save(unit: Unit): Unit;
    fun findById(id: Int): Optional<Unit>;
    fun deleteById(id: Int);
}