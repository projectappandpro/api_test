package com.journaldev.bootifulmongodb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection="PostgresTables_Structure")
public class PostgresTables_Structure {

	@Id
	private String id;
	@Field("table_name")
	private String table_name;
	@Field("table_schema")
	private String table_schema;
	@Field("fieldNo")
	private int fieldNo;
	@Field("processDate")
	private Date processDate = new Date();
	@Field("fieldList")
	private ArrayList<Object> fieldList = new ArrayList<>();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public String getTable_schema() {
		return table_schema;
	}
	public void setTable_schema(String table_schema) {
		this.table_schema = table_schema;
	}
	public int getFieldNo() {
		return fieldNo;
	}
	public void setFieldNo(int fieldNo) {
		this.fieldNo = fieldNo;
	}
	public Date getProcessDate() {
		return processDate;
	}
	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}
	public ArrayList<Object> getFieldList() {
		return fieldList;
	}
	public void setFieldList(ArrayList<Object> fieldList) {
		this.fieldList = fieldList;
	}
	
}
