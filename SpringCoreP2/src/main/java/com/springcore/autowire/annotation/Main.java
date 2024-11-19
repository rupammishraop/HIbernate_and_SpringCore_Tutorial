package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configAuto.xml");
        A a = (A) context.getBean("a");
        System.out.println(a);

    }
}
