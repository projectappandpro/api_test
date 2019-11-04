package com.journaldev.bootifulmongodb.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.journaldev.bootifulmongodb.dao.postcessTAR.PTARRepository;
import com.journaldev.bootifulmongodb.dao.postcessTAR.PostgresTablesAllRecord;
import com.journaldev.bootifulmongodb.model.Count_Record_And_Count_Field;

@RestController
@RequestMapping(value = "/")
public class PostgresTablesAllRecordController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final PTARRepository ptsRepository;

	private final PostgresTablesAllRecord postgresTablesAllRecord;

	public PostgresTablesAllRecordController(PTARRepository ptsRepositorys, PostgresTablesAllRecord postgresTablesAllRecord) {
		this.ptsRepository = ptsRepositorys;
		this.postgresTablesAllRecord = postgresTablesAllRecord;
	}

	@RequestMapping(value = "/ptarAll",produces = "application/json", method = RequestMethod.GET)
	public List<Count_Record_And_Count_Field> getAllPTAR() {
		LOG.info("Getting all ptar.");
		//List<PostgresTables_Structure> a = new ArrayList<PostgresTables_Structure>();
		//a =  ptsRepositorys.findAll();
		//LOG.info("aaaa : "+a);
		//return ptsRepositorys.findAll();
		return postgresTablesAllRecord.getAllPTAllRecordSome();
	}
	


	
	
	
}