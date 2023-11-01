package com.annabea.workshop.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.annabea.workshop.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
}
