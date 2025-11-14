package com.musab.ecommerce_rest_apis.repositories;

import com.musab.ecommerce_rest_apis.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}