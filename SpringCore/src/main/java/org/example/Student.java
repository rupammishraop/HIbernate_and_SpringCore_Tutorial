package org.example;

public class Student {
     private int studentId;
     private String studentName;
     private String city;

    public Student(int studentId, String studentName, String city) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.city = city;
    }

    public Student() {
        super();

    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
