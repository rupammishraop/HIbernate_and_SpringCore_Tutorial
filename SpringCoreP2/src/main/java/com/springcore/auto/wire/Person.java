package com.springcore.auto.wire;

public class Person {
    private Address address;

    public Person(Address address) {
        this.address = address;
        System.out.println("we are constructor of Person Class");
    }

    public Person() {
        super();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "address=" + address +
                '}';
    }
}
