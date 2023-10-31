package com.annabea.workshop.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.annabea.workshop.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
}
