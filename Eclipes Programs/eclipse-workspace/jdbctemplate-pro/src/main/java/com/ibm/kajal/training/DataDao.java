package com.ibm.kajal.training;

import java.sql.Connection;
import java.sql.ResultSet;
//import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class DataDao {
	// @Autowired
	DataSource theDataSource;
	String queryToExecute;
	JdbcTemplate jdbcTemplate;
	//Connection dbCon;
	
/**	void connectToDb() {
//		Get the connection established
		try {
			dbCon = theDataSource.getConnection();
			if(dbCon != null)
				System.out.println("Connected to the database now...");
			jdbcTemplate = new JdbcTemplate();
			
//			Map the dataSource to jdbcTemplate
			jdbcTemplate.setDataSource(theDataSource);
		} catch (SQLException e) {
			System.out.println("Could not establish the connection... " + e.getMessage());
		}
			
	}
**/
	
	@Autowired
	public void setTheDataSource(DataSource source) {
		jdbcTemplate = new JdbcTemplate(source);
	}
	
	int getCountOfEmployees() {
		return jdbcTemplate.queryForObject("select count(empId) from emp", Integer.class);
	}
	
	String getEmployeeNameById(int empId) {
		queryToExecute = "select empName from emp where empId=?";
		return jdbcTemplate.queryForObject(queryToExecute, new Object[] {empId}, String.class);
	}
	
	String getEmployeeNameandAddressById(int empId, String empAddress) {
		queryToExecute = "select * from emp where empId=? and empAddress=?";
		return jdbcTemplate.queryForObject(queryToExecute, new Object[] {empId, empAddress}, String.class);				
	}
	
	Employee getAllDetailsOfEmployee(int empId) {
			queryToExecute = "select * from emp where empId=?";
			
			return jdbcTemplate.queryForObject(queryToExecute, new Object[] {empId}, new EmployeeMapper());  //try this with lamda and anonymous class/function
	}
	
	 List<Employee> getAllEmployees(){
		queryToExecute = "select * from emp";
		
		return jdbcTemplate.query(queryToExecute, new EmployeeMapper());
	} 
	
	void addEmployee(Employee theEmployee) {
		jdbcTemplate.update(
							"insert into emp(empId, empName, empAddress) values (?, ?, ?)", 
							new Object[] {theEmployee.getEmpId(), theEmployee.getEmpName(), theEmployee.getEmpAddress()}
						);
	}
	
//update method	
	
	void updateEmployeeDetails(Employee theEmployee) {
		java.util.Scanner scan = new Scanner(System.in);	
		//String empName = scan.nextLine();
		//String empAddress = scan.nextLine();
		jdbcTemplate.update(
				"update emp set empName = ?, empAddress= ? where empId = ?", 
				new Object[] {theEmployee.getEmpName(), theEmployee.getEmpAddress(), theEmployee.getEmpId()}
			);
	}

	//delete method
	
	void deleteEmployeeDetails(Employee theEmployee) {
		jdbcTemplate.update(
				"delete from emp where empId = ?", 
				new Object[] {theEmployee.getEmpId()}
			);
	}
	
	class EmployeeMapper implements RowMapper<Employee>{
		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp = new Employee();
			emp.setEmpId(rs.getInt("empId"));
			emp.setEmpName(rs.getString("empName"));
			emp.setEmpAddress(rs.getString("empAddress"));
			
			return emp;
		}
	}
}
