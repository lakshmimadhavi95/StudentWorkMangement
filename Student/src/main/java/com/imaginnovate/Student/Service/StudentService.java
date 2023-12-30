package com.imaginnovate.Student.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.imaginnovate.Student.Student;
import com.imaginnovate.Student.Repository.StudentRepository;
import com.imaginnovate.Student.validator.StudentUpdateValidator;
import com.imaginnovate.Student.validator.StudentValidator;

@Component
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	@Autowired
	private StudentValidator validator;
	@Autowired
	private StudentUpdateValidator updateValidator;
	
	
	private String genearteId()
	{
		return null;
	}
	
	public String createStudent (Student student) {
		
		return (validator.validate(student)== null ) ? repository.createStudent(student) : validator.validate(student); 
//		return repository.createStudent(student);
		
	}
	
	public String updateStudent(String id, String marks1, String marks2, String marks3) {
		return (updateValidator.validate(marks1, marks2, marks3) == null) ? repository.updateStudent(id,marks1, marks2, marks3) : updateValidator.validate(marks1, marks2, marks3);
	}
}
