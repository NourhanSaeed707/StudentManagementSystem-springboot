package com.example.studentmangmentsystem.service.impl;

import com.example.studentmangmentsystem.entity.Student;
import com.example.studentmangmentsystem.repository.StudentRepository;
import com.example.studentmangmentsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;
    public  StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    //get all students from db.
    @Override
    public List<Student> getAllStudents(){
      return studentRepository.findAll();
    }

    @Override
    public  Student saveStudent(Student student) {
         return  studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id){
        return  studentRepository.findById(id).get();
    }
    @Override
    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id ){
         studentRepository.deleteById(id);
    }
}
