package com.journaldev.bootifulmongodb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection="count_record_and_count_field")
public class Count_Record_And_Count_Field {

	@Id
	private String id;
	@Field("schema")
	private String schema;
	@Field("name")
	private String name;
	@Field("tableType")
	private String tableType;
	@Field("countRecord")
	private int countRecord;
	@Field("fieldNo")
	private int fieldNo;
	@Field("processDate")
	private Date processDate = new Date();
	@Field("count_All_record")
	private int count_All_record;
	@Field("count_All_field")
	private int count_All_field;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSchema() {
		return schema;
	}
	public void setSchema(String schema) {
		this.schema = schema;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTableType() {
		return tableType;
	}
	public void setTableType(String tableType) {
		this.tableType = tableType;
	}
	public int getCountRecord() {
		return countRecord;
	}
	public void setCountRecord(int countRecord) {
		this.countRecord = countRecord;
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
	public int getCount_All_record() {
		return count_All_record;
	}
	public void setCount_All_record(int count_All_record) {
		this.count_All_record = count_All_record;
	}
	public int getCount_All_field() {
		return count_All_field;
	}
	public void setCount_All_field(int count_All_field) {
		this.count_All_field = count_All_field;
	}
	
	
	
	
}
