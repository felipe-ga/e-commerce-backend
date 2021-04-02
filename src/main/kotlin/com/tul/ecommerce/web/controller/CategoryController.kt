package com.tul.ecommerce.web.controller

import com.tul.ecommerce.domain.service.CategoryService
import com.tul.ecommerce.domain.service.ProductService
import com.tul.ecommerce.persitence.entity.Category
import com.tul.ecommerce.persitence.entity.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/category")
class CategoryController(@Autowired private var serviceCategory: CategoryService) {

    @GetMapping("/")
    fun getAll(): ResponseEntity<List<Category>> {
        return ResponseEntity(serviceCategory?.getAll(),HttpStatus.OK);
    }

    @GetMapping("/id/{idCategory}")
    fun getCategory(@PathVariable("idCategory") idCategory:UUID): ResponseEntity<Optional<Category>> {
        return ResponseEntity(serviceCategory.findCategory(idCategory),HttpStatus.OK);
    }

    @PostMapping("/")
    fun save(@RequestBody category: Category): Category{
        return serviceCategory.save(category);
    }
}