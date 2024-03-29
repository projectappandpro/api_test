package com.journaldev.bootifulmongodb.dao.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.journaldev.bootifulmongodb.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
