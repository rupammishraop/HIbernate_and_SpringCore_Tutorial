package springConfig;

import hibernateUtilConfig.HibernateUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import userNote.entities.Notes;
import userNote.entities.User;

@Configuration
public class SpringConfig {


    @Bean(name = {"user"})
    public User getUser(){
        return  new User();
    }

    @Bean(name = {"notes"})
    @Scope("prototype")
    public Notes getNotes(){
        return new Notes();
    }

    @Bean("hibernateUtil")
    public HibernateUtil getHibernateUtil(){
        return new HibernateUtil();
    }

}
