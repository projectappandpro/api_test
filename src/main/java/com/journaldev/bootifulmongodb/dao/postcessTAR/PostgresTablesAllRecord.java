package com.journaldev.bootifulmongodb.dao.postcessTAR;

import java.util.List;

import com.journaldev.bootifulmongodb.model.Count_Record_And_Count_Field;


public interface PostgresTablesAllRecord {

	List<Count_Record_And_Count_Field> getAllPTAllRecord();
	
	List<Count_Record_And_Count_Field> getAllPTAllRecordSome();

	
}