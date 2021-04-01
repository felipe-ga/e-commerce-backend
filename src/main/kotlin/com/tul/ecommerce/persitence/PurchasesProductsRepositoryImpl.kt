package com.tul.ecommerce.persitence

import com.tul.ecommerce.domain.repository.PurchasesProductsRepository
import com.tul.ecommerce.persitence.crud.PurchasesProductsCrudRepository
import com.tul.ecommerce.persitence.crud.PurchasesProductsViewCrudRepository
import com.tul.ecommerce.persitence.entity.PurchasesCustomersView
import com.tul.ecommerce.persitence.entity.PurchasesProducts
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository

@Repository
class PurchasesProductsRepositoryImpl(@Autowired val purchasesProductsViewCrudRepository: PurchasesProductsViewCrudRepository, @Autowired val purchachesProductsCrudRepository: PurchasesProductsCrudRepository) : PurchasesProductsRepository{
    override fun save(purchasesProducts: List<PurchasesProducts>){
        purchachesProductsCrudRepository.saveAll(purchasesProducts);
    }

    override fun getAllPurchasesAndProductsByCustomer(idCustomer: Int): List<PurchasesCustomersView> {
        return purchasesProductsViewCrudRepository.findByIdCustomer(idCustomer);
    }
}