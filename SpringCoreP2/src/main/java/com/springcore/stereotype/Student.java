package com.springcore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Component("studentob")
public class Student {
    @Value("Rupam Mishra")
    private String studentName;
    @Value("Bhopal")
    private String city;

    @Value("#{phones}") // this is spring expression language
    private List<String> phones;

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Student (){
        super();
    }

    @PostConstruct
    public void init(){
        System.out.println("We are in init Method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("we are in destroy method");
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
