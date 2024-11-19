package com.springcore.JavaConfig;

import org.springframework.beans.factory.annotation.Value;

public class Course {

    private String Course;


    public Course(String course) {
        Course = course;
    }
    public Course() {
        super();
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Course='" + Course + '\'' +
                '}';
    }
}
