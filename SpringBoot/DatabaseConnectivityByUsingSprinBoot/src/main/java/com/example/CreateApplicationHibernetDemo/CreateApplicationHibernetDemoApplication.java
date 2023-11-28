package com.example.CreateApplicationHibernetDemo;

import com.example.CreateApplicationHibernetDemo.dao.StudentDao;
import com.example.CreateApplicationHibernetDemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CreateApplicationHibernetDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateApplicationHibernetDemoApplication.class, args);
		System.out.println("hii");
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return runner ->{
			createStudent(studentDao);
			readStudent(studentDao);
		};
	}
	public void createStudent(StudentDao studentDao){
		Student student=new Student("Pranay","Dighori","nagpur");
	}
	public  void  readStudent(StudentDao studentDao){
		Student student=studentDao.findrollno(1);
		System.out.println(student);
	}


}
