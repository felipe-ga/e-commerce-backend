package com.tul.ecommerce.domain.repository

import com.tul.ecommerce.persitence.entity.Product
import com.tul.ecommerce.persitence.entity.Unit
import java.util.*


interface ProductRepository {
    fun getAll(): List<Product>;
    fun save(product: Product): Product;
    fun findById(id: Int): Optional<Product>;
    fun deleteById(id: Int);
}