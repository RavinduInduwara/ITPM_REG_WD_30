package com.material;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaterialSearchHomeStudentServlet
 */
@WebServlet("/MaterialSearchHomeStudentServlet")
public class MaterialSearchHomeStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = null;
		
		  String url = "jdbc:postgresql://localhost:5432/educlue";
		  String driver = "org.postgresql.Driver";
		  String userName = "postgres"; 
		  String password = "root";

		  
		  Statement st;
		  try {
		  Class.forName(driver).newInstance();
		  conn = DriverManager.getConnection(url,userName,password);
		  System.out.println("Connected to the database");
		  String  title  = request.getParameter("title");
		  //String  emp_dept  = request.getParameter("emp_dept");
		  //String  email  = request.getParameter("email");
		  
		  //ArrayList<String> al=null;
		  ArrayList search_list =new ArrayList();
		  String query = "select * from educlue.materials where material_title like '"+title+"%' or material_title like '%"+title+"' order by id desc";
		  System.out.println("query " + query);
		  st = conn.createStatement();
		  ResultSet  rs = st.executeQuery(query);


		  while(rs.next()){
		  ArrayList al  = new ArrayList<>();
		  
		  al.add(rs.getString(1));
		  al.add(rs.getString(2));
		  al.add(rs.getString(3));
		  al.add(rs.getString(4));
		  al.add(rs.getString(5));
		  al.add(rs.getString(6));
		  al.add(rs.getString(7));
		  
		  System.out.println("al :: "+al);
		  search_list.add(al);
		  }

		  request.setAttribute("searchList",search_list);
		  
		 System.out.println("searchList " + search_list);

		  // out.println("emp_list " + emp_list);

		  String nextJSP = "/materialSearchResS.jsp";
		  RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		  dispatcher.forward(request,response);
		  conn.close();
		  System.out.println("Disconnected from database");
		  
		  } catch (Exception e) {
		  e.printStackTrace();
		  }
	}

}
