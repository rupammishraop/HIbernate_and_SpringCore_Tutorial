package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("configAutoWiring.xml");
        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person1);
    }
}
