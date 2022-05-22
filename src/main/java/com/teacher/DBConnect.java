package com.teacher;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static String url = "jdbc:postgresql://localhost:5432/course_materials";
	//private static String url = "jdbc:mysql://localhost:3306/course_materials";
	private static String userName = "postgres";
	//private static String userName = "root";
	private static String password = "root";
	private static Connection con;
	
	public static Connection getConnection() {
		
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
