package com.example.sma.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentData")
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String course;

    public StudentModel(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public StudentModel() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // to convert o/p into string readable format
    @Override
    public String toString() {
        return "LmsModel{" + " Name= '" + name + '\'' + ", Email='" + email + '\'' +
                ", Course='" + course + '\'' + '}';

    }

}
