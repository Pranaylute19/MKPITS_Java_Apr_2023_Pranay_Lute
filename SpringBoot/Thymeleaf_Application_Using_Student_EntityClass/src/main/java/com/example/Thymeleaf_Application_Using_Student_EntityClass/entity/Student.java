package com.example.Thymeleaf_Application_Using_Student_EntityClass.entity;


public class Student {

    private int roll_no;
    private String stud_name;
    private  String stud_address;
    private String city;
    private String gender;

    private String language;

    public Student() {
    }

    public Student(int roll_no, String stud_name, String stud_address, String city, String gender, String language) {
        this.roll_no = roll_no;
        this.stud_name = stud_name;
        this.stud_address = stud_address;
        this.city = city;
        this.gender = gender;
        this.language = language;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}


