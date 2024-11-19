package com.HibernateUtil;

import com.ManyToMany.entities.Employee;
import com.ManyToMany.entities.Project;
import com.OneToOne.entities.Answer;
import com.OneToOne.entities.Question;
import com.entities.Address;
import com.entities.Certificate;
import com.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    public static SessionFactory sessionFactory;

    public SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            Configuration configuration = new Configuration();
            configuration.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
            configuration.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/hibernateDB");
            configuration.setProperty("hibernate.connection.username","root");
            configuration.setProperty("hibernate.connection.password","Rupam@mysql9301");
            configuration.setProperty("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
            configuration.setProperty("hibernate.hbm2ddl.auto","update");
            configuration.setProperty("hibernate.show_sql", "true");
//            configuration.addAnnotatedClass(Address.class);

            configuration.addAnnotatedClass(Student.class);
            configuration.addAnnotatedClass(Certificate.class);
//            configuration.addAnnotatedClass(Question.class);
//            configuration.addAnnotatedClass(Answer.class);
            configuration.addAnnotatedClass(Employee.class);
            configuration.addAnnotatedClass(Project.class);


            // Enable second-level caching
            configuration.setProperty("hibernate.cache.use_second_level_cache", "true");

            // Specify the cache region factory class (using Ehcache in this example)
            configuration.setProperty("hibernate.cache.region.factory_class", "org.hibernate.cache.spi.RegionFactory");

              // Enable query cache (optional if you also want to cache query results)
            configuration.setProperty("hibernate.cache.use_query_cache", "true");

            return configuration.buildSessionFactory();
        }
        return sessionFactory;
    }

}
