package com.journaldev.bootifulmongodb.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.journaldev.bootifulmongodb.dao.postgressTS.PTSRepository;
import com.journaldev.bootifulmongodb.dao.postgressTS.PostgresTablesStructure;
import com.journaldev.bootifulmongodb.dao.user.UserDAL;
import com.journaldev.bootifulmongodb.dao.user.UserRepository;
import com.journaldev.bootifulmongodb.model.PostgresTables_Structure;
import com.journaldev.bootifulmongodb.model.User;

@RestController
@RequestMapping(value = "/")
public class PostgresTablesStructureController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final PTSRepository ptsRepositorys;

	private final PostgresTablesStructure postgresTablesStructures;
	
	private final UserRepository userRepository;

	public PostgresTablesStructureController(PTSRepository ptsRepository, PostgresTablesStructure postgresTablesStructure,UserRepository userRepository) {
		this.ptsRepositorys = ptsRepository;
		this.postgresTablesStructures = postgresTablesStructure;
		this.userRepository = userRepository;
	}

	@RequestMapping(value = "/ptsAll",produces = "application/json", method = RequestMethod.GET)
	public List<PostgresTables_Structure> getAllPTS() {
		LOG.info("Getting all pts.");
		//List<PostgresTables_Structure> a = new ArrayList<PostgresTables_Structure>();
		//a =  ptsRepositorys.findAll();
		//LOG.info("aaaa : "+a);
		//return ptsRepositorys.findAll();
		return postgresTablesStructures.getAllPTStructureSome();
	}
	


	
	
	
}