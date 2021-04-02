package com.tul.ecommerce.domain.repository

import com.tul.ecommerce.persitence.entity.Product
import java.util.*


interface ProductRepository {
    fun getAll(): List<Product>;
    fun save(product: Product): Product;
    fun findById(id: UUID): Optional<Product>;
    fun deleteById(id: UUID);
}