package org.example.dao;


import org.example.constants.EntityConstants;
import org.example.mapper.StudentMapper;
import org.example.mapper.PersonMapper;
import org.example.models.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class StudentDaoImpl implements StudentDao{

    JdbcTemplate jdbcTemplate;

    public StudentDaoImpl(DataSource dataSource) {
        jdbcTemplate=new JdbcTemplate(dataSource);
    }

    public Student getStudentById(Long id) {
        return jdbcTemplate.queryForObject("Select * from student where id = ?",new Object[]{id}, new StudentMapper());
    }

    @Override
    public Student create(Student student) {
        jdbcTemplate.update("insert into student("+ EntityConstants.StudentEntity.id+","+EntityConstants.StudentEntity.name+") values(?,?)",student.getId(),student.getName());
        return student;
    }
}