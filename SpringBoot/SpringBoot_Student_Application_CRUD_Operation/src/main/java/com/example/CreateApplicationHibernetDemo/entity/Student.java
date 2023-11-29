package com.example.CreateApplicationHibernetDemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentdetail")
public class Student {
    @Id
    private int roll_no;
    private String stud_name;
    private String stud_address;
    private String city;

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setStud_name(String stud_name) {
        this.stud_name = stud_name;
    }

    public void setStud_address(String stud_address) {
        this.stud_address = stud_address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student() {
    }

    public Student(String stud_name, String stud_address, String city) {
        this.stud_name = stud_name;
        this.stud_address = stud_address;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RollNo='" + roll_no + '\'' +
                ", stud_name='" + stud_name + '\'' +
                ", stud_address='" + stud_address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
