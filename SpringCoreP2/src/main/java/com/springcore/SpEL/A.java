package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class A {

//    @Value("#{b}")
//    private B b;

    @Value("#{ 22 + 42}")
    private int x;

    @Value("#{ T(java.lang.Math).PI}")
    private double PI;

    @Value("#{ T(java.lang.Math).sqrt(144) }")
    private int sqrt;

    @Value("#{b.getName()}")
    private String name;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", PI=" + PI +
                ", sqrt=" + sqrt +
                ", name='" + name + '\'' +
                '}';
    }
}
