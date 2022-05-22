package com.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StudentSearchServlet")
public class StudentSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String Id = request.getParameter("id");
	
		boolean isTrue;
		
		isTrue = StudentDBUtil.validate(Id);
		
		if (isTrue == true) {
			List<Student> stdDetails = StudentDBUtil.SearchStudent(Id);
			request.setAttribute("stdDetails", stdDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("StudentProfile.jsp");
			dis.forward(request, response);
		} else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Results not found.Please Enter Valid Student name...');");
			out.println("location='studentSearch.jsp'");
			out.println("</script>");
		}
	
	
	}

}
