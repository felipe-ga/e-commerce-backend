package com.tul.ecommerce.domain.repository

import com.tul.ecommerce.persitence.entity.PurchasesCustomersView
import com.tul.ecommerce.persitence.entity.PurchasesProducts

interface PurchasesProductsRepository {
    fun save(purchasesProducts: List<PurchasesProducts>);
    fun getAllPurchasesAndProductsByCustomer(idCustomer:Int):List<PurchasesCustomersView>;
}