package com.tul.ecommerce.persitence

import com.tul.ecommerce.domain.repository.ProductRepository
import com.tul.ecommerce.persitence.crud.ProductCrudRepository
import com.tul.ecommerce.persitence.entity.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class ProductRepositoryImpl(@Autowired private val productCrudRepository: ProductCrudRepository) : ProductRepository{

    override fun getAll(): List<Product> {
        return productCrudRepository.findAll() as List<Product>;
    }

    override fun save(product: Product): Product {
        return productCrudRepository.save(product);
    }

    override fun findById(id: UUID): Optional<Product> {
        return productCrudRepository.findById(id);
    }

    override fun deleteById(id: UUID) {
        productCrudRepository.deleteById(id);
    }
}