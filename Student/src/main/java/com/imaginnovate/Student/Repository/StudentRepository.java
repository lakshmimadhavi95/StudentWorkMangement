package com.imaginnovate.Student.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.imaginnovate.Student.Student;

@Component
public class StudentRepository {

	private static List<Student> studentData = new ArrayList<Student>();

	static {
		Student thomas = new Student("111", "Thomas", "edison", "01-01-1991", "A", "M", "99", "99", "99");
		Student sachin = new Student("777", "Sachin", "Tendulkar", "01-01-1991", "A", "M", "99", "99", "99");
		studentData.add(sachin);
		studentData.add(thomas);

	}

	private String calculateTotal(Student student) {

		int total = Integer.parseInt(student.getMarks1()) + Integer.parseInt(student.getMarks2())
				+ Integer.parseInt(student.getMarks3());
		return String.valueOf(total);

	}
	
	private String calculateAverage(Student student) {

		int avg = Integer.parseInt(student.getTotal())/3;
		return String.valueOf(avg);

	}
	
	private String calculateResult(Student student) {

		int marks1 = Integer.parseInt(student.getMarks1()), 
				marks2 = Integer.parseInt(student.getMarks2()),
				marks3 = Integer.parseInt(student.getMarks3());
		if (marks1 < 35 || marks2 < 35 || marks3 < 35  )
		return "Failed";
		else 
			return "Passed";

	}

	public String createStudent(Student student) {

		for (Student studentData : studentData) {
			if (studentData.getId() == student.getId())
				return "Student is alredy exist";
		}
		if (student.getId() == null) {
			student.setId(String.valueOf(studentData.size()));
		}
		student.setTotal(calculateTotal(student));
		student.setAverage(calculateAverage(student));
		String res= calculateResult(student);
		
		/*
		 * if(!("M".equals(student.getGender()) || "F".equals(student.getGender())))
		 * return "Please enter valid Gender..."; if(!("A".equals(student.getSection())
		 * || "B".equals(student.getSection()) || "C".equals(student.getSection())))
		 * return "Valid Sections are A, B , C Only. Please enter valid Section...";
		 * student.setResult(res); if("Failed".equals(res)) { return
		 * "Student is failed hence unable to store the data";
		 * 
		 * }
		 */
		studentData.add(student);
		return "Student has been Created Successfully";

	}
	
	
	public String updateStudent(String id, String marks1, String marks2, String marks3) {

		for (Student studentData : studentData) {
			if (studentData.getId().equals(id))
			{
				studentData.setMarks1(marks1);
				studentData.setMarks2(marks2);
				studentData.setMarks3(marks3);
				studentData.setTotal(calculateTotal(studentData));
				studentData.setAverage(calculateAverage(studentData));
			}
			else
			{
				return "Given Student id is not found" ;
			}
		}
		
		return "Student has been updated Successfully";

	}

}
