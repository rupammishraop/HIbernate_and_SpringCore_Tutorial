package constructor.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class Main {
    public static void main(String []args) {
        List<String> list = new ArrayList<>();
        list.add("PowerPoint");
        list.add("Exel");
         ApplicationContext context = new ClassPathXmlApplicationContext("configCI.xml");
         Person p1 =(Person) context.getBean("person1");
         System.out.println(p1);
    }
}
