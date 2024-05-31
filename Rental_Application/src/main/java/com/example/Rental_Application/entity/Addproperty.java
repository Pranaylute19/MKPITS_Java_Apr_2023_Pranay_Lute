package com.example.Rental_Application.entity;

import jakarta.persistence.*;

@Entity
public class Addproperty { // this is for residential
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String property_type; // apartment , independentfloor,villa,indepenent house
    @Column
    private String looking_for; // sale or rent
//    @Column
//    private String property_value;
    @Column
    private String mobile_no;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String bhk;
    @Column
    private String sqfeet;// Builtup Area
    @Column
    private String furnishedtype; // fully furnished, semi furnished, unfurnished
    @Column
    private String monthlyvalue;
    @Column
    private String securityDeposit;

    @Column
    private int sellerid;


    public Addproperty() {

    }

    public Addproperty(Integer id, String property_type, String looking_for, String mobile_no, String name, String address, String bhk, String sqfeet, String furnishedtype, String monthlyvalue, String securityDeposit,int sellerid) {
        this.id = id;
        this.property_type = property_type;
        this.looking_for = looking_for;
        this.mobile_no = mobile_no;
        this.name = name;
        this.address = address;
        this.bhk = bhk;
        this.sqfeet = sqfeet;
        this.furnishedtype = furnishedtype;
        this.monthlyvalue = monthlyvalue;
        this.securityDeposit = securityDeposit;
        this.sellerid=sellerid;

    }

    public int getSellerid() {
        return sellerid;
    }

    public void setSellerid(int sellerid) {
        this.sellerid = sellerid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProperty_type() {
        return property_type;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    public String getLooking_for() {
        return looking_for;
    }

    public void setLooking_for(String looking_for) {
        this.looking_for = looking_for;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
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

    public String getBhk() {
        return bhk;
    }

    public void setBhk(String bhk) {
        this.bhk = bhk;
    }

    public String getSqfeet() {
        return sqfeet;
    }

    public void setSqfeet(String sqfeet) {
        this.sqfeet = sqfeet;
    }

    public String getFurnishedtype() {
        return furnishedtype;
    }

    public void setFurnishedtype(String furnishedtype) {
        this.furnishedtype = furnishedtype;
    }

    public String getMonthlyvalue() {
        return monthlyvalue;
    }

    public void setMonthlyvalue(String monthlyvalue) {
        this.monthlyvalue = monthlyvalue;
    }

    public String getSecurityDeposit() {
        return securityDeposit;
    }

    public void setSecurityDeposit(String securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

}
