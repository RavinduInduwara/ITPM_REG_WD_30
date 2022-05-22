package com.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentInsert")
public class StudentInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String boy = request.getParameter("boy"); 
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		String grade = request.getParameter("grade");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		
		String gtype = request.getParameter("gtype");
		String gname = request.getParameter("gname");
		String gemail = request.getParameter("gemail");
		String gaddress = request.getParameter("gaddress");
		String gcontact = request.getParameter("gcontact");
		String occupation = request.getParameter("occupation");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		//create variable to catch return value from insertStudent
		boolean isTrue;
		
		isTrue = StudentDBUtil.insertstudent(name, boy, gender, age, grade,email, contact, address, gtype, gname, gemail, gaddress, gcontact, occupation, username, password);
		
		//check is it insert successfully
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("login.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}
