package com.hibernate;

import com.hibernate.entities.Student;
import hibernate.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Objects;

public class App {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

         // Pagination

//        Query q = session.createQuery("from Student");
//        q.setFirstResult(0);
//        q.setMaxResults(2);

//         Native Query
        NativeQuery<Object []> q = session.createNativeQuery("select * from student");
        List<Object[]> list = q.list();
         for (Object[] student : list){
             System.out.println(student[0] + " : " + student[1] + " : " +student[2]);
        }

//        Query<Student> q = session.createQuery("from Student", Student.class);
//        List<Student> list = q.list();

//         Student student =  session.get(Student.class, 1);
//         System.out.println(student);
//
//         Student student2 =  session.get(Student.class, 1);
//         System.out.println(student2);


         session.close();



    }
}
