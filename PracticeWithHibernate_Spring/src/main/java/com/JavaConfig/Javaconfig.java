package com.JavaConfig;

import com.entities.Student;
import hibernate.config.HibernateUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("JavaConfig")
public class Javaconfig {

    @Bean(name = {"student"})
    public Student getStudent(){
        return new Student();
    }

    @Bean(name = {"hibernateUtil"})
    public HibernateUtil getHibernateUtil(){
        return new HibernateUtil();
    }
}
