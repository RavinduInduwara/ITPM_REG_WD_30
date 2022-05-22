package com.payment;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.RequestDispatcher;


public class PaymentDB {
	
	

	private static Connection con = null;
	private static Statement stat = null;
	private static ResultSet res = null;
	
	
	
	public static List<Payment>validate(String STUId,String PHONE){
	
		
		ArrayList<Payment> pay = new ArrayList<>();												
																				

		try {
																				
			con = DBConnect.getConection();
			stat = con.createStatement();
			String sql ="SELECT * FROM educlue.payment WHERE number ='"+STUId+"' and phone ='"+PHONE+"' ";
			
			res = stat.executeQuery(sql);
			
			
			if (res.next()) {
				
				int id=res.getInt(1);
				String Name = res.getString(2);
				String age = res.getString(3);
				String student_numbr = res.getString(4); 
				String  grade= res.getString(5);
				String subject = res.getString(6);
				String paydate = res.getString(7);
				String email = res.getString(8);
				String phone_number = res.getString(9);
				String masseg = res.getString(10);
				String img = res.getString(11);
			
				Payment p = new Payment(id,Name,age,student_numbr,grade,subject,paydate,email,phone_number,masseg,img);
				pay.add(p);
			}
			else {
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return pay;
		
	}
	
	
	
	
	public static List<Payment>validates(String STUId){
	
		
		ArrayList<Payment> pay = new ArrayList<>();
											
																				
																				

		try {
																				
			con = DBConnect.getConection();
			stat = con.createStatement();
			
			String sql ="SELECT * FROM educlue.payment WHERE id ='"+STUId+"' ";
			
			res = stat.executeQuery(sql);
			
			
			if (res.next()) {
				
				int id=res.getInt(1);
				String Name = res.getString(2);
				String age = res.getString(3);
				String student_numbr = res.getString(4); 
				String  grade= res.getString(5);
				String subject = res.getString(6);
				String paydate = res.getString(7);
				String email = res.getString(8);
				String phone_number = res.getString(9);
				String masseg = res.getString(10);
				String img = res.getString(11);
			
				Payment p = new Payment(id,Name,age,student_numbr,grade,subject,paydate,email,phone_number,masseg,img);
				pay.add(p);
			}
			else {
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return pay;
		
	}
	
	
	
	
	public static boolean insertPayment(String name, String age, String stu, String grade, String subj, String payD, String email, String tell, String msg,String img) {
		
		boolean isSuccess = false;
		
		
		try {
			
			con = DBConnect.getConection();
			stat = con.createStatement();
			String sql ="INSERT INTO educlue.payment values(default,'"+name+"','"+age+"','"+stu+"','"+grade+"','"+subj+"','"+payD+"','"+email+"','"+tell+"','"+msg+"','"+img+"')";
			int res = stat.executeUpdate(sql);
			
			
			if (res>0) {
				
			isSuccess= true;	
				
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
	
	
	
public static boolean UpdatePayment(String id, String name, String age, String stu, String grade, String subj, String payD, String email, String tell, String msg,String img) {
		
		boolean isSuccess = false;
		
		
		try {
			
			con = DBConnect.getConection();
			stat = con.createStatement();
			String sql ="update educlue.payment set name='"+name+"' , age='"+age+"' , number='"+stu+"' ,grade='"+grade+"',subject='"+subj+"', date='"+payD+"',email='"+email+"', phone='"+tell+"', note = '"+msg+"',  slip ='"+img+"' where id ='"+id+"' ";	
			int res = stat.executeUpdate(sql);
			if (res>0) {
				
			isSuccess= true;	
				
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
	
	
	
	
	public static boolean deletePayment(String ID) {
		
		int Cid = Integer.parseInt(ID);
		
		
       boolean isSuccess = false;
		
		
		try {
			
			con = DBConnect.getConection();
			stat = con.createStatement();
			String sql ="DELETE FROM educlue.payment where Payment_ID  ='"+Cid+"'";	
			int res = stat.executeUpdate(sql);
			if (res>0) {
				        
			isSuccess= true;	
				
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
}
