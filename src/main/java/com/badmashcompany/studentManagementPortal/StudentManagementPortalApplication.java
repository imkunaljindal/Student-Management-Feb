package com.badmashcompany.studentManagementPortal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementPortalApplication {

	public static void main(String[] args) {

		StudentController studentController = new StudentController();
		studentController.logs();
		SpringApplication.run(StudentManagementPortalApplication.class, args);
	}

}
