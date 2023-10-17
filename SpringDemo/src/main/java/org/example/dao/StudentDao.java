package org.example.dao;

import org.example.Entities.Student;

import java.util.List;

public interface StudentDao {
    public int insert(Student s);
    public void delete(Student s);
    public void delete(int id);
    public void update(Student s);
    public Student getStudent(int id);
    public List<Student> getAllStudents();


}
