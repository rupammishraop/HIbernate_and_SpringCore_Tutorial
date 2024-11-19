package com;

import com.HibernateUtil.HibernateUtil;
import com.ManyToMany.entities.Employee;
import com.ManyToMany.entities.Project;
import com.SpringConfig.SpringConfig;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class ManyToMany_main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Employee e1 = context.getBean("employee", Employee.class);
//        Employee e2 = context.getBean("employee", Employee.class);
//        Project p1 = context.getBean("project", Project.class);
//        Project p2 = context.getBean("project", Project.class);
//        Project p3 = context.getBean("project", Project.class);
//
        HibernateUtil hibernateUtil = context.getBean("hibernateUtil", HibernateUtil.class);
        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
//        //Setting Value
//
//        e1.setEmp_id(101);
//        e1.setEmployeeName("Rupam Mishra");
//
//        e2.setEmp_id(102);
//        e2.setEmployeeName("Rishabh Mishra");
//
//        p1.setP_id(1001);
//        p1.setProjectName("ChatBot");
//
//        p2.setP_id(1002);
//        p2.setProjectName("Web Development");
//
//        p3.setP_id(1003);
//        p3.setProjectName("Backend");
//
//        List<Project> RupamProjectList = new ArrayList<>();
//        RupamProjectList.add(p2);
//        RupamProjectList.add(p3);
//
//        List<Project> RishabhProjectList = new ArrayList<>();
//        RishabhProjectList.add(p1);
//        RishabhProjectList.add(p2);
//
//        List<Employee> project1BelongEmp = new ArrayList<>();
//        project1BelongEmp.add(e2);
//
//        List<Employee> project2BelongEmp = new ArrayList<>();
//        project2BelongEmp.add(e1);
//        project2BelongEmp.add(e2);
//
//        List<Employee> project3BelongEmp = new ArrayList<>();
//        project3BelongEmp.add(e1);
//
//        e1.setProjects(RupamProjectList);
//        e2.setProjects(RishabhProjectList);
//
//        p1.setEmployees(project1BelongEmp);
//        p2.setEmployees(project2BelongEmp);
//        p3.setEmployees(project3BelongEmp);
//
//        session.persist(e1);
//        session.persist(e2);
//        session.persist(p1);
//        session.persist(p2);
//        session.persist(p3);

        Employee e1 = session.find(Employee.class, 101);
        System.out.println(e1.getEmployeeName());
        System.out.println(e1.getProjects());
        transaction.commit();
        session.close();
        sessionFactory.close();




    }
}
