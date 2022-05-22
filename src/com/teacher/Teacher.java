package com.teacher;


public class Teacher {

	public String tid;
	public String name;
	public String nic;
	public String gender;
    public String subject;
    public String address;  // private
    public String email;
    public String phone;
    public String experience;
    public String eduqualifications;
    public String userName;
    public String password;
    
    public Teacher(String tid, String name, String nic, String gender, String subject, String address, String email,
			String phone, String experience, String eduqualifications, String userName, String password) {
		
		this.tid = tid;
		this.name = name;
		this.nic = nic;
		this.gender = gender;
		this.subject = subject;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.experience = experience;
		this.eduqualifications = eduqualifications;
		this.userName = userName;
		this.password = password;
		
	}

	public String getTid() {
		return tid;
	}



	public String getName() {
		return name;
	}

	

	public String getNic() {
		return nic;
	}

	

	public String getGender() {
		return gender;
	}

	

	public String getSubject() {
		return subject;
	}

	

	public String getAddress() {
		return address;
	}

	

	public String getEmail() {
		return email;
	}

	

	public String getPhone() {
		return phone;
	}

	

	public String getExperience() {
		return experience;
	}

	

	public String getEduqualifications() {
		return eduqualifications;
	}

	

	public String getUserName() {
		return userName;
	}

	

	public String getPassword() {
		return password;
	}


    
    
	
    

    
	
	


	
	
}
