package com.payment;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PaymentSearchServlet
 */
@WebServlet("/PaymentSearchServlet")
public class PaymentSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		
		String ID= request.getParameter("pid");
		
	  
	  try {
				List<Payment>payDetails = PaymentDB.validates(ID);
				request.setAttribute("payDetails", payDetails); 
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	 
	 RequestDispatcher dis = request.getRequestDispatcher("paymentView.jsp");
	 dis.forward(request, response);
	}

}
