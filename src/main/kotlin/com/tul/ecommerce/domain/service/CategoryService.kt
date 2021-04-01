package com.tul.ecommerce.domain.service

import com.tul.ecommerce.domain.repository.CategoryRepository
import com.tul.ecommerce.persitence.crud.ProductCrudRepository
import com.tul.ecommerce.persitence.entity.Category
import com.tul.ecommerce.persitence.entity.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoryService(@Autowired private var categoryRepository: CategoryRepository) {
    fun getAll():List<Category>{
        return categoryRepository.getAll();
    }
    fun save(category: Category): Category{
        return  categoryRepository.save(category);
    }
}