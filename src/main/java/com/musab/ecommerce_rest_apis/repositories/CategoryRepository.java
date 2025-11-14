package com.musab.ecommerce_rest_apis.repositories;

import com.musab.ecommerce_rest_apis.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}