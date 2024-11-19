package com.springcore.JavaConfig;

import java.util.List;

public class Student {


    private String name;
    private int id;
    private Course course;
    private List<String> Phones;

    public Student(Course course) {
        this.course = course;
    }

    public Student(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<String> getPhones() {
        return Phones;
    }

    public void setPhones(List<String> phones) {
        Phones = phones;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", course=" + course +
                ", Phones=" + Phones +
                '}';
    }
}