import com.JavaConfig.Javaconfig;
import com.entities.Student;
import hibernate.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
        Student student = context.getBean("student", Student.class);
        HibernateUtil hibernateUtil = context.getBean("hibernateUtil", HibernateUtil.class);

        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        student.setId(103);
        student.setName("Rishabh Mishra");
        student.setCity("Indore");

        session.persist(student);
        transaction.commit();
        session.close();



//        student.setId(101);
//        student.setName("rupam mishra");
//        student.setCity("bhopal");
//        System.out.println(student);


    }
}
