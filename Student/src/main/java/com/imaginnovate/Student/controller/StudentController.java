package com.imaginnovate.Student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.imaginnovate.Student.Student;
import com.imaginnovate.Student.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;

//	@PostMapping(path= "/student", consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE )
	@GetMapping(path = "/student")
	public ResponseEntity<String> createStudent(@RequestBody Student student) {
		ResponseEntity response = null;
		String createResult = service.createStudent(student);
		/*
		 * if (createResult == true) { response = new
		 * ResponseEntity("Created Successfully", HttpStatus.CREATED); return response;
		 * } else { response = new ResponseEntity("Created Failed", HttpStatus.CREATED);
		 * return response; }
		 */
		return response;
	}

}
