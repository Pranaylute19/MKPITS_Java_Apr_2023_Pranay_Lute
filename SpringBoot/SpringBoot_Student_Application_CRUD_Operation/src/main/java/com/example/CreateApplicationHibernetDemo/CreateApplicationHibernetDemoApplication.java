package com.example.CreateApplicationHibernetDemo;

import com.example.CreateApplicationHibernetDemo.dao.StudentDao;
import com.example.CreateApplicationHibernetDemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CreateApplicationHibernetDemoApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CreateApplicationHibernetDemoApplication.class, args);
		System.out.println("hii");
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return runner ->{
//			createStudent(studentDao);
			readStudent(studentDao);
//			deleteStudentRecord(studentDao);
			System.out.println("Hello");
		};
	}
	public void createStudent(StudentDao studentDao){
		Student student=new Student("Pranay","Dighori","nagpur");
		studentDao.save(student);
	}
	public void readStudent(StudentDao studentDao){
		Student student=studentDao.findrollno(2);
		System.out.println(student);
	}
	public  void deleteStudentRecord(StudentDao studentDao){
		studentDao.deleterecord(4);

	}

}
