package utils;

import java.sql.*;

public interface DButils {

	// add a static method for getting fixed DB connection
	static Connection fetchDBConnection() throws ClassNotFoundException, SQLException {

		// load Type IV MySql supplied JBDC driver under method area(meta space)
		Class.forName("com.mysql.cj.jdbc.Driver");
		// get the fixed connection
		String url = "jdbc:mysql://localhost:3306/test?allowPublicKeyRetrieval=true&useSSL=false";
		return DriverManager.getConnection(url, "Aditya", "root");
	}
}
 