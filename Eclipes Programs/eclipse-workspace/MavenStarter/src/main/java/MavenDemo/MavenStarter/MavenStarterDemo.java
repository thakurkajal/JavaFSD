package MavenDemo.MavenStarter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class MavenStarterDemo {
	
	Connection dbCon;
	Statement theStatement;
	String queryToExecute;
	ResultSet resultSet;
	
	MavenStarterDemo(){
		
		String urlToConnect = "jdbc:mysql://localhost:3306/employee";
		
		String userName = "root";
		
		String password = "";
		
		try {
			//loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//connecting to DB
			dbCon = DriverManager.getConnection(urlToConnect, userName, password);
		
		try {
			//Get a reference to the Statement
			theStatement = dbCon.createStatement();
			
			System.out.println("Connected to database...");
		} 
		catch (SQLException e) {
			System.out.println("Some issues while getting Statement : " + e.getMessage());
		}
		}
		catch (ClassNotFoundException e) {
		System.out.println("Can't load the Driver : " + e.getMessage());
	} 
		catch (SQLException e) {
		System.out.println("Can't connect to db : " + e.getMessage());
	}
}


	public static void main(String[] args) {
		new MavenStarterDemo();
		
		try (Scanner scan = new Scanner(System.in)) {
			//Scanner scan = new Scanner(System.in);
			System.out.println("Employee details are: ");
			MavenStarterDemo demo = new MavenStarterDemo();
			demo.getEmpDetails();
			
			System.out.println("Entering details of new employee...");
			System.out.println("Enter id of an Employee you want to update");
			int id = scan.nextInt();
			System.out.println("Enter name of an Employee you want to update");
			String name = scan.nextLine();
			System.out.println("Enter address of an Employee you want to update");
			String address = scan.nextLine();
			demo.updateEmployeeDetails(id,name,address);
		}
		
	}
	//showing all the details of the employees in the emp table
	void getEmpDetails() {
		queryToExecute = "Select * from emp";
		
		 try {
			resultSet = theStatement.executeQuery(queryToExecute);
			
			while(resultSet.next()) {
			System.out.println("Employee id is: " + resultSet.getInt("empID"));
			System.out.println("Employee name is: " + resultSet.getString("empName"));
			System.out.println("Employee address is: " + resultSet.getString("empAddress"));
		} 
		}
		catch (SQLException e) {
			System.out.println("cannot get the details of employee: " + e.getMessage());
		}		
	}
	
	void updateEmployeeDetails(int id, String name, String address) {
		queryToExecute = "insert into emp(empID, empName, empAddress) values('" + id + "' , '" + name + "', '" + address + "')";
		
		try {
			if(theStatement.executeUpdate(queryToExecute) > 0) {
				System.out.println("Employee details updated successfully");
			}
			else {
				System.out.println("Employee details updated unsuccessfully");
			}
		} catch (SQLException e) {
			System.out.println("Some issues while updating..." + e.getMessage());
		}
	}

}
