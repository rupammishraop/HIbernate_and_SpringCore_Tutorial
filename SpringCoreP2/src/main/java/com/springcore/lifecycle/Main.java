package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String []args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("configLifeCycle.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("configLifeCycle.xml");
        context.registerShutdownHook();
//        Bottle b1 = (Bottle) context.getBean("b1");
//        System.out.println(b1);
//        Samosha s1 = (Samosha) context.getBean("s1");
//        System.out.println(s1);

        LifeCycleByAnnotation obj1 = ( LifeCycleByAnnotation) context.getBean("ex1");
        System.out.println(obj1);

    }
}
