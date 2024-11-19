package com.springcore.stereotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("configStereo.xml");
        context.registerShutdownHook();
        Student student = context.getBean("studentob", Student.class);
        System.out.println(student);
        System.out.println(student.getPhones());
        System.out.println(student.getPhones().getClass().getName());
    }
}
