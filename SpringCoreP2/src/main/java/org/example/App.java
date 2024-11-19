package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//
//        ApplicationContext context  = new ClassPathXmlApplicationContext("config.xml");
//        Student student1 = (Student) context.getBean("student1");
//        Student student2 = (Student) context.getBean("student2");
//          System.out.println(student1);
//          System.out.println(student2);

//        ApplicationContext context = new ClassPathXmlApplicationContext("configList.xml");
//        ListBean list = (ListBean) context.getBean("list1");
//        for(Integer i : list.getList()){
//            System.out.println(i);
//        }

//        ApplicationContext context = new ClassPathXmlApplicationContext("configSet.xml");
//        SetBean setobj = (SetBean) context.getBean("set1");
//
//        System.out.println(setobj);

//        ApplicationContext context = new ClassPathXmlApplicationContext("configMap.xml");
//        MapBean map1 = (MapBean) context.getBean("map1");
//        System.out.println(map1);

//          ApplicationContext context = new ClassPathXmlApplicationContext("configProperties.xml");
//          PropertiesBean prop1 = (PropertiesBean) context.getBean("prop1");
//          System.out.println(prop1);
          ApplicationContext context = new ClassPathXmlApplicationContext("ConfigRef.xml");
          A ob = (A) context.getBean("Aob");
//          System.out.println(ob.getOb().getName());
          ob.getOb().setName("Rishabh");
          System.out.println(ob.getOb().getName());
          System.out.println(ob.getSurname());
    }
}
