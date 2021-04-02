package com.tul.ecommerce.domain.repository

import com.tul.ecommerce.persitence.entity.Customer
import java.util.*

interface CustomerRepository {
    fun getAll(): List<Customer>;
    fun save(customer: Customer): Customer;
    fun findById(id: UUID): Optional<Customer>;
    fun deleteById(id: UUID);
}