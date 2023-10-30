import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author shubh
 */
public class WelcomeServlet extends HttpServlet {

   
    static Connection connection;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String id = request.getParameter("username");
            String Password = request.getParameter("password");
           
            /* TODO output your page here. You may use following sample code. */
            Class.forName("com.mysql.cj.jdbc.Driver");
//            out.println("Driver loaded");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","Pranay@123");
//            out.println("driver established");
           
            PreparedStatement preparedStatement = connection.prepareStatement("select user_id,Authontication from AccountDetails where user_id=? and Authontication=?");
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, Password);
           
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()){
              HttpSession httpsession=request.getSession(true);
                httpsession.setAttribute("Username",id );
               
            
                RequestDispatcher rd= request.getRequestDispatcher("newhtml.html");
              rd.forward(request, response);
              
           
            }else{
                out.println("Incorrect username and password");
                out.println("<a href='index.html'>Login Again</a>");
            }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException | SQLException ex) {
           out.println(ex);      
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException | SQLException ex) {
           out.println(ex);
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
