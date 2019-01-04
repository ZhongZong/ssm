package com.zzk.ssm.entity;

public class Student {
	
	private Integer stuId;
	
	private String studentName;
	
	private Integer studentAge;

	public Student() {
		super();
	}


	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	

	public Integer getStuId() {
		return stuId;
	}


	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}
	
	

}
