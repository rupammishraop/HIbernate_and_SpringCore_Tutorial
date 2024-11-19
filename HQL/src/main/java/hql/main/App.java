package hql.main;
import com.springConfig.SpringConfig;
import hql.entities.Student;
import hql.hibernatteUtil.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        HibernateUtil hibernateUtil = context.getBean("hibernateUtil", HibernateUtil.class);
        Student student = context.getBean("student", Student.class);
        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // setting Student
//        student.setStudentName("Ritik Mishra");
//
//        session.persist(student);
//        transaction.commit();


        // Get data from database

//        String query = "from Student as s where s.studentName=:name1 or s.studentName=:name2";
//
//        Query q = session.createQuery(query);
//        q.setParameter("name1","Rupam Mishra");
//        q.setParameter("name2","Ritik Mishra");
//        List<Student> studentList = q.list();
//
//        for(Student s : studentList ){
//            System.out.println(s.getStudentId() + " : " + s.getStudentName());
//        }

        // delete data from database

//        Query q = session.createQuery("delete from Student as s where s.studentName=:name");
//        q.setParameter("name", "Rupam Mishra");
//        int rowAffected = q.executeUpdate();
//        System.out.println("rowAffected" + rowAffected);
//        transaction.commit();

        // update the data in database

        Query q = session.createQuery("update Student set studentName=:name where studentId=:id");
        q.setParameter("name", "Rupam Mishra");
        q.setParameter("id", 2);
        q.executeUpdate();


        session.close();
        sessionFactory.close();
    }
}
