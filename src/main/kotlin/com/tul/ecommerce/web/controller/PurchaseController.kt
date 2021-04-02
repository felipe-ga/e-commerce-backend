package com.tul.ecommerce.web.controller

import com.tul.ecommerce.domain.Purchase
import com.tul.ecommerce.domain.service.PurchaseService
import com.tul.ecommerce.persitence.entity.PurchaseEntity
import com.tul.ecommerce.persitence.entity.PurchasesCustomersView
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/purchase")
class PurchaseController(@Autowired private val purchaseService: PurchaseService) {

    @CrossOrigin
    @GetMapping("/")
    fun getAll(): ResponseEntity<List<PurchaseEntity>> {
        return ResponseEntity(purchaseService.getAll(),HttpStatus.OK);
    }

    @Transactional
    @CrossOrigin
    @PostMapping("/")
    fun save(@RequestBody purchase: Purchase): ResponseEntity<PurchaseEntity>{
        return ResponseEntity(purchaseService.save(purchase),HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping("/getAllPurchasesByCustomer/{idcustomer}")
    fun getAllPurchasesByCustomer(@PathVariable("idcustomer") idcustomer:Int): ResponseEntity<List<PurchasesCustomersView>>{
        return ResponseEntity(purchaseService.getAllPurchasesAndProductsByCutomer(idcustomer),HttpStatus.OK);
    }
}