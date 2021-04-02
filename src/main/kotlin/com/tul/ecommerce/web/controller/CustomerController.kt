package com.tul.ecommerce.web.controller

import com.tul.ecommerce.domain.service.CategoryService
import com.tul.ecommerce.domain.service.CustomerService
import com.tul.ecommerce.persitence.entity.Category
import com.tul.ecommerce.persitence.entity.Customer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/customer")
class CustomerController(@Autowired private var serviceCustomer: CustomerService) {
    @GetMapping("/")
    fun getAll(): ResponseEntity<List<Customer>> {
        return ResponseEntity(serviceCustomer?.getAll(), HttpStatus.OK);
    }

    @GetMapping("/id/{idCustomer}")
    fun getCategory(@PathVariable("idCustomer") idCustomer: UUID): ResponseEntity<Optional<Customer>> {
        return ResponseEntity(serviceCustomer.findCategory(idCustomer), HttpStatus.OK);
    }

    @PostMapping("/")
    fun save(@RequestBody customer: Customer): Customer {
        return serviceCustomer.save(customer);
    }
}