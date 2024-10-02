package com.app.cv.repository;

import com.app.cv.model.Owner;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface OwnerRepository extends MongoRepository<Owner, String> {

    boolean existsByEmail(@NotNull String username);

    Optional<Owner> findById(String ownerId);

    Owner save(Optional<Owner> owner);
}

