import java.sql.*;

public class Database {
    static Connection connection;

    public static void dbCon() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Pranay@123");
            System.out.println("driver added sucessfully");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void displayData() {
        try {
            dbCon();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * from hospitaldetail");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertData(String name, String hospitalname, String area) {

        try {
            dbCon();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into hospitaldetail values (?, ?, ?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, hospitalname);
            preparedStatement.setString(3, area);

            int returnvalue = preparedStatement.executeUpdate();
            if (returnvalue != 0)
                System.out.println("Record insert");
            else
                System.out.println("unable to insert record");


        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }
}
