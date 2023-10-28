/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import static Deposit.connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class DepositMoneys extends HttpServlet {
           static Connection connection;
           
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int Deposit = Integer.parseInt(request.getParameter("amount"));
            String transactionType = "Deposit";  
            HttpSession httpSession = request.getSession(true);
            String userID = httpSession.getAttribute("Username").toString();
            Date date = new java.sql.Date(httpSession.getCreationTime());
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            out.println("Driver loaded");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "Pranay@123");
            out.println("connection established");
           
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Transactions values(?,?,?,?)");
            preparedStatement.setString(1, userID);
            preparedStatement.setDate(2,date);
            preparedStatement.setInt(3,Deposit);
            preparedStatement.setString(4, transactionType);
          
            int resultSet = preparedStatement.executeUpdate();
          
            if(resultSet!= 0){
                out.println("<h2>Amount inserted successfully</h2>");
            }else{
                out.println("<h2>unable to insert amount</h2>");
            }
           
            PreparedStatement preparedUpdateStatement = connection.prepareStatement("update AccountDetails set Balance=Balance+? where user_id=?");
            preparedUpdateStatement.setString(2, userID);
            preparedUpdateStatement.setInt(1, Deposit);
            int updateResultSet = preparedUpdateStatement.executeUpdate();
            if(updateResultSet != 0){
                out.println("<h2>Balance updated</h2>");
            }else{
                out.println("<h2>Unable to update Balance</h2>");
            }
           
        }
    }
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                try {
                    processRequest(request, response);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(DepositMoneys.class.getName()).log(Level.SEVERE, null, ex);
                }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                try {
                    processRequest(request, response);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(DepositMoneys.class.getName()).log(Level.SEVERE, null, ex);
                }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
