package com.tul.ecommerce.persitence.crud

import com.tul.ecommerce.persitence.entity.PurchasesCustomersView
import org.springframework.data.repository.CrudRepository

interface PurchasesProductsViewCrudRepository: CrudRepository<PurchasesCustomersView,Int> {
    fun findByIdCustomer(idCustomer:Int):List<PurchasesCustomersView>;
}