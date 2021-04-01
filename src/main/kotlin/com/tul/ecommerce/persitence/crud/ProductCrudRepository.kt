package com.tul.ecommerce.persitence.crud

import com.tul.ecommerce.persitence.entity.Product
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

interface ProductCrudRepository : CrudRepository<Product,Int>{

}