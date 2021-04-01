package com.tul.ecommerce.persitence.crud

import com.tul.ecommerce.persitence.entity.Unit
import org.springframework.data.repository.CrudRepository

interface UnitCrudRepository :CrudRepository<Unit,Int>{
}