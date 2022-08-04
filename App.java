public class App {
    //Main class initiates a GUI instance and displays it.
    public static void main(String[] args){
        String dbName = "finalproject_db";
        String port = "3306";
        String userName = "root";
        String password = "PatronWriter951";
        gui GUI = new gui(dbName, port, userName, password);
        GUI.display();
    }
}

/*
// ----------------------------------------------
// Matthew Bentz, Chase Hopkins, James Haberstroh

import java.sql.*;

public class App {
    public static void main(String[] args) {
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            String dbName = "finalproject_db";
            String
                    port = "3306";
            String
                    pwd = "PatronWriter951";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:"
                    + port + "/" + dbName + "?" +
                    "user=root&password=" + pwd);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
            while (rs.next()) {
                int id = rs.getInt("CustomerID");
                String name = rs.getString("LastName");
                String lastname = rs.getString("FirstName");
                String phone = rs.getString("Phone");

                System.out.println("ID: " + id + "\nFirstName: " + name + "\nLastName: " + lastname + "\nPhone: " + phone);
            }
        } catch (SQLException ex) {
            // handle the error
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (Exception e) {
            System.out.println("Unkown Error:" + e.getMessage());
        }
    }
}
*/