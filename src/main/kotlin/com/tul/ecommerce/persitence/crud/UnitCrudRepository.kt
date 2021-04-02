package com.tul.ecommerce.persitence.crud

import com.tul.ecommerce.persitence.entity.UnitE
import org.springframework.data.repository.CrudRepository
import java.util.*

interface UnitCrudRepository :CrudRepository<UnitE,UUID>{
}