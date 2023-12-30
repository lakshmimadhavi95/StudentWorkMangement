package com.imaginnovate.Student.validator;

import org.springframework.stereotype.Component;

@Component
public class StudentUpdateValidator {
	
	public String validate( String marks1, String marks2, String marks3)
	{
		int marks_1 = Integer.parseInt(marks1), 
				marks_2 = Integer.parseInt(marks2),
				marks_3 = Integer.parseInt(marks3);
		if(marks_1 < 0 && marks_1 >100)
			return "marks1 should be in the range of 0 to 100";
		if(marks_2 < 0 && marks_2 >100)
			return "marks2 should be in the range of 0 to 100";
		if(marks_3 < 0 && marks_3 >100)
			return "marks3 should be in the range of 0 to 100";
		return null;
	}

}
