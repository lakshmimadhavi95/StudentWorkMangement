package com.imaginnovate.Student.validator;

import org.springframework.stereotype.Component;

import com.imaginnovate.Student.Student;

@Component
public class StudentValidator {
	
	private String calculateResult(Student student) {

		int marks1 = Integer.parseInt(student.getMarks1()), 
				marks2 = Integer.parseInt(student.getMarks2()),
				marks3 = Integer.parseInt(student.getMarks3());
		if (marks1 < 35 || marks2 < 35 || marks3 < 35 ) {
			student.setResult("Failed");
		return "Failed";
		}
		else {
			student.setResult("Passed");
			return "Passed";
		}

	}
	
	public String validate(Student student)
	{
		
		if(!("M".equals(student.getGender()) || "F".equals(student.getGender())))
			return "Please enter valid Gender...";
		if(!("A".equals(student.getSection()) || "B".equals(student.getSection()) || "C".equals(student.getSection())))
			return "Valid Sections are A, B , C Only. Please enter valid Section...";
		if("Failed".equals(calculateResult(student))) {
			return "Student has not secured min marks and failed. hence unable to store the data";
			
		}
		return null;
	}

}
