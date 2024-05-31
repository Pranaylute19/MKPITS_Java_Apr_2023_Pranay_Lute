package com.example.Rental_Application.entity;

import jakarta.persistence.*;


@Entity
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String nationality;
    @Column
    private String userid;
    @Column
    private String password;



    public Seller() {
    }

    public Seller(Integer id, String name, String address, String city, String nationality, String userid, String password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.nationality = nationality;
        this.userid = userid;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

