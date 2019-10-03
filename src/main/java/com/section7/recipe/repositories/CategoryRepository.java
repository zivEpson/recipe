package com.section7.recipe.repositories;

import com.section7.recipe.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long>{

    Optional<Category> findByDescription(String desctiption);
}
