package com.tul.ecommerce.domain.service

import com.tul.ecommerce.domain.repository.CategoryRepository
import com.tul.ecommerce.domain.repository.CustomerRepository
import com.tul.ecommerce.persitence.entity.Category
import com.tul.ecommerce.persitence.entity.Customer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class CustomerService(@Autowired private var customerRepository: CustomerRepository) {
    fun getAll():List<Customer>{
        return customerRepository.getAll();
    }
    fun save(customer: Customer): Customer {
        return  customerRepository.save(customer);
    }
    fun findCategory(idCustomer: UUID): Optional<Customer> {
        return customerRepository.findById(idCustomer);
    }
}