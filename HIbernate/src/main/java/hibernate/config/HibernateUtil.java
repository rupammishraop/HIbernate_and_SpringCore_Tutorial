package hibernate.config;

import com.hibernate.entities.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                // Configure Hibernate properties
                configuration.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
                configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hibernateDB");
                configuration.setProperty("hibernate.connection.username", "root");
                configuration.setProperty("hibernate.connection.password", "Rupam@mysql9301");
                configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

                // Other settings
                configuration.setProperty("hibernate.show_sql", "true");
                configuration.setProperty("hibernate.hbm2ddl.auto", "update");
                configuration.addAnnotatedClass(Student.class);

                sessionFactory = configuration.buildSessionFactory();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
