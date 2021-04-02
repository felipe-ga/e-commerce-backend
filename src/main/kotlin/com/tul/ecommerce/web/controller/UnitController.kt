package com.tul.ecommerce.web.controller

import com.tul.ecommerce.domain.service.CategoryService
import com.tul.ecommerce.domain.service.UnitService
import com.tul.ecommerce.persitence.entity.UnitE
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/unit")
public class UnitController(@Autowired private var serviceUnit: UnitService) {
    @GetMapping("/")
    fun getAll(): ResponseEntity<List<UnitE>> {
        return ResponseEntity(serviceUnit?.getAll(), HttpStatus.OK);
    }

    @GetMapping("/id/{idUnit}")
    fun getUnit(@PathVariable("idUnit") idUnit: UUID): ResponseEntity<Optional<UnitE>> {
        return ResponseEntity(serviceUnit.findCategory(idUnit),HttpStatus.OK);
    }

    @PostMapping("/")
    fun save(@RequestBody category: UnitE): UnitE{
        return serviceUnit.save(category);
    }
}