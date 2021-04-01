package com.tul.ecommerce.persitence.crud

import com.tul.ecommerce.domain.DetailPurchase
import com.tul.ecommerce.domain.ResponseDetailPurchase
import com.tul.ecommerce.persitence.entity.PurchaseEntity
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import javax.persistence.EntityManager

interface PurchaseCrudRepository: CrudRepository<PurchaseEntity, Int>{
}