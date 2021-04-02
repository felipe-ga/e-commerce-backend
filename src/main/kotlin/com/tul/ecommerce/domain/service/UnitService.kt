package com.tul.ecommerce.domain.service

import com.tul.ecommerce.domain.repository.UnitRepository
import com.tul.ecommerce.persitence.entity.UnitE
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class UnitService(@Autowired private var unitRepository: UnitRepository) {
    fun getAll():List<UnitE>{
        return unitRepository.getAll();
    }
    fun save(unit: UnitE): UnitE {
        return  unitRepository.save(unit);
    }
    fun findCategory(idUnit: UUID): Optional<UnitE> {
        return unitRepository.findById(idUnit);
    }
}