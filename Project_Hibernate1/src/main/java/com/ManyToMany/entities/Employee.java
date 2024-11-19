package com.ManyToMany.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {
    @Id
    private int emp_id;
    private String employeeName;

    @ManyToMany
    @JoinTable(
            name = "emp_belongs_project",
            joinColumns = {@JoinColumn(name = "e_id")},
            inverseJoinColumns = {@JoinColumn(name = "p_id")}
    )
    private List<Project> projects ;

    public Employee(int emp_id, String employeeName, List<Project> projects) {
        this.emp_id = emp_id;
        this.employeeName = employeeName;
        this.projects = projects;
    }

    public Employee() {
        super();
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", employeeName='" + employeeName + '\'' +
                ", projects=" + projects +
                '}';
    }
}
