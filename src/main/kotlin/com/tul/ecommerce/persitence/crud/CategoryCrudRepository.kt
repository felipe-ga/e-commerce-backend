package com.tul.ecommerce.persitence.crud

import com.tul.ecommerce.persitence.entity.Category
import org.springframework.data.repository.CrudRepository
import java.util.*

interface CategoryCrudRepository : CrudRepository<Category, UUID>{

}