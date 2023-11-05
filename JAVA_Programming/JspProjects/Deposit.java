package com.example.bankapplicationbyusing_jsp.Deposit;

import com.example.bankapplicationbyusing_jsp.Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deposit {
    Connection connection;
    public Deposit() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankJSP", "root", "Pranay@123");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int depositmoney(Transaction transaction){
        int returnvalue=0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into transaction values (?,?,?,?)");
            preparedStatement.setString(1,transaction.getUserid());
            preparedStatement.setDate(2,transaction.getDate());
            preparedStatement.setInt(3,transaction.getAmount());
            preparedStatement.setString(4,transaction.getAmountType());

            returnvalue=  preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return returnvalue;
    }
}
