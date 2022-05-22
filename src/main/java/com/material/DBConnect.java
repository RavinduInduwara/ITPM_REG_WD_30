package com.material;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static String url = "jdbc:postgresql://localhost:5432/educlue";
	private static String userName = "postgres";
	//private static String userName = "root";
	private static String password = "root";
	private static Connection con;
	
	public static Connection getConection() {
		
		try {
			
			Class.forName("org.postgresql.Driver");
			//Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, userName, password);
			
		
		}
		catch(Exception e){
			
			System.out.println("Database Connection Failure!!");
		}
		
		return con;
	}

}
