package com.tul.ecommerce.persitence.crud

import com.tul.ecommerce.persitence.entity.PurchasesProducts
import org.springframework.data.repository.CrudRepository

interface PurchasesProductsCrudRepository : CrudRepository<PurchasesProducts,Integer>{

}