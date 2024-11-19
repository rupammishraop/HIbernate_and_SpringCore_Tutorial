package com;

import com.HibernateUtil.HibernateUtil;
import com.SpringConfig.SpringConfig;
import com.entities.Address;
import com.entities.Certificate;
import com.entities.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class App {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Address address = context.getBean("address", Address.class);
        Student student = context.getBean("student", Student.class);
        Certificate certificate = context.getBean("certificate", Certificate.class);
        HibernateUtil hibernateUtil = context.getBean("hibernateUtil", HibernateUtil.class);
        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();



//
//        // setting address Value
////        address.setStreet("Vidisha Road");
////        address.setCity("Bhopal");
////        address.setAddedDate(new Date());
////        address.setOpen(false);
////        address.setX(123);
////
////        // reading Image
////
////        FileInputStream fis = new FileInputStream("src/main/resources/rupam.jpg");
////        byte[] data = new byte[fis.available()];
////        fis.read(data);
////        address.setImage(data);
//
//
//        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//
////        session.persist(address);
//
////        Address address1 = (Address) session.get(Address.class, 2); // null if object not found
////        Address address1 = (Address) session.load(Address.class, 2); // object not found Exception
//
////        Address address1 = (Address) session.find(Address.class, 2); // null
////          Address address1 = (Address) session.get(Address.class, 1);
//          Address address1 = (Address) session.byId(Address.class).getReference(2);
//
//          System.out.println(address1);
////          System.out.println(address2.hashCode());
////        transaction.commit();
//
//          student.setStudentName("Ritik Mishra");
//          certificate.setCertificateName("TCS Ion");
//          certificate.setDuration("1 Month");
//          student.setCertificate(certificate);
//          session.persist(student);
//          transaction.commit();

        Student student1 =  session.get(Student.class, 1);
        System.out.println(student1);

        session.close();
        Student student2 =  session.get(Student.class, 1);
        System.out.println(student2);

        session.close();
        sessionFactory.close();


    }
}
