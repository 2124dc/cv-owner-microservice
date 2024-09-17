package com.app.cv.repository;

import com.app.cv.model.Owner;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface OwnerRepository extends MongoRepository<Owner, String> {

    boolean existsByEmail(@NotNull String username);
   
}

