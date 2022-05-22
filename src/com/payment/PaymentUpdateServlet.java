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
 * Servlet implementation class PaymentUpdateServlet
 */
@WebServlet("/PaymentUpdateServlet")
public class PaymentUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Id = request.getParameter("id");
		String name = request.getParameter("name");
		String Age = request.getParameter("age");
		String Stu = request.getParameter("stu");
		String Grade = request.getParameter("grade");
		String Subj = request.getParameter("sub");
		String Paydate = request.getParameter("pay");
		String Email = request.getParameter("email");
		String tell = request.getParameter("tell");
		String masseg = request.getParameter("mg");
		String Img = request.getParameter("img");
		
		
		boolean isTrue;
		isTrue=PaymentDB.UpdatePayment(Id,name, Age, Stu, Grade, Subj, Paydate, Email, tell, masseg, Img);
		
		if(isTrue == true) {
			String STID= request.getParameter("stu");
			String phone = request.getParameter("tell"); 
			  
			  try {
						List<Payment>payDetails = PaymentDB.validate(STID,phone);
						request.setAttribute("payDetails", payDetails); 
			  }
			  catch(Exception e) {
				  e.printStackTrace();
			  }
			 
			 RequestDispatcher dis = request.getRequestDispatcher("paymentView.jsp");
			 dis.forward(request, response);
			
		}
		else {
			RequestDispatcher dis1 = request.getRequestDispatcher("unsuccess.jsp");
			dis1.forward(request, response);
			
		}
		
		
	}

}
