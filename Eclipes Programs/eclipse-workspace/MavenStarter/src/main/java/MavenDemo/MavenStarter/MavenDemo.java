package MavenDemo.MavenStarter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MavenDemo {
	Connection dbCon;
	String queryToExecute;
	Statement theStatement;
	ResultSet resultSet;
	
	MavenDemo(){
//		Declare the URL to connect
    	String urlToConnect = "jdbc:mysql://localhost:3306/employee";
    	
//    	Declare the Username and Password of the DB to connect
    	String userName = "root";
    	
    	String userPassword = "";
    	

    	try {
//    	     #1 Load the DB Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			#2 Try establishing the connection
			dbCon = DriverManager.getConnection(urlToConnect, userName, userPassword);
	    	
			try {
//	        	Get a reference to the Statement
				theStatement = dbCon.createStatement();
			} catch (SQLException e) {
				System.out.println("Some issues while getting Statement : " + e.getMessage());
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Can't load the Driver : " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("Can't connect to db : " + e.getMessage());
		}
	}
	
    public static void main( String[] args)
    {
    	MavenDemo theMavenDemo = new MavenDemo();
    	try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter The Employee ID");
//    	theMavenDemo.getEmployeeDetails();
//    	theMavenDemo.getCountOfEmployees();
//    	theMavenDemo.getEmployeeDetailsById(scan.nextLine());
//    	theMavenDemo.addNewEmployee();
//    	System.out.println("Please enter the name and address of employee you want to add:");
//    	String name = scan.nextLine();
//    	String address = scan.nextLine();
//    	
//    	theMavenDemo.AddNewEmployeeFromRuntime(name, address);
			System.out.println("Enter the Id to which the data is to be updated and also the Name and Address");
			int id= scan.nextInt();
			scan.nextLine();
			//theApp.updateEmployeeData(id,scan.nextLine(),scan.nextLine());
			theMavenDemo.updateEmployeeDetailsUsingPreparedStatement(id,scan.nextLine(),scan.nextLine());
		}
    }
    
    //Get all employee details
    void getEmployeeDetails() {
//    	Write the query to get all details from the table:employees
    	queryToExecute = "select * from employee";
    	
		try {
//			Execute the query
			resultSet = theStatement.executeQuery(queryToExecute);
			
			System.out.println("Employee Details : ");
			
//			Traverse through the results now
			while(resultSet.next()) {
				System.out.print("ID : " + resultSet.getInt("empId")); //Get all ids from this ResultSet reference
				System.out.print(", Name : " + resultSet.getString("empName"));
				System.out.println(", Address : " + resultSet.getString("empAddress"));
			}
		} catch (SQLException e) {
			System.out.println("Unable to execute query : " + e.getMessage());
		}
		
		//Close the connection
//		try {
//			dbCon.close();
//		} catch (SQLException e) {
//			System.out.println("Can't close the connection : " + e.getMessage());
//		}
    }
    
    
//    Get Count of all employees
    void getCountOfEmployees() {
    	int countOfRecords = 0;
    	
    	
//    	Write the query to get Count of rows from table:employees
    	queryToExecute = "select count(*)as count from employee";
    	

    	try {
    		//Execute the query
			resultSet = theStatement.executeQuery(queryToExecute);
			
//			while(resultSet.next())
//				countOfRecords++;
//			System.out.println("Number of employees : " + countOfRecords);
			resultSet.next();
			int count= resultSet.getInt("count");
			System.out.println(count);
			
		} catch (SQLException e) {
			System.out.println("Unable to execute query : " + e.getMessage());
		}
    }
    
//    Get Employee details by his/her id
    void getEmployeeDetailsById(String Id) {
//    	Write the query to get employee details by id
    	queryToExecute = "select * from employee where ID = " + Id;
    	//queryToExecute= queryToExecute.concat(Id);
    	
    	try {
    		//Execute the query
    		resultSet = theStatement.executeQuery(queryToExecute);
    		
    		while(resultSet.next())
    			System.out.println("Name :" + resultSet.getString("Name") + ", Address : " + resultSet.getString("Address"));
    		
    	}catch (SQLException e) {
			System.out.println("Unable to execute query : " + e.getMessage());
		}
}
    void addNewEmployee() {
//    	Write the query to insert a new record into the table: employees
    	queryToExecute = "insert into employee(Name, Address) values ('Namitha', 'Vishakapatnam, India')";
    	

    	try {
//			Execute the query
			if(theStatement.executeUpdate(queryToExecute) > 0)
				System.out.println("New Employee details added successfully.");
			else
				System.out.println("Issues while inserting a new record...");
		} catch (SQLException e) {
			System.out.println("Some issues while inserting : " + e.getMessage());
		}
    }
    
    void AddNewEmployeeFromRuntime(String name, String address) {
//    	Write the query to insert a new record into the table:employees
    	queryToExecute = "insert into employee(Name, Address) values('" + name + "', '" + address + "')";
    	
    	try {
//			Execute the query
			if(theStatement.executeUpdate(queryToExecute) > 0)
				System.out.println("New Employee details added successfully.");
			else
				System.out.println("Issues while inserting a new record...");
		} catch (SQLException e) {
			System.out.println("Some issues while inserting : " + e.getMessage());
		}
    }
    
    
//  Put two more methods here for the CRUD operations to be complete
  void updateEmployeeData(int Id, String Name, String Address) {
  queryToExecute = "UPDATE employee SET Name='"+ Name+"',Address='"+ Address+"' WHERE ID='"+Id+"'";
  	try {
//			Execute the query
			theStatement.executeUpdate(queryToExecute); 
				System.out.println("New Employee details added successfully.");
			
		} catch (SQLException e) {
			System.out.println("Some issues while inserting : " + e.getMessage());
		}
  }

  //Insert a new record using PreparedStatement
  void addNewEmployeeUsingPreparedStatement(String name, String address) {
//  	Write the query to add a new record into the table:employees
  	queryToExecute = "insert into employee(Name, Address) values (?,?)";
  	

  	try {
//      	Get a reference to the PreparedStatement object
			PreparedStatement thePreparedStatement = dbCon.prepareStatement(queryToExecute);
			
//			Replace the values for ?
			thePreparedStatement.setString(1, name);
			thePreparedStatement.setString(2, address);
			
//			Execute the query
			if(thePreparedStatement.executeUpdate() > 0)
				System.out.println("New Employee details added...");
			else
				System.out.println("Some issues encountered while attempting to add a new employee, please check back later...");
			
			
		} catch (SQLException e) {
			System.out.println("Can't get the PreparedStatement object : " + e.getMessage());
			
    	}
    	}
  
  //        Update using PreparedStatement
        void updateEmployeeDetailsUsingPreparedStatement(int id, String name, String address) {
//        	Write the query to update
        	queryToExecute = "update employee set Name = ?, Address = ? where ID = ?";
        	
    		try {
//    	    	Get a reference to the PreparedStatement object
    			PreparedStatement thePreparedStatement = dbCon.prepareStatement(queryToExecute);
    			
//    			Replace the values for ?
    			thePreparedStatement.setString(1, name);
    			thePreparedStatement.setString(2, address);
    			thePreparedStatement.setInt(3, id);
    			
//    			Execute the query
    			if(thePreparedStatement.executeUpdate() > 0)
    				System.out.println("Updated the details...");
    		} catch (SQLException e) {
    			System.out.println("Can't get the PreparedStatement object : " + e.getMessage());
    		}
        	
        }
  

    		}

