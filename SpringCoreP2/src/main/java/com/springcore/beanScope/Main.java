package com.springcore.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configBeanScope.xml");

        Person person = (Person) context.getBean("person");
        Person person2 = (Person) context.getBean("person");
        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());
    }
}
