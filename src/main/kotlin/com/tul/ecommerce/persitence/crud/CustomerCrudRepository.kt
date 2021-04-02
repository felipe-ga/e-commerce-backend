package com.tul.ecommerce.persitence.crud

import com.tul.ecommerce.persitence.entity.Customer
import org.springframework.data.repository.CrudRepository
import java.util.*

interface CustomerCrudRepository: CrudRepository<Customer,UUID> {

}