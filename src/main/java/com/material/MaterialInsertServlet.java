package com.material;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaterialInsertServlet
 */
@WebServlet("/MaterialInsertServlet")
public class MaterialInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String teacherID = request.getParameter("teacher");
		String materialTitle = request.getParameter("title");
		String materialGrade = request.getParameter("grade");
		String materialSubject = request.getParameter("subject");
		String materialLink = request.getParameter("link");
		
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		//LocalDateTime now = LocalDateTime.now();
		//System.out.println(LocalDateTime.now());
		
		//String materialAddedDate = dtf.format(now);
		//System.out.println(materialAddedDate);
		
		boolean success;
		
		success = MaterialDB.materialInsert(teacherID, materialTitle, materialGrade, materialSubject, materialLink);
		
		if ( success == true) {
			//code when insert is successfull
			System.out.println("Success");
			request.setAttribute("insertSuccess", success);
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/materialViewLatest");
			dispatcher.forward(request,response);
			
			//RequestDispatcher dis = request.getRequestDispatcher("materialSearch.jsp");
			//dis.forward(request, response);
		}
		else {
			//code when insert operation is unsuccessfull
			System.out.println("unSuccess");
			request.setAttribute("insertSuccess", success);
			
			RequestDispatcher dis2 = request.getRequestDispatcher("materialSearch.jsp");
			dis2.forward(request, response);
		}
	}

}
