package hibernateUtilConfig;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import userNote.entities.Notes;
import userNote.entities.User;

public class HibernateUtil {
     private static SessionFactory sessionFactory;

     public SessionFactory getSessionFactory(){
         if(sessionFactory == null){
             Configuration configuration = new Configuration();
             configuration.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
             configuration.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/usernotedb");
             configuration.setProperty("hibernate.connection.username", "root");
             configuration.setProperty("hibernate.connection.password", "Rupam@mysql9301");

             configuration.setProperty("hibernate.show_sql", "true");
             configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
             configuration.setProperty("hibernate.hbm2ddl.auto", "update");

             configuration.addAnnotatedClass(Notes.class);
             configuration.addAnnotatedClass(User.class);

            sessionFactory = configuration.buildSessionFactory();
            return sessionFactory;
         }
         return sessionFactory;
     }
}
