package com.example.createStudentApplication_usingRelationship;

import com.example.createStudentApplication_usingRelationship.entity.Address;
import com.example.createStudentApplication_usingRelationship.entity.Student;
import com.example.createStudentApplication_usingRelationship.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreateStudentApplicationUsingRelationshipApplication implements CommandLineRunner {

	private Studentservice studentservice;
	@Autowired
	public CreateStudentApplicationUsingRelationshipApplication(Studentservice studentservice) {
		this.studentservice = studentservice;
	}

	public static void main(String[] args) {
		SpringApplication.run(CreateStudentApplicationUsingRelationshipApplication.class, args);

	}
	public void save(){
		Address address=new Address("Dighori","Nagpur");
		Student student1=new Student(1001,"Pranay",address);
		String string = studentservice.save(student1);
		System.out.println(string);
	}

	@Override
	public void run(String... args) throws Exception {
		save();
	}
}
