package com.example.OffDeskProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="registration")
public class Employee {
    @Id
    private int Employee_id;
    private String Name;
    private String Designation;
    private Date Date_of_joining;
    private String gender;

    public Employee() {
    }

    public Employee( String name, String designation, Date date_of_joining, String gender) {

        Name = name;
        Designation = designation;
        Date_of_joining = date_of_joining;
        this.gender = gender;
    }

    public int getEmployee_id() {
        return Employee_id;
    }

    public void setEmployee_id(int employee_id) {
        Employee_id = employee_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public Date getDate_of_joining() {
        return Date_of_joining;
    }

    public void setDate_of_joining(Date date_of_joining) {
        Date_of_joining = date_of_joining;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
