package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Samosha implements InitializingBean, DisposableBean {
    private double price;

    public Samosha() {
        super();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Samosha{" +
                "price=" + price +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Samosha : We are in destroy Method ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(" Samosha : We are in init method");
    }
}
