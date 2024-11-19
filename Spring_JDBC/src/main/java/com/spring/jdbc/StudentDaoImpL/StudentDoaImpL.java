package com.spring.jdbc.StudentDaoImpL;

import com.spring.jdbc.entities.Student;
import com.spring.jdbc.StudentDaoInterface.StudentDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDoaImpL implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
       String q = "insert into studentinfo(id, name, city) values(?,?,?)";
       int r = jdbcTemplate.update(q, student.getId(), student.getName(), student.getCity());
       return r;
    }

    @Override
    public int update(Student student) {
        String q = "update studentinfo set name=?, city=? where id=?";
        int r  = jdbcTemplate.update(q, student.getName(), student.getCity(), student.getId());
        return r;
    }

    @Override
    public int delete(int studentId) {
        String q = "delete from studentinfo where id=?";
        return jdbcTemplate.update(q, studentId);
    }

    @Override
    public Student getStudent(int studentId) {
       String q = "select * from studentinfo where id=?";
       RowMapper<Student> rowMapper  = new RowMapperStudentImpL();
       Student student =  jdbcTemplate.queryForObject(q, rowMapper, studentId);
       return student;
    }

    @Override
    public List<Student> getStudents() {
         String q = "select * from studentinfo";
         List<Student> studentList =  jdbcTemplate.query(q, new RowMapperStudentImpL());
         return studentList;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
