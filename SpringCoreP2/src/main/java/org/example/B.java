package org.example;

public class B {

    private String name;

    public B(String name) {
        this.name = name;
    }

    public B() {
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
