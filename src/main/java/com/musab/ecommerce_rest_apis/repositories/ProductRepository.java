package com.musab.ecommerce_rest_apis.repositories;

import com.musab.ecommerce_rest_apis.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}