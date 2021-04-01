package com.tul.ecommerce.persitence

import com.tul.ecommerce.domain.repository.UnitRepository
import com.tul.ecommerce.persitence.crud.UnitCrudRepository
import com.tul.ecommerce.persitence.entity.Unit
import org.springframework.beans.factory.annotation.Autowired
import java.util.*

class UnitRepositoryImpl(@Autowired private var unitCrudRepository:UnitCrudRepository): UnitRepository {
    override fun getAll(): List<Unit> {
        return unitCrudRepository.findAll() as List<Unit>;
    }

    override fun save(unit: Unit): Unit {
        return unitCrudRepository.save(unit);
    }

    override fun findById(id: Int): Optional<Unit> {
        return unitCrudRepository.findById(id);
    }

    override fun deleteById(id: Int) {
        return  unitCrudRepository.deleteById(id);
    }
}