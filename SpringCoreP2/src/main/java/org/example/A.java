package org.example;

public class A {
    private String surname;
    private B ob;

    public A(String surname, B ob) {
        this.surname = surname;
        this.ob = ob;
    }

    public A() {
        super();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public B getOb() {
        return ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }

    @Override
    public String toString() {
        return "A{" +
                "surname='" + surname + '\'' +
                ", ob=" + ob +
                '}';
    }
}
