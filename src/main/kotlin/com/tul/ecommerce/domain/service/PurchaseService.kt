package com.tul.ecommerce.domain.service

import com.tul.ecommerce.domain.repository.PurchaseRepository
import com.tul.ecommerce.domain.Purchase
import com.tul.ecommerce.domain.repository.PurchasesProductsRepository
import com.tul.ecommerce.persitence.entity.PurchaseEntity
import com.tul.ecommerce.persitence.entity.PurchasesCustomersView
import com.tul.ecommerce.persitence.entity.PurchasesProducts
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PurchaseService(@Autowired val purchaseRepository: PurchaseRepository,@Autowired val purchasesProductsRepository: PurchasesProductsRepository) {
    fun getAll():List<PurchaseEntity>{
        return purchaseRepository.getAll();
    }
    fun save(purchase: Purchase): PurchaseEntity {
        val purchaseEntity = PurchaseEntity(
                null,
                purchase.getIdCustomer(),
                purchase.getDate(),
                purchase.getPaymentMethod(),
                purchase.getComment(),
                purchase.getStatus(),
                null
        );
        val purchaseResponse = purchaseRepository.save(purchaseEntity);
        if(purchaseResponse.idPurchase != null){
            val list: MutableList<PurchasesProducts> = ArrayList()
            for(p in purchase.getProducts()){
                println(p.getIdProduct())
                list.add(PurchasesProducts(0,purchaseResponse.idPurchase,p.getIdProduct(),p.getQuantity(),p.getTotal(),p.getStatus()));
            }
            savePurchasesByProducts(list);
        }
        return purchaseRepository.save(purchaseResponse);
    }
    fun savePurchasesByProducts(purchasesProducts: List<PurchasesProducts>){
        purchasesProductsRepository.save(purchasesProducts);
    }

    fun getAllPurchasesAndProductsByCutomer(idCustomer:Int):List<PurchasesCustomersView>{
        return purchasesProductsRepository.getAllPurchasesAndProductsByCustomer(idCustomer);
    }

}