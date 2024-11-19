package com.springcore.lifecycle;

public class Bottle {
    private String bottleName;
    private double bottlePrice;

    public Bottle(String bottleName, double bottlePrice) {
        this.bottleName = bottleName;
        this.bottlePrice = bottlePrice;
    }

    public Bottle() {
        super();
    }

    public String getBottleName() {
        return bottleName;
    }

    public void setBottleName(String bottleName) {
        System.out.println("We are in setter Method");
        this.bottleName = bottleName;
    }

    public double getBottlePrice() {
        return bottlePrice;
    }

    public void setBottlePrice(double bottlePrice) {
        this.bottlePrice = bottlePrice;
    }

    public void start() {
        System.out.println("we are inside init method");
    }

    public void bye(){
        System.out.println("we are inside destroy method");
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "bottleName='" + bottleName + '\'' +
                ", bottlePrice=" + bottlePrice +
                '}';
    }
}
