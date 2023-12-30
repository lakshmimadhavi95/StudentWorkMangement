package com.imaginnovate.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.imaginnovate.Student.Service.StudentService;

@SpringBootApplication
public class StudentApplication {
	

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StudentApplication.class, args);
		StudentService service= context.getBean(StudentService.class);
		System.out.println("Hello World");
		Student thomas = new Student("333", "Thomas", "edison" ,"01-01-1991", "C", "M",
				  "99","35","35");
		String result =service.createStudent(thomas);
		System.out.println(result );
		
		//update for student marks
		System.out.println(service.updateStudent("333", "1", "900", "35"));
	}

}
