package com.tul.ecommerce.persitence

import com.tul.ecommerce.domain.DetailPurchase
import com.tul.ecommerce.domain.repository.PurchaseRepository
import com.tul.ecommerce.persitence.crud.PurchaseCrudRepository
import com.tul.ecommerce.persitence.entity.PurchaseEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import java.util.*
import javax.persistence.EntityManager
import javax.persistence.Query

@Repository
class PurchaseRepositoryImpl(@Autowired val purchacheCrudRepository: PurchaseCrudRepository): PurchaseRepository{
    override fun getAll(): List<PurchaseEntity> {
        return purchacheCrudRepository.findAll() as List<PurchaseEntity>;
    }

    override fun save(purchase: PurchaseEntity): PurchaseEntity {
        return purchacheCrudRepository.save(purchase);
    }

    override fun findById(id: Int): Optional<PurchaseEntity> {
        return purchacheCrudRepository.findById(id);
    }

    override fun deleteById(id: Int) {
        purchacheCrudRepository.deleteById(id);
    }
}