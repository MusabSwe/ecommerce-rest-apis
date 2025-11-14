package com.musab.ecommerce_rest_apis.repositories;

import com.musab.ecommerce_rest_apis.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}