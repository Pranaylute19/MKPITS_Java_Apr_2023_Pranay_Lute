package com.example.CreateApplicationHibernetDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    private int Rollnumber;
    private String name;
    private String Address;
    private String city;

    public Student() {
    }

    public Student(String name, String address, String city) {
        this.name = name;
        this.Address = Address;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + Rollnumber +
                ", name='" + name + '\'' +
                ", address='" + Address + '\'' +
                ", City='" + city + '\'' +
                '}';
    }
}
