package com.example.studentmangmentsystem.repository;

import com.example.studentmangmentsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


//JpaRepository -> take two types first one for entity and second one for primary key type
public interface StudentRepository extends JpaRepository<Student, Long> {

}
