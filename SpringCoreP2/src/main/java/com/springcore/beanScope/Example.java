package com.springcore.beanScope;

import org.springframework.stereotype.Component;


public class Example {

    private String name;

    public Example(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Example{" +
                "name='" + name + '\'' +
                '}';
    }
}
