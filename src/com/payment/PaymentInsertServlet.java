package com.payment;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class PaymentInsertServlet
 */
@WebServlet("/PaymentInsertServlet")
public class PaymentInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String Age = request.getParameter("age");
		String Stu = request.getParameter("stu");
		String Grade = request.getParameter("grade");
		String Subj = request.getParameter("sub");
		
		String Email = request.getParameter("email");
		String tell = request.getParameter("mobile");
		String masseg = request.getParameter("masseg");
		String Img = request.getParameter("img");
		
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		//SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(LocalDateTime.now());
		
		String paydate = dtf.format(now);
		
		
		
		boolean isTrue;
		isTrue=PaymentDB.insertPayment(name, Age, Stu, Grade, Subj, paydate, Email, tell, masseg, Img);
		
		if(isTrue == true) {
			String STID= request.getParameter("stu");
			String phone = request.getParameter("mobile"); 
			String email = request.getParameter("email");
			  
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

}
