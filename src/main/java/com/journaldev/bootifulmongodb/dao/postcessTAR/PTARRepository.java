package com.journaldev.bootifulmongodb.dao.postcessTAR;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.journaldev.bootifulmongodb.model.Count_Record_And_Count_Field;


@Repository
public interface PTARRepository extends MongoRepository<Count_Record_And_Count_Field, String> {
}
