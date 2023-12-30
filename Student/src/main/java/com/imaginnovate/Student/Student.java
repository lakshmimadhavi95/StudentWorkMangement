package com.imaginnovate.Student;

public class Student {
	
	// required fields Id, First Name, Last Name, DOB, Section, Gender, Marks1, Marks 2, Marks 3, Total, Average, Result

	private String id;
	private String firstName;
	private String lastName;
	private String dob;
	private String section;
	private String gender;
	private String marks1;
	private String marks2;
	private String marks3;
	private String total;
	private String average;
	private String result;
	
	
	public Student(String id, String firstName, String lastName, String dob, String section, String gender,
			String marks1, String marks2, String marks3, String total, String average, String result) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.section = section;
		this.gender = gender;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.total = total;
		this.average = average;
		this.result = result;
	}
	
	
	
	public Student(String id, String firstName, String lastName, String dob, String section, String gender,
			String marks1, String marks2, String marks3) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.section = section;
		this.gender = gender;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	
	


	public Student(String firstName, String lastName, String dob, String section, String gender, String marks1,
			String marks2, String marks3) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.section = section;
		this.gender = gender;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMarks1() {
		return marks1;
	}
	public void setMarks1(String marks1) {
		this.marks1 = marks1;
	}
	public String getMarks2() {
		return marks2;
	}
	public void setMarks2(String marks2) {
		this.marks2 = marks2;
	}
	public String getMarks3() {
		return marks3;
	}
	public void setMarks3(String marks3) {
		this.marks3 = marks3;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getAverage() {
		return average;
	}
	public void setAverage(String average) {
		this.average = average;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
	
}
