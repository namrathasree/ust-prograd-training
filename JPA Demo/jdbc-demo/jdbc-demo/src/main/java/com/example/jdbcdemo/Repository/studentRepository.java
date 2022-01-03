package com.example.jdbcdemo.Repository;

import com.example.jdbcdemo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<Student,String> {
}
