package com.teacher;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import com.mysql.jdbc.PreparedStatement;



public class TeacherDBUtil {

	
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	//private static PreparedStatement pst = null;
    
	public static boolean validate(String username, String password) {
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from teacher where username='"+username+"' and password='"+password+"'";
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
	
	public static List<Teacher> getTeacher(String userName) {
		
		ArrayList<Teacher> teacher = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from teacher where username='"+userName+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				String tid = rs.getString(1);
				String name = rs.getString(2);
				String nic = rs.getString(3);
				String gender = rs.getString(4);
				String subject = rs.getString(5);
				String address = rs.getString(6);
				String email = rs.getString(7);
				String phone = rs.getString(8);
				String experience = rs.getString(9);
				String eduqualifications = rs.getString(10);
				String username = rs.getString(11);
				String password = rs.getString(12);
				
				Teacher cus = new Teacher(tid,name,nic,gender,subject,address,email,phone,experience,eduqualifications,username,password);
				teacher.add(cus);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		return teacher;	
	}
                                                                                 
    public static boolean insertteacher(String name,String nic,String gender,String subject,String address,String email,String phone,String experience,String eduqualifications,String username,String password) {
    	
    	boolean isSuccess = false;
    	
    	try {
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    	    String sql = "insert into teacher values (default,'"+name+"','"+nic+"','"+gender+"','"+subject+"','"+address+"','"+email+"','"+phone+"','"+experience+"','"+eduqualifications+"','"+username+"','"+password+"')";
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
 	
    	return isSuccess;
    }
    
    public static boolean updateteacher(String tid,String name,String nic,String gender,String subject,String address,String email,String phone,String experience,String eduqualifications,String username,String password) {
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "update teacher set name='"+name+"',nic='"+nic+"',gender='"+gender+"',subject='"+subject+"',address='"+address+"',email='"+email+"',phone='"+phone+"',experience='"+experience+"',eduqualifications='"+eduqualifications+"',username='"+username+"',password='"+password+"'"
    				+ "where tid='"+tid+"'";  
    		int rs = stmt.executeUpdate(sql);
    		
    		if(rs > 0) {
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
 
    public static List<Teacher> getTeacherDetails(String tId) {  
    
    	
    	ArrayList<Teacher> cus = new ArrayList<>();
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "select * from teacher where tid='"+tId+"'";      //String sql = "select * from teacher where id='"+convertedID+"'";
    		rs = stmt.executeQuery(sql);
    		
    		while(rs.next()) {
    			String tid = rs.getString(1);
				String name = rs.getString(2);
				String nic = rs.getString(3);
				String gender = rs.getString(4);
				String subject = rs.getString(5);
				String address = rs.getString(6);
				String email = rs.getString(7);
				String phone = rs.getString(8);
				String experience = rs.getString(9);
				String eduqualifications = rs.getString(10);
				String username = rs.getString(11);
				String password = rs.getString(12);
    			
    			Teacher c = new Teacher(tid,name,nic,gender,subject,address,email,phone,experience,eduqualifications,username,password);
    			cus.add(c);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return cus;	
    }
    
    
    public static boolean deleteTeacher(String tid) { 
    	
    	
    	try {
    		
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
    		String sql = "delete from teacher where tid='"+tid+"'";
    		int r = stmt.executeUpdate(sql);
    		
    		if (r > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
    		
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	return isSuccess;
    }
    
/***************************Codes for Search****************************************************/  
    
     public static List<Teacher> SearchTeacher(String tId){  
		
		ArrayList<Teacher> cus = new ArrayList<>();
    
   
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from teacher where tid='"+tId+"'";
			rs = stmt.executeQuery(sql);
			
	
			while(rs.next()) {
    			String tid = rs.getString(1);
				String name = rs.getString(2);
				String nic = rs.getString(3);
				String gender = rs.getString(4);
				String subject = rs.getString(5);
				String address = rs.getString(6);
				String email = rs.getString(7);
				String phone = rs.getString(8);
				String experience = rs.getString(9);
				String eduqualifications = rs.getString(10);
				String username = rs.getString(11);
				String password = rs.getString(12);
    			
    			Teacher t = new Teacher(tid,name,nic,gender,subject,address,email,phone,experience,eduqualifications,username,password);
    			cus.add(t);
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    	return cus;	
    }
	
    
    
     
     public static boolean validate(String tId) {
 		
 		try {
 			
 			con = DBConnect.getConnection();
 			stmt = con.createStatement();
 			String sql = "select * from teacher where tid='"+tId+"'";
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
