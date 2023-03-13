package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	protected  Connection initializeDatabase()
	        throws SQLException, ClassNotFoundException
	    {
	        // Initialize all the information regarding
	        // Database Connection
	        String dbDriver = "com.mysql.cj.jdbc.Driver";
	        String dbURL = "jdbc:mysql://localhost:3306/";
	        // Database name to access
	        String dbName = "nhom1bai2";
	        String dbUsername = "root";
	        String dbPassword = "123456";
	        System.out.println(dbDriver);
	        Class.forName(dbDriver);
	        Connection con = DriverManager.getConnection(dbURL + dbName,
	                                                     dbUsername, 
	                                                     dbPassword);
	        return con;
	    }
}
