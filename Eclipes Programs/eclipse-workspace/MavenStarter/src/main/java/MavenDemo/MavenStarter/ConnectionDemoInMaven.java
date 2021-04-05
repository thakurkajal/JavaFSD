package MavenDemo.MavenStarter;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConnectionDemoInMaven {
	Connection dbCon;
	
	public static void main(String[] args) {
		String urlToConnect = "jdbc:mysql://localhost:3306//employee";
				
		String userName = "root";
				
		String userPassword = "";
				
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			#2 Try establishing the connection
			dbCon = DriverManager.getConnection(urlToConnect, userName, userPassword);
					
			System.out.println("Connected to database employee...");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Can't load the driver: " + e.getMessage());
		}
		catch(SQLException e) {
			System.out.println("Can't connect to database: " + e.getMessage());
		}
	}
}

