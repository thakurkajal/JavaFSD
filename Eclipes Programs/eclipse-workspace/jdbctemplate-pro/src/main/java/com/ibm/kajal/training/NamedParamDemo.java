package com.ibm.kajal.training;

import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class NamedParamDemo {
	NamedParameterJdbcTemplate namedParamTemplate;
	
	@Autowired
	public void setTheDataSource(DataSource theDataSource) {
		namedParamTemplate = new NamedParameterJdbcTemplate(theDataSource);
	}
	
	String getEmployeeDetailsByEmployeeId(int employeeId) {
		String queryToExecute = "select * from emp where empId = :empId";
		
		SqlParameterSource paramSource = new MapSqlParameterSource("empId", employeeId);
		
		return namedParamTemplate.queryForObject(queryToExecute, paramSource, String.class);
	}
	
	String updateEmployeeDetails(String empName, String empAddress, int empId) {
		String queryToExecute = "update emp set empName = :empName, empAddress = :empAddress where empid = :empId";
		
		SqlParameterSource paramSource = new MapSqlParameterSource("empName", empName)
												.addValue("empAddress", empAddress)
												.addValue("empId", empId);
		
		return namedParamTemplate.queryForObject(queryToExecute, paramSource, String.class);
	}

	//delete method
	
	String deleteEmployeeDetails(int empId) {
		
		String queryToExecute = "delete from emp where empid = :empId";
		
		SqlParameterSource paramSource = new MapSqlParameterSource("empId", empId);
		
		return namedParamTemplate.queryForObject(queryToExecute, paramSource, String.class);
	}
}
