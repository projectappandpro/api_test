package com.journaldev.bootifulmongodb.dao.postgressTS;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.journaldev.bootifulmongodb.model.PostgresTables_Structure;

@Repository
public interface PTSRepository extends MongoRepository<PostgresTables_Structure, String> {
}
