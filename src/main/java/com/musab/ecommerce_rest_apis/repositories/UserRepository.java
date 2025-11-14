package com.musab.ecommerce_rest_apis.repositories;

import com.musab.ecommerce_rest_apis.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
