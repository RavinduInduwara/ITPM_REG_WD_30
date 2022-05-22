package com.student;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateCustomerServlet")
public class UpdateCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id"); 
		String name = request.getParameter("name");
		String boy = request.getParameter("boy");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		String grade = request.getParameter("grade");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		String gname = request.getParameter("gname");
		String gtype = request.getParameter("gtype");
		String gemail = request.getParameter("gemail");
		String gaddress = request.getParameter("gaddress");
		String gcontact = request.getParameter("gcontact");
		String occupation = request.getParameter("occupation");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		boolean isTrue;
	
		isTrue = StudentDBUtil.updatestudent(id, name, boy, gender, age, grade, email, contact, address, gname, gtype, gemail, gaddress, gcontact, occupation, username, password);
		
		if(isTrue == true) {
			
			List<Student> stdDetails = StudentDBUtil.getStudentDetails(id);
			request.setAttribute("stdDetails", stdDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("StudentProfile.jsp");
			dis.forward(request, response);
		}
		else {
			
			List<Student> stdDetails = StudentDBUtil.getStudentDetails(id);
			request.setAttribute("stdDetails", stdDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("StudentProfile.jsp");
			dis.forward(request, response);
		}
		
	}

}
