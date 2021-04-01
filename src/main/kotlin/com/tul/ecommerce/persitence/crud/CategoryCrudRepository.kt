package com.tul.ecommerce.persitence.crud

import com.tul.ecommerce.persitence.entity.Category
import org.springframework.data.repository.CrudRepository

interface CategoryCrudRepository : CrudRepository<Category, Int>{

}