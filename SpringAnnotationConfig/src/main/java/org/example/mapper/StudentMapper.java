package org.example.mapper;


import org.example.constants.EntityConstants;
import org.example.models.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentMapper implements RowMapper<Student> {
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student=new Student();
        student.setId(rs.getLong(EntityConstants.StudentEntity.id));
        student.setName(rs.getString(EntityConstants.StudentEntity.name));
        return student;
    }
}
