package com.student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class StudentDBUtil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean validate(String username, String password) {
	
		//boolean isSuccess = false;
		
		 //validate 
		 try {
			 
			 //check entered userName and password in the database
			 con = DBConnect.getConnection();   //create database connection
			 stmt = con.createStatement();
			 String sql = "SELECT * FROM student WHERE username = '"+username+"' and password = '"+password+"'";
			 rs = stmt.executeQuery(sql);
			 
			 //if userName and password valid, fetch all data relevant user 
			 if(rs.next()) {
				 isSuccess = true;
			 }else {
				 isSuccess = false;
			 }
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		 
		 return isSuccess;
	}
	
	public static List<Student> getStudent(String userName){
		
	ArrayList<Student> std = new ArrayList<>();
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "SELECT * FROM student WHERE username = '"+userName+"'";
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					 int id = rs.getInt(1);
					 String name = rs.getString(2);
					 String boy = rs.getString(3);
					 String gender = rs.getString(4); 
					 String age = rs.getString(5);
					 String grade = rs.getString(6);
					 String email = rs.getString(7);
					 String contact = rs.getString(8);
					 String address = rs.getString(9);
					 String gname = rs.getString(10);
					 String gtype = rs.getString(11);
					 String gemail = rs.getString(12);
					 String gaddress = rs.getString(13); 
					 String gcontact = rs.getString(14);
					 String occupation = rs.getString(15);
					 String username = rs.getString(16);
					 String password = rs.getString(17);
					 
					 Student s = new Student(id, name, boy, gender, age, grade, email, contact, address, gname, gtype, gemail, gaddress, gcontact, occupation, username, password);
					 std.add(s);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		
		return std;
		
		
	}
	

	//catch data which passed from studentInsert servlet  
	public static boolean insertstudent(String name, String boy, String gender, String age, String grade, String email, String contact, String address, 
										  String gname, String gtype, String gemail,  String gaddress, String gcontact, String occupation, String username, String password) {
		
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into student values (default, '"+name+"', '"+boy+"', '"+gender+"', '"+age+"', '"+grade+"', '"+email+"', '"+contact+"', '"+address+"', '"+gname+"', '"+gtype+"',  '"+gemail+"', '"+gaddress+"','"+gcontact+"', '"+occupation+"', '"+username+"', '"+password+"')";
			
			int rs = stmt.executeUpdate(sql); 
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
				 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
		return isSuccess;
		
	}
	
	public static boolean updatestudent (String id, String name, String boy, String gender, String age, String grade, String email, String contact, String address,
								String gname, String gtype, String gemail, String gaddress, String gcontact, String occupation, String username, String password) {
		
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "UPDATE student SET name = '"+name+"', boy = '"+boy+"', gender = '"+gender+"', age = '"+age+"'"
					+ ", grade = '"+grade+"', email = '"+email+"', contact = '"+contact+"', address = '"+address+"', gname = '"+gname+"', gtype = '"+gtype+"',"
							+ " gemail = '"+gemail+"', gaddress = '"+gaddress+"', gcontact = '"+gcontact+"', occupation = '"+occupation+"',"
									+ " username = '"+username+"', password = '"+password+"' WHERE id = '"+id+"' ";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
						
	} 
	//*****************************************************Retrieve data*****************************************************************
	
	public static List<Student> getStudentDetails(String Id){
		
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<Student> std = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT * FROM student WHERE id = '"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				 int id = rs.getInt(1);
				 String name = rs.getString(2);
				 String boy = rs.getString(3);
				 String gender = rs.getString(4); 
				 String age = rs.getString(5);
				 String grade = rs.getString(6);
				 String email = rs.getString(7);
				 String contact = rs.getString(8);
				 String address = rs.getString(9);
				 String gname = rs.getString(10);
				 String gtype = rs.getString(11);
				 String gemail = rs.getString(12);
				 String gaddress = rs.getString(13); 
				 String gcontact = rs.getString(14);
				 String Occupation = rs.getString(15);
				 String username = rs.getString(16);
				 String password = rs.getString(17);
				 
				 Student s = new Student(id, name, boy, gender, age, grade, email, contact, address, gname, gtype, gemail, gaddress, gcontact, Occupation, username, password);
				 std.add(s);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return std;
	}
	
	public static boolean deleteStudent(String id) {
		
		boolean isSuccess = false;
		
		int convId = Integer.parseInt(id);
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "DELETE FROM student WHERE id = '"+convId+"' ";
			int r = stmt.executeUpdate(sql);
			
			if(r > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	
	//***************************Codes for Search****************************************************/  
    

    public static List<Student> SearchStudent(String Id){  // , String name

		 int convertedID = Integer.parseInt(Id);

		ArrayList<Student> std = new ArrayList<>();
   
  
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from student where id='"+Id+"'";// and name='"+name+"'
			rs = stmt.executeQuery(sql);
			
	
			while(rs.next()) {
				int id = rs.getInt(1);
				 String name = rs.getString(2);
				 String boy = rs.getString(3);
				 String gender = rs.getString(4); 
				 String age = rs.getString(5);
				 String grade = rs.getString(6);
				 String email = rs.getString(7);
				 String contact = rs.getString(8);
				 String address = rs.getString(9);
				 String gname = rs.getString(10);
				 String gtype = rs.getString(11);
				 String gemail = rs.getString(12);
				 String gaddress = rs.getString(13); 
				 String gcontact = rs.getString(14);
				 String Occupation = rs.getString(15);
				 String username = rs.getString(16);
				 String password = rs.getString(17);
				 
			Student s = new Student(id, name, boy, gender, age, grade, email, contact, address, gname, gtype, gemail, gaddress, gcontact, Occupation, username, password);
			std.add(s);	
   			
   		}
   		
   	}
   	catch(Exception e) {
   		e.printStackTrace();
   	}	
   	return std;	
   }
    
    public static boolean validate(String Id) {
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from student where id='"+Id+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
   
}

	