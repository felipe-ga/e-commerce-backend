package com.tul.ecommerce.domain.repository

import com.tul.ecommerce.persitence.entity.Category
import java.util.*

interface CategoryRepository {
    fun getAll(): List<Category>;
    fun save(category: Category): Category;
    fun findById(id: UUID): Optional<Category>;
    fun deleteById(id: UUID);
}