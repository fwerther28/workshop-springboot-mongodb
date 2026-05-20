package com.fwerther28.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.fwerther28.workshopmongodb.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
}
