package com.spring.jdbc;

import com.spring.jdbc.StudentDaoImpL.StudentDoaImpL;
import com.spring.jdbc.config.JavaConfig;
import com.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentDoaImpL studentDoaImpL = context.getBean("studentDoaImpL", StudentDoaImpL.class);
        Student student = context.getBean("student", Student.class);

        //Insert Methods;

//        student.setId(104);
//        student.setName("Raj Rajput");
//        student.setCity("Bhopal");
//        int r  = studentDoaImpL.insert(student);
//        System.out.println("row Affected" + r);

        //Update Methods;
//        student.setId(104);
//        student.setName("Muskan Chourasiya");
//        student.setCity("Lalitpur");
//
//        int r = studentDoaImpL.update(student);
//        System.out.println("update row  Affected" + r);

        // Delete Method
//
//        int result = studentDoaImpL.delete(103);
//        System.out.println("Deleted row"+ result);

        // Select Method for single student;

//        Student student1 = studentDoaImpL.getStudent(104);
//        System.out.println(student1);

        // select Method for all Student

        List<Student> studentList = studentDoaImpL.getStudents();
        for (Student s: studentList ){
            System.out.println(s);
        }

    }
}
