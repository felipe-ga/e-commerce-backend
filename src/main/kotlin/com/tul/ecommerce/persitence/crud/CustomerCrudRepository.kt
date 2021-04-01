package com.tul.ecommerce.persitence.crud

import com.tul.ecommerce.persitence.entity.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerCrudRepository: CrudRepository<Customer,Int> {

}