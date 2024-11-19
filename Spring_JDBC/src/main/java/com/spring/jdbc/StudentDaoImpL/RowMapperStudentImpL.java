package com.spring.jdbc.StudentDaoImpL;

import com.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperStudentImpL implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
       Student student = new Student();
       student.setId(rs.getInt(1));
       student.setName(rs.getString(2));
       student.setCity(rs.getString("city"));
       return student;
    }
}
