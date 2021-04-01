package com.tul.ecommerce.web.controller

import com.tul.ecommerce.domain.service.ProductService
import com.tul.ecommerce.persitence.entity.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/product")
class ProductController(@Autowired private var serviceProduct: ProductService) {
    @CrossOrigin
    @GetMapping("/")
    fun getAll(): ResponseEntity<List<Product>>{
        return ResponseEntity(serviceProduct.getAll(),HttpStatus.OK);
    }
    @CrossOrigin
    @PostMapping("/")
    fun save(@RequestBody product: Product): ResponseEntity<Product>{
        return ResponseEntity(serviceProduct.save(product),HttpStatus.CREATED);
    }
}