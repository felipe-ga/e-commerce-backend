package com.tul.ecommerce.domain.repository

import com.tul.ecommerce.persitence.entity.PurchaseEntity
import java.util.*

interface PurchaseRepository {
    fun getAll(): List<PurchaseEntity>;
    fun save(purchase: PurchaseEntity):PurchaseEntity;
    fun findById(id: UUID): Optional<PurchaseEntity>;
    fun deleteById(id: UUID);
}