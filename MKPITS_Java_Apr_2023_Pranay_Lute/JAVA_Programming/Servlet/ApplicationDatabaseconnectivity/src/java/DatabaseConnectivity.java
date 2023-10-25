/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class DatabaseConnectivity extends HttpServlet {

    static Connection connection;
   
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
      
       
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            String rno=request.getParameter("Rollnumber");
             String name=request.getParameter("StudentName");
              String address=request.getParameter("Address");
               String state=request.getParameter("City");
               
//               Driver loade
            
                try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Pranay@123");
                System.out.println("driver added sucessfully");
                
//                record insert


                PreparedStatement preparedStatement = connection.prepareStatement("insert into studentDetails values (?,?,?,?)");       
                 preparedStatement.setString(1,rno);
                preparedStatement.setString(2,name);
                preparedStatement.setString(3,address);
                preparedStatement.setString(4,state);
            
            int returnvalue = preparedStatement.executeUpdate();
                if (returnvalue != 0)
                    System.out.println("Record insert");
                else
                    System.out.println("unable to insert record");

            } catch (Exception cls) {
                throw new RuntimeException(cls);
            } 
         
        }
         
    }
}
