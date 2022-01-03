package com.example.jdbcdemo.Service;

import com.example.jdbcdemo.Entity.Student;
import com.example.jdbcdemo.Repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private studentRepository repo;

    public Student saveStudent(Student student){
        return repo.save(student);
    }
    public List<Student> ListAll(){
        return repo.findAll();
    }
}
