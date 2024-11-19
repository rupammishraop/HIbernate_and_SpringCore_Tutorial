package com.SpringConfig;

import com.HibernateUtil.HibernateUtil;
import com.ManyToMany.entities.Employee;
import com.ManyToMany.entities.Project;
import com.OneToOne.entities.Answer;
import com.OneToOne.entities.Question;
import com.entities.Address;
import com.entities.Certificate;
import com.entities.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {

    @Bean(name = {"address"})
    public Address getAddress(){
        return new Address();
    }

    @Bean(name = {"hibernateUtil"})
    public HibernateUtil getHibernateUtil(){
        return new HibernateUtil();
    }

    @Bean(name = {"student"})
    public Student getStudent(){
        return new Student();
    }

    @Bean(name = {"certificate"})
    public Certificate getCertificate(){
        return new Certificate();
    }

    @Bean(name = {"question"})
    public Question getQuestion(){
        return new Question();
    }

    @Bean(name = {"answer"})
    @Scope("prototype")
    public Answer getAnswer(){
        return new Answer();
    }

    @Bean(name = {"employee"})
    @Scope("prototype")
    public Employee getEmployee(){
        return new Employee();
    }

    @Bean(name = {"project"})
    @Scope("prototype")
    public Project getProject(){
        return new Project();
    }
}
