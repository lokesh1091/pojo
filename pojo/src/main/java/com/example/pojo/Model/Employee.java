package com.example.pojo.Model;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Employee {
    @Id
    @Column
    private String id;
    @Column
    private String name;
    @Column
    private String designation;
    @Column
    private String location;

    public Employee(String id, String name, String designation, String location) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.location = location;
    }

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
