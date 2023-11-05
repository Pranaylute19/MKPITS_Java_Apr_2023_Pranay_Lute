package com.example.bankapplicationbyusing_jsp;

import java.sql.Date;

public class Transaction {
    private String userid;
    private Date date;
    private int amount;
    private  String AmountType;

    public Transaction() {
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAmountType() {
        return AmountType;
    }

    public void setAmountType(String amountType) {
        AmountType = amountType;
    }
}
