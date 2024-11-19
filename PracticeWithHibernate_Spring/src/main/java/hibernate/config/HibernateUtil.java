package hibernate.config;

import com.entities.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
      public static SessionFactory sessionFactory;

      public SessionFactory getSessionFactory(){
          if(sessionFactory == null){
              try {
                  Configuration configuration = new Configuration();

                  configuration.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
                  configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hibernatedb");
                  configuration.setProperty("hibernate.connection.username", "root");
                  configuration.setProperty("hibernate.connection.password", "Rupam@mysql9301");
                  configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
                  configuration.setProperty("hibernate.hbm2ddl.auto", "update");
                  configuration.setProperty("hibernate.show_sql", "true");

                  configuration.addAnnotatedClass(Student.class);

                  sessionFactory = configuration.buildSessionFactory();
                  return sessionFactory;

              }catch (Exception e){
                  e.printStackTrace();
              }
          }
          return sessionFactory;
      }

}
