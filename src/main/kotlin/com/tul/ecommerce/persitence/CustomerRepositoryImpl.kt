package com.tul.ecommerce.persitence

import com.tul.ecommerce.domain.repository.CustomerRepository
import com.tul.ecommerce.persitence.crud.CustomerCrudRepository
import com.tul.ecommerce.persitence.entity.Customer
import org.springframework.beans.factory.annotation.Autowired
import java.util.*

class CustomerRepositoryImpl(@Autowired private val customerCrudRepository: CustomerCrudRepository): CustomerRepository {
    override fun getAll(): List<Customer> {
        return customerCrudRepository.findAll() as List<Customer>;
    }

    override fun save(customer: Customer): Customer {
        return customerCrudRepository.save(customer);
    }

    override fun findById(id: Int): Optional<Customer> {
        return customerCrudRepository.findById(id);
    }

    override fun deleteById(id: Int) {
        customerCrudRepository.deleteById(id);
    }
}