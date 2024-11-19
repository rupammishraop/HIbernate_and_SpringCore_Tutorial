import hibernateUtilConfig.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springConfig.SpringConfig;
import userNote.entities.Notes;
import userNote.entities.User;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        HibernateUtil hibernateUtil  = context.getBean("hibernateUtil", HibernateUtil.class);
        User user = context.getBean("user", User.class);
        Notes note1 = context.getBean("notes", Notes.class);
//        Notes note2 = context.getBean("notes", Notes.class);

        SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

//        user.setUserName("Rupam Mishra");
//        user.setEmail("rupam7415@gmail.com");
//        user.setPassword("12345678");
//        note1.setNote("Feeling Depressed");
//        note2.setNote("Learning Hibernate");
//
//        List<Notes> notes = new ArrayList<>();
//        notes.add(note1);
//        notes.add(note2);
//        user.setNotes(notes);
//
//        session.persist(user);
//        session.persist(note1);
//        session.persist(note2);

        user.setUserName("Rupam Mishra");
        user.setEmail("rupam7415@gmai.com");
        user.setPassword("12345678");

        note1.setNote("Feeling Lonely");
        List<Notes> notes = new ArrayList<>();
        notes.add(note1);
        user.setNotes(notes);

        session.persist(user);
        session.persist(note1);


        transaction.commit();
        session.close();
        sessionFactory.close();



    }
}
