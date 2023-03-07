package com.example.studentmangmentsystem;

import com.example.studentmangmentsystem.entity.Student;
import com.example.studentmangmentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentMangmentSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentMangmentSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//      Student student1 = new Student("nourhan", "saeed", "nourhansaeed@gmail.com");
//	  studentRepository.save(student1);
//
//		Student student2 = new Student("reham", "ashraf", "rehamashraf@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("nada", "walid", "nada@gmail.com");
//		studentRepository.save(student3);
	}
}
