package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class B {

//    @Value("Honey")
    private static String name;

    public String getName() {
        return name;
    }

    @Value("Honey")
    public void setName(String name) {
        B.name = name;
    }

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                '}';
    }
}
