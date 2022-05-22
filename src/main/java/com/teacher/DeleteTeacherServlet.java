package com.teacher;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/DeleteTeacherServlet")
public class DeleteTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String tId = request.getParameter("tid"); //"cusid"
		boolean isTrue;
		
		isTrue = TeacherDBUtil.deleteTeacher(tId);  //TeacherID
		
		if (isTrue == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("Tlogin.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			List<Teacher> cusDetails = TeacherDBUtil.getTeacherDetails(tId);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("teacheraccount.jsp");
			dispatcher.forward(request, response);
		}

		
		
		
		
	}

}
