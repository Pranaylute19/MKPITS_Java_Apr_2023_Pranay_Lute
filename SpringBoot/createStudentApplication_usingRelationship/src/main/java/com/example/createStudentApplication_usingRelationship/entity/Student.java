package com.example.createStudentApplication_usingRelationship.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "Student_info")
public class Student {
    @Id
    private int rollnumber;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    public Student() {
    }

    public Student(int rollnumber,String name, Address address) {
        this.rollnumber=rollnumber;
        this.name = name;
        this.address = address;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}

