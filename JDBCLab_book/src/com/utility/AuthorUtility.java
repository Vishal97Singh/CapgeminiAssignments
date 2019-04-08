package com.utility;

import java.sql.Connection;
/**
 * @author Vishal Singh
 */
import java.sql.DriverManager;
import java.sql.SQLException;

public class AuthorUtility {
	private static Connection con;
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","lpu","hr");
			System.out.println("Connected");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	public static Connection getConnection() {
		return con;
		
	}

}
