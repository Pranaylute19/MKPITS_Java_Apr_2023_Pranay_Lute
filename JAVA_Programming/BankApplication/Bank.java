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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class Bank extends HttpServlet {
    static Connection connection ;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String user=request.getParameter("user_id");
            String pass=request.getParameter("Authontication");
            String name=request.getParameter("name");
            String address=request.getParameter("Address");
            String city=request.getParameter("City");
            String mobno=request.getParameter("mobile_number");     
            int converttoint=Integer.parseInt(request.getParameter("Balance"));
            
               // Driver load
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank", "root", "Pranay@123");
                System.out.println("driver added sucessfully");
                
              // record insert
                PreparedStatement preparedStatement = connection.prepareStatement("insert into AccountDetails values(?,?,?,?,?,?,?)");       
             preparedStatement.setString(1,user);
              preparedStatement.setString(2,pass);
                preparedStatement.setString(3,name);
               preparedStatement.setString(4,address);
                preparedStatement.setString(5,city);
                 preparedStatement.setString(6,mobno);
                 preparedStatement.setDouble(7,converttoint);
            
            int returnvalue = preparedStatement.executeUpdate();
                if (returnvalue != 0)
                    System.out.println("Record insert");
                
                else
                    System.out.println("unable to insert record");

            } catch (Exception cls) {
                throw new RuntimeException(cls);
        }
          
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Bank</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>successfully inserted</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
