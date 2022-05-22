package com.material;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;

public class MaterialDB {
	
	private static boolean success;
	private static Connection con = null;
	private static Statement stat = null;
	private static ResultSet res = null;
	
public static boolean materialInsert(String teacherID, String title, String grade, String subject, String link) {
		
		boolean success = false;
		
		try {
			
			int materialGrade = Integer.parseInt(grade);
			int materialTeacher = Integer.parseInt(teacherID);
			
		   // SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		      //Parsing the given String to Date object
		   // Date date = formatter.parse(addedDate);
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			//SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
			LocalDateTime now = LocalDateTime.now();
			System.out.println(LocalDateTime.now());
			
			String materialAddedDate = dtf.format(now);
			System.out.println(materialAddedDate);
		      
		      
			Class.forName("org.postgresql.Driver");
			
			con = DBConnect.getConection();
			stat = con.createStatement();
			String sql = "INSERT INTO educlue.materials VALUES (default, '"+materialTeacher+"', '"+title+"', '"+materialAddedDate+"', '"+materialGrade+"', '"+subject+"', '"+link+"')";
			int res = stat.executeUpdate(sql);
			
			if (res > 0 )
			{
				success = true;
				
				
			}
			else {
				success = false;
			}
	
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		//Returning boolean value, true when success, false when failure
		return success;
	}
public static boolean materialDelete(String id) {
	
	int intId = Integer.parseInt(id);
	
	try {
		
		con = DBConnect.getConection();
		stat = con.createStatement();
		String sql = "DELETE FROM educlue.materials WHERE id='"+intId+"'";
		int r = stat.executeUpdate(sql);
		
		if (r > 0) {
			success = true;
		}
		else {
			success = false;
		}
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return success;
}

public static List<Material> getMaterialDetails(String materialID) {
	
	int intID = Integer.parseInt(materialID);
	
	ArrayList<Material> material = new ArrayList<>();
	
	try {
		
		con = DBConnect.getConection();
		stat = con.createStatement();
		String sql = "SELECT * FROM educlue.materials WHERE id='"+intID+"'";
		res = stat.executeQuery(sql);
		
		while(res.next()) {
			
			int id = res.getInt(1);
			int  teacherID = res.getInt(2);
			String materialTitle = res.getString(3);
			Date date = res.getDate(4);
			int grade = res.getInt(5);
			String subject = res.getString(6);
			String text = res.getString(7);
			
			Material m1 = new Material(id, teacherID, materialTitle, date, grade, subject, text);
			material.add(m1);
		}
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
	return material;
}

public static boolean updateMaterial(String id, String teacherID, String title, String grade, String subject, String link) {
	
	
	
	try {
		System.out.println(id);
		System.out.println(teacherID);
		System.out.println(grade);
		
		int materialGrade = Integer.parseInt(grade);
		int materialID = Integer.parseInt(id);
		int materialTeacher = Integer.parseInt(teacherID);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		//SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(LocalDateTime.now());
		
		String materialAddedDate = dtf.format(now);
		System.out.println(materialAddedDate);
		
		con = DBConnect.getConection();
		stat = con.createStatement();
		String sql = "UPDATE educlue.materials SET teacher_id = '"+materialTeacher+"', material_title = '"+title+"', added_date = '"+materialAddedDate+"', grade = '"+materialGrade+"', subject = '"+subject+"', material_link = '"+link+"' WHERE id = '"+materialID+"'";
		
		int res = stat.executeUpdate(sql);
		
		if (res > 0 )
		{
			success = true;
			
			
		}
		else {
			success = false;
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return success;
}

}
