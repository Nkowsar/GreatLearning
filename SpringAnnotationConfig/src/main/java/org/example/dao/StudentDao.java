package org.example.dao;


import org.example.models.Person;
import org.example.models.Student;

public interface StudentDao {

    Student getStudentById(Long id);
    Student create(Student student);
}
