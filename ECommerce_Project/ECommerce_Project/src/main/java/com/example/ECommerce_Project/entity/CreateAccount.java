package com.example.ECommerce_Project.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CreateAccount")
public class CreateAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idnumber;

    private String Firstname;
    private int phonenumber;
    private String email;
    private String Userid;
    private String password;

    public CreateAccount() {
    }

    public CreateAccount(String firstname, int phonenumber, String email, String userid, String password) {
        Firstname = firstname;
        this.phonenumber = phonenumber;
        this.email = email;
        Userid = userid;
        this.password = password;
    }

    public int getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(int idnumber) {
        this.idnumber = idnumber;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserid() {
        return Userid;
    }

    public void setUserid(String userid) {
        Userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
