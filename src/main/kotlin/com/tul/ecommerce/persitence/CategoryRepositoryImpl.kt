package com.tul.ecommerce.persitence

import com.tul.ecommerce.domain.repository.CategoryRepository
import com.tul.ecommerce.persitence.crud.CategoryCrudRepository
import com.tul.ecommerce.persitence.entity.Category
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class CategoryRepositoryImpl(@Autowired private var categoryCrudRepository: CategoryCrudRepository) :CategoryRepository {
    override fun getAll(): List<Category> {
        return categoryCrudRepository.findAll() as List<Category>;
    }

    override fun save(category: Category): Category {
        return categoryCrudRepository.save(category);
    }

    override fun findById(id: Int): Optional<Category> {
        return categoryCrudRepository.findById(id);
    }

    override fun deleteById(id: Int) {
        categoryCrudRepository.deleteById(id);
    }
}