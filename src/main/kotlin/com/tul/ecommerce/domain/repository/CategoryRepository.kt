package com.tul.ecommerce.domain.repository

import com.tul.ecommerce.persitence.entity.Category
import com.tul.ecommerce.persitence.entity.Unit
import java.util.*

interface CategoryRepository {
    fun getAll(): List<Category>;
    fun save(category: Category): Category;
    fun findById(id: Int): Optional<Category>;
    fun deleteById(id: Int);
}