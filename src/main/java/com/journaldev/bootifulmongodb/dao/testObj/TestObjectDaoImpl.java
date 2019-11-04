package com.journaldev.bootifulmongodb.dao.testObj;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import com.journaldev.bootifulmongodb.model.*;



@Repository
public class TestObjectDaoImpl implements TestObjectDao {

	private Logger logger = Logger.getLogger(TestObjectDaoImpl.class.getName());
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<TestObject> getAllTestObjecy() {
		List<TestObject> listTestObject = new ArrayList<TestObject>();
		TestObject testObject = new TestObject();

		return null;
	}

	

	

	

	
}
