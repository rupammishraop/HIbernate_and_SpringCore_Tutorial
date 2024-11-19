package com.springcore.JavaConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class JavaConfig {

    @Bean(name = {"course"})
    public Course getCourse(){
        Course course = new Course();
//        course.setCourse("B.Tech");
        return course;
    }

    @Bean(name = {"student"})
    public Student getStudent(){

//        ArrayList<String> Phones = new ArrayList<>();
//        Phones.add("9301858940");
//        Phones.add("7415907066");

        Student student = new Student();
//        student.setCourse(getCourse());
//        student.setName("Rupam Mishra");
//        student.setId(101);
//        student.setPhones(Phones);
        return student;
    }
}