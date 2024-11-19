package com.springConfig;

import hql.entities.Student;
import hql.entities.Todos;
import hql.entities.User;
import hql.hibernatteUtil.HibernateUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {

    @Bean(name = {"student"})
    public Student getStudent(){
        return new Student();
    }

    @Bean(name = {"hibernateUtil"})
    public HibernateUtil getHibernateUtil(){
        return new HibernateUtil();
    }

    @Bean(name = {"user"})
    public User getUser(){
        return new User();
    }

    @Bean(name = {"todos"})
    @Scope("prototype")
    public Todos getTodos(){
        return new Todos();
    }

}
