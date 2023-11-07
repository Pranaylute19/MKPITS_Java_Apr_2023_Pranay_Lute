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

        import com.example.bankapplicationbyusing_jsp.Transaction;
        import jakarta.servlet.http.HttpSession;

        import java.sql.*;

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
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Custo merDetail values (?,?,?,?,?,?)");
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


    public ResultSet loginAccount(Bank bank) {
        ResultSet resultSet=null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from customerdetail where User_id=? and password=?");
            preparedStatement.setString(1,bank.getUser_id());
            preparedStatement.setString(2,bank.getPassword());

            resultSet=preparedStatement.executeQuery();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return resultSet;
    }
    public int depositmoney(Transaction transaction){
        int returnvalue;
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
        try (PreparedStatement preparedStatement = connection.prepareStatement("Update customerdetail set Ammount=Ammount+? where User_id= ?")) {
                preparedStatement.setInt(1,transaction.getAmount());
                preparedStatement.setString(2,transaction.getUserid());

               int result= preparedStatement.executeUpdate();

            }
         catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return returnvalue;
    }
    public int WitrhdrawnMoney(Transaction transaction){
        int returnvalue;
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
        try (PreparedStatement preparedStatement = connection.prepareStatement("Update customerdetail set Ammount=Ammount++? where User_id= ?")) {
            preparedStatement.setInt(1,transaction.getAmount());
            preparedStatement.setString(2,transaction.getUserid());

            int result= preparedStatement.executeUpdate();

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return returnvalue;


    }
//    public int Transfer(Transaction transaction,String userId){
//        int result=0;
//
//        try {
//            PreparedStatement preparedStatement=connection.prepareStatement("insert into transaction values (?,?,?,?)");
//            preparedStatement.setString(1,transaction.getUserid());
//            preparedStatement.setDate(2,transaction.getDate());
//            preparedStatement.setInt(3,transaction.getAmount());
//            preparedStatement.setString(4,transaction.getAmountType());
//
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//
//            PreparedStatement preparedStatement=connection.prepareStatement("Update customerdetail set Ammount=Ammount-? where User_id= ?");
//            preparedStatement.setInt(1,transaction.getAmount());
//            preparedStatement.setString(2,transaction.getUserid());
//             preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//        try {
//            PreparedStatement preparedStatement=connection.prepareStatement("Update customerdetail set Ammount=Amount+? where User_id=? ");
//            preparedStatement.setString(2,userId) ;
//            preparedStatement.setInt(1,transaction.getAmount());
//
//           result= preparedStatement.executeUpdate();
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//
//        }
//        return result;


        public int transferReduceAmount(Transaction transactions, String userId) {

            int result = 0;
            try {
                PreparedStatement preparedStatement = connection.prepareStatement("insert into transaction values(?,?,?,?)");
                preparedStatement.setString(1, transactions.getUserid());
                preparedStatement.setDate(2, transactions.getDate());
                preparedStatement.setInt(3, transactions.getAmount());
                preparedStatement.setString(4, transactions.getAmountType());
                result = preparedStatement.executeUpdate();

            } catch (Exception e) {
                System.out.println(e);
            }
            if (result != 0) {
                try {
                    PreparedStatement preparedUpdateStatement = connection.prepareStatement("update customerdetail set Ammount = Ammount - ? where User_id=?");
                    preparedUpdateStatement.setInt(1, transactions.getAmount());
                    preparedUpdateStatement.setString(2, transactions.getUserid());
                    result = preparedUpdateStatement.executeUpdate();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            if (result != 0)
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement("insert into transaction values(?,?,?,?)");
                    preparedStatement.setString(1, transactions.getUserid());
                    preparedStatement.setDate(2, transactions.getDate());
                    preparedStatement.setInt(3, transactions.getAmount());
                    preparedStatement.setString(4, "Out");
                    result = preparedStatement.executeUpdate();

                } catch (Exception e) {
                    System.out.println(e);
                }


            if(result!=0){
                try{
                    PreparedStatement preparedUpdateStatement1 = connection.prepareStatement("update customerdetail set Ammount = Ammount + ? where User_id=?");
                    preparedUpdateStatement1.setInt(1,transactions.getAmount());
                    preparedUpdateStatement1.setString(2,userId);
                    result = preparedUpdateStatement1.executeUpdate();

                }catch (Exception e){
                    System.out.println(e);
                }
            }
            return result;
        }

    }
