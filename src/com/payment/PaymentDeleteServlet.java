package com.payment;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class PaymentDeleteServlet
 */
@WebServlet("/PaymentDeleteServlet")
public class PaymentDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String ID= request.getParameter("id");
		boolean  isTrue;
	  
	 
			isTrue=	PaymentDB.deletePayment(ID);
	
	 if(isTrue==true) {
	 
	 RequestDispatcher dis = request.getRequestDispatcher("paymentInsert.jsp");
	 dis.forward(request, response);
	 }
	 
	 else {
		 
		 RequestDispatcher dis = request.getRequestDispatcher("#");
		 dis.forward(request, response);
		 
		 
	 }
	}
}
