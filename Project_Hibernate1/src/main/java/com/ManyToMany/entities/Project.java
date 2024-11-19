package com.ManyToMany.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Project {
    @Id
    private int p_id;
    private String projectName;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Project(int p_id, String projectName, List<Employee> employees) {
        this.p_id = p_id;
        this.projectName = projectName;
        this.employees = employees;
    }

    public Project() {
        super();
    }

    @Override
    public String toString() {
        return "Project{" +
                "p_id=" + p_id +
                ", projectName='" + projectName + '\'' +
                ", employees=" + employees +
                '}';
    }
}
