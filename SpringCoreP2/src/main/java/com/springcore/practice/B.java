package com.springcore.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("b")
public class B {

    @Value("Rupam Mishra")
    private String name;

    public B(){
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
        return "B{" +
                "name='" + name + '\'' +
                '}';
    }
}
