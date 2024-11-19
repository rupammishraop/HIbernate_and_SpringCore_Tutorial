package com.spring.jdbc.config;

import com.spring.jdbc.StudentDaoImpL.StudentDoaImpL;
import com.spring.jdbc.entities.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JavaConfig {

    @Bean(name = {"driverManagerDataSource"})
    public DriverManagerDataSource getdriverManagerDataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("Rupam@mysql9301");
        return driverManagerDataSource;
    }

    @Bean(name = {"jdbcTemplate"})
    public JdbcTemplate getjdbcTemplate(){
        return new JdbcTemplate(getdriverManagerDataSource());
    }

    @Bean(name = {"studentDoaImpL"})
    public StudentDoaImpL studentDoaImpL(){
        StudentDoaImpL studentDoaImpL = new StudentDoaImpL();
        studentDoaImpL.setJdbcTemplate(getjdbcTemplate());
        return studentDoaImpL;
    }

    @Bean(name = {"student"})
    public Student getStudent(){
        return new Student();
    }
}
