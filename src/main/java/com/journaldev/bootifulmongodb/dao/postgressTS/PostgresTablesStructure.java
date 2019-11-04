package com.journaldev.bootifulmongodb.dao.postgressTS;

import java.util.List;

import com.journaldev.bootifulmongodb.model.PostgresTables_Structure;


public interface PostgresTablesStructure {

	List<PostgresTables_Structure> getAllPTStructure();
	
	List<PostgresTables_Structure> getAllPTStructureSome();

	
}