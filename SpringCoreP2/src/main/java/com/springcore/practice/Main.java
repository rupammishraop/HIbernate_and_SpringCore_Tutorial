package com.springcore.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configPractice.xml");

        A a = (A) context.getBean("a");
        System.out.println(a);
    }
}
