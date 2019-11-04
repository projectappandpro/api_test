package com.journaldev.bootifulmongodb.dao.postcessTAR;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.journaldev.bootifulmongodb.model.Count_Record_And_Count_Field;
import com.journaldev.bootifulmongodb.model.PostgresTables_Structure;
import com.journaldev.bootifulmongodb.model.User;


@Repository
public class PostgresTablesAllRecordImpl implements PostgresTablesAllRecord {

	private Logger logger = Logger.getLogger(PostgresTablesAllRecordImpl.class.getName());
	
	@Autowired
	private MongoTemplate mongoTemplate;

	

	@Override
	public List<Count_Record_And_Count_Field> getAllPTAllRecord() {
		return mongoTemplate.findAll(Count_Record_And_Count_Field.class);
	}

	@Override
	public List<Count_Record_And_Count_Field> getAllPTAllRecordSome() {
		Query query = new Query();
		query.limit(20);
		return mongoTemplate.find(query,Count_Record_And_Count_Field.class);
	}

	

	

	
}
