package com.example.DemoApplication.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;



public class Student {
    private int rollnumber;
    private String Name;
    private String address;
    private String city;

    public Student() {
    }

    public Student(int rollnumber, String name, String address, String city) {
        this.rollnumber = rollnumber;
        Name = name;
        this.address = address;
        this.city = city;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
