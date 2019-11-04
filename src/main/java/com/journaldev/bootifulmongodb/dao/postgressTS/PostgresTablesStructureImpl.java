package com.journaldev.bootifulmongodb.dao.postgressTS;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.journaldev.bootifulmongodb.model.PostgresTables_Structure;
import com.journaldev.bootifulmongodb.model.User;


@Repository
public class PostgresTablesStructureImpl implements PostgresTablesStructure {

	private Logger logger = Logger.getLogger(PostgresTablesStructureImpl.class.getName());
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<PostgresTables_Structure> getAllPTStructure() {
		return mongoTemplate.findAll(PostgresTables_Structure.class);
	}

	@Override
	public List<PostgresTables_Structure> getAllPTStructureSome() {
		Query query = new Query();
//		query.fields().include("_id");
//		query.fields().include("table_name");
//		query.fields().include("fieldNo");
//		query.fields().include("table_schema");
//		query.fields().include("processDate");
		query.limit(20);
		
		
		return mongoTemplate.find(query,PostgresTables_Structure.class);
	}

	

	

	
}
