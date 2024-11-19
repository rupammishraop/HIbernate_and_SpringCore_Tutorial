package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleByAnnotation {

    private String name;

    public LifeCycleByAnnotation() {
        super();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        System.out.println("we are in init by Annonation");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("we are in destroy by Annonation");
    }


    @Override
    public String toString() {
        return "LifeCycleByAnnotation{" +
                "name='" + name + '\'' +
                '}';
    }
}
