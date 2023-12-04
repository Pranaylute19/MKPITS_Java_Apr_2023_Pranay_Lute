package com.example.SpringDataJPA_Application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "studentdetail")
public class Student {
    @Id
    private int roll_no;
    private String stud_name;
    private String stud_address;
    private  String city;

    public Student() {
    }

    public Student(int roll_no, String stud_name, String stud_address, String city) {
        this.roll_no = roll_no;
        this.stud_name = stud_name;
        this.stud_address = stud_address;
        this.city = city;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getStud_name() {
        return stud_name;
    }

    public void setStud_name(String stud_name) {
        this.stud_name = stud_name;
    }

    public String getStud_address() {
        return stud_address;
    }

    public void setStud_address(String stud_address) {
        this.stud_address = stud_address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
