package com.tul.ecommerce.domain.repository

import com.tul.ecommerce.domain.DetailPurchase
import com.tul.ecommerce.domain.Purchase
import com.tul.ecommerce.persitence.entity.PurchaseEntity
import com.tul.ecommerce.persitence.entity.Unit
import java.util.*

interface PurchaseRepository {
    fun getAll(): List<PurchaseEntity>;
    fun save(purchase: PurchaseEntity):PurchaseEntity;
    fun findById(id: Int): Optional<PurchaseEntity>;
    fun deleteById(id: Int);
}