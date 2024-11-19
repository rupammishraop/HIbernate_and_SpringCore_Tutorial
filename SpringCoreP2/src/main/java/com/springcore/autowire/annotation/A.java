package com.springcore.autowire.annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class A {
    @Autowired
    @Qualifier("temp2")
    private B b;

    public A(){
        super();
    }

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                '}';
    }

//    @Autowired
    public A(B b2) {
        System.out.println("inside constructor");
        this.b = b2;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        System.out.println("We are in setter method");
        this.b = b;
    }
}
