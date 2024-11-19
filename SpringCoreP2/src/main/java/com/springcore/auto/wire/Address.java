package com.springcore.auto.wire;

public class Address {
    private String state;
    private String Bhopal;

    public Address(String state, String bhopal) {
        this.state = state;
        Bhopal = bhopal;
    }

    public Address() {
        super();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBhopal() {
        return Bhopal;
    }

    public void setBhopal(String bhopal) {
        Bhopal = bhopal;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", Bhopal='" + Bhopal + '\'' +
                '}';
    }
}
