package com.entities;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int studentId;
    @Column(name = "STUDENT_NAME",length = 100)
    private String studentName;
    private Certificate certificate;

    public Student(int studentId, String studentName, Certificate certificate) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.certificate = certificate;
    }

    public Student() {
        super();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", certificate=" + certificate +
                '}';
    }
}
