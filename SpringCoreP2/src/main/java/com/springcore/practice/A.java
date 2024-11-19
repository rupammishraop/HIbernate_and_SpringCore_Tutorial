package com.springcore.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("a")
public class A {

    @Autowired
    @Qualifier("b")
    private B b;

    @Value("#{Phones}")
    private List<String> phones;

    public A(){
        super();
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                ", phones=" + phones +
                '}';
    }
}
