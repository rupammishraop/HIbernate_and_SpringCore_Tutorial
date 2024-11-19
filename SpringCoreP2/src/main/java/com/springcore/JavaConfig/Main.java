package com.springcore.JavaConfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> phones = new ArrayList<>();
        phones.add("9301858940");
        phones.add("7415336267");

        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Student student = context.getBean("student", Student.class);
        Course course = context.getBean("course", Course.class);
        course.setCourse("B.Tech");
        student.setCourse(course);
        student.setName("Rishabh Mishra");
        student.setId(101);
        student.setPhones(phones);
        System.out.println(student);
    }
}

