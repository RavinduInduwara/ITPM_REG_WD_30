package com.material;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MaterialUpdateServlet
 */
@WebServlet("/MaterialUpdateServlet")
public class MaterialUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String materialID = request.getParameter("materialID");
		String teacherID = request.getParameter("teacherID");
		String materialTitle = request.getParameter("materialTitle");
		String materialAddedDate = request.getParameter("materialAddedDate");
		String materialGrade = request.getParameter("materialGrade");
		String materialSubject = request.getParameter("materialSubject");
		String materialLink = request.getParameter("materialLink");
	
		
		boolean success;
		
		success = MaterialDB.updateMaterial(materialID, teacherID, materialTitle, materialGrade, materialSubject, materialLink);
		
		if (success == true){
			
			System.out.println("Success");
			//RequestDispatcher dis = request.getRequestDispatcher("materialSearch.jsp");
			//dis.forward(request, response);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/materialViewLatest");
			dispatcher.forward(request,response);
			
		}
		else{
			
			//RequestDispatcher dis = request.getRequestDispatcher("gameSelect.jsp");
			//dis.forward(request, response);
		}
	}

}
