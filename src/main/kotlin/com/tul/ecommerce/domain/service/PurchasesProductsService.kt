package com.tul.ecommerce.domain.service

import com.tul.ecommerce.domain.repository.PurchasesProductsRepository
import com.tul.ecommerce.persitence.entity.PurchasesCustomersView
import com.tul.ecommerce.persitence.entity.PurchasesProducts
import org.springframework.beans.factory.annotation.Autowired

class PurchasesProductsService(@Autowired val purchasesProductsRepository: PurchasesProductsRepository) {
    fun save(purchasesProducts: List<PurchasesProducts>) {
        return purchasesProductsRepository.save(purchasesProducts);
    }
    fun getAllPurchasesAndProducts(idCustomer:Int):List<PurchasesCustomersView>{
        return purchasesProductsRepository.getAllPurchasesAndProductsByCustomer(idCustomer);
    }
}