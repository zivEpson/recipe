package com.section7.recipe.repositories;

import com.section7.recipe.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long>{

    Optional<UnitOfMeasure> findByDescription(String desctiption);
}
