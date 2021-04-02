package com.tul.ecommerce.persitence

import com.tul.ecommerce.domain.repository.UnitRepository
import com.tul.ecommerce.persitence.crud.UnitCrudRepository
import com.tul.ecommerce.persitence.entity.UnitE
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class UnitRepositoryImpl(@Autowired private var unitCrudRepository:UnitCrudRepository): UnitRepository {
    override fun getAll(): List<UnitE> {
        return unitCrudRepository.findAll() as List<UnitE>;
    }

    override fun save(unit: UnitE): UnitE {
        return unitCrudRepository.save(unit);
    }

    override fun findById(id: UUID): Optional<UnitE> {
        return unitCrudRepository.findById(id);
    }

    override fun deleteById(id: UUID) {
        return  unitCrudRepository.deleteById(id);
    }
}