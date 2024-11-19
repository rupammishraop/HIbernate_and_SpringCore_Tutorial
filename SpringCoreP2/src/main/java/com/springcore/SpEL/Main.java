package com.springcore.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String []args){
        ApplicationContext context = new ClassPathXmlApplicationContext("configSpEL.xml");

        A a = context.getBean("a", A.class);
        System.out.println(a);
    }
}
