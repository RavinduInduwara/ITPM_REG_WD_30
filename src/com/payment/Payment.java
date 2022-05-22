package com.payment;

public class Payment {
	
	private int pID;
	private String name;
	private String age;
	private String student_numbr;
	private String grade;
	private String subject;
	private String paydate;
	private String email;
	private String phone_number;
	private String masseg;
	private String img;
	
	
	public Payment(int pID, String name, String age, String student_numbr, String grade, String subject, String paydate,
			String email, String phone_number, String masseg, String img) {
		
		this.pID = pID;
		this.name = name;
		this.age = age;
		this.student_numbr = student_numbr;
		this.grade = grade;
		this.subject = subject;
		this.paydate = paydate;
		this.email = email;
		this.phone_number = phone_number;
		this.masseg = masseg;
		this.img = img;
	}


	
	
	public int getpID() {
		
		return pID;
	}




	public String getName() {
		
		return name;
	}


	

	public String getAge() {
		
		return age;
	}


	
	public String getStudent_numbr() {
		
		return student_numbr;
	}




	public String getGrade() {
		
		return grade;
	}



	public String getSubject() {
		
		return subject;
	}




	public String getPaydate() {
		
		return paydate;
	}


	

	public String getEmail() {
		
		return email;
	}



	public String getPhone_number() {
		
		return phone_number;
	}


	

	public String getMasseg() {
		
		return masseg;
	}



	public String getImg() {
		
		return img;
	}


	

}
