package com.teacher;

import java.io.IOException;
import java.io.PrintWriter;
/*import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;*/
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/TeacherSearchServlet")
public class TeacherSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String tId = request.getParameter("tid");
	
		boolean isTrue;
		
		isTrue = TeacherDBUtil.validate(tId);
		
		if (isTrue == true) {
			List<Teacher> cusDetails = TeacherDBUtil.SearchTeacher(tId);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("teacheraccount.jsp");
			dis.forward(request, response);
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Results not found.Please Enter Valid Teacher ID.');");
			out.println("location='teacherSearch.jsp'");
			out.println("</script>");
			
			/*out.println("Results not found.");	
			out.println("Please Enter Valid Teacher ID");*/
			}
		
		
		
		
		
		  
	}

}
