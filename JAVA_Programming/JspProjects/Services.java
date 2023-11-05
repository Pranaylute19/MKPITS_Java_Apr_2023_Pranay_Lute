//package com.example.bankapplicationbyusing_jsp;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class Services {
//    Connection connection;
//    public Services()  {
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/BankJSP","root","Pranay@123");
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//        public int insertdata(Bank bank) {
//        int returnvalue=0;
//
//            try {
//                PreparedStatement preparedStatement = connection.prepareStatement("insert into CustomerDetail values (?,?,?,?,?,?)");
//                preparedStatement.setString(1, bank.getUser_id());
//                preparedStatement.setString(2, bank.getPassword());
//                preparedStatement.setString(3, bank.getName());
//                preparedStatement.setString(4, bank.getAddress());
//                preparedStatement.setString(5, bank.getCity());
//                preparedStatement.setDouble(6, bank.getAmount());
//
//                returnvalue = preparedStatement.executeUpdate();
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//            return returnvalue;
//    }
//
//}


package com.example.bankapplicationbyusing_jsp.AccountCreation;

        import com.example.bankapplicationbyusing_jsp.AccountCreation.Bank;

        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.PreparedStatement;
        import java.sql.SQLException;

public class Services {
    Connection connection;

    public Services() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankJSP", "root", "Pranay@123");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int insertdata(Bank bank) {
        int returnvalue = 0;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into CustomerDetail values (?,?,?,?,?,?)");
            preparedStatement.setString(1, bank.getUser_id());
            preparedStatement.setString(2, bank.getPassword());
            preparedStatement.setString(3, bank.getName());
            preparedStatement.setString(4, bank.getAddress());
            preparedStatement.setString(5, bank.getCity());
            preparedStatement.setDouble(6, bank.getAmount());

            returnvalue = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return returnvalue;
    }
}

