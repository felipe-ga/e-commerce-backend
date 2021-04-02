package com.tul.ecommerce.domain.service

import com.tul.ecommerce.domain.repository.ProductRepository
import com.tul.ecommerce.persitence.ProductRepositoryImpl
import com.tul.ecommerce.persitence.entity.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductService (@Autowired private var productRepository: ProductRepository ) {
    fun getAll():List<Product>{
        return productRepository.getAll();
    }
    fun save(product: Product): Product {
        return productRepository.save(product);
    }
    fun findById(id: UUID): Optional<Product>{
        return productRepository.findById(id);
    }
}