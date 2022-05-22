package com.teacher;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/UpdateTeacherServlet")
public class UpdateTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

		String tid = request.getParameter("tid");
		String name = request.getParameter("name");
		String nic = request.getParameter("nic");
		String gender = request.getParameter("gender");
		String subject = request.getParameter("subject");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String experience = request.getParameter("experience");
		String eduqualifications = request.getParameter("eduqualifications");
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		boolean isTrue;
		
		isTrue = TeacherDBUtil.updateteacher(tid,name,nic,gender,subject,address,email,phone,experience,eduqualifications,username,password);
		
		if(isTrue == true) {
			
			List<Teacher> cusDetails = TeacherDBUtil.getTeacherDetails(tid);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("teacheraccount.jsp");
			dis.forward(request, response);
		}
		else {
			
			List<Teacher> cusDetails = TeacherDBUtil.getTeacherDetails(tid);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("teacheraccount.jsp");
			dis.forward(request, response);
		}
		
		
		
	}

}
