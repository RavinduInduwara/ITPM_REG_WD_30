package com.material;

import java.util.Date;

public class Material {
	
	private int materialID;
	private int teacherID;
	private String materialTitle;
	private Date materialAddedDate;
	private int materialGrade;
	private String materialSubject;
	private String materialLink;
	
	public Material(int materialID, int teacherID, String materialTitle, Date materialAddedDate, int materialGrade, String materialSubject, String materialLink) {
		
		this.materialID = materialID;
		this.teacherID = teacherID;
		this.materialTitle = materialTitle;
		this.materialAddedDate = materialAddedDate;
		this.materialGrade = materialGrade;
		this.materialSubject = materialSubject;
		this.materialLink = materialLink;
		
	}
	
	public int getMaterialID() {
		return materialID;
	}

	public int getTeacherID() {
		return teacherID;
	}

	public String getMaterialTitle() {
		return materialTitle;
	}

	public Date getMaterialAddedDate() {
		return materialAddedDate;
	}

	public int getMaterialGrade() {
		return materialGrade;
	}

	public String getMaterialSubject() {
		return materialSubject;
	}

	public String getMaterialLink() {
		return materialLink;
	}
}