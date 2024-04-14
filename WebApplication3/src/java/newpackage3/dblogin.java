package newpackage3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import newpackage3.Prefect;
import newpackage3.User;

public class dblogin {
 // Insert data into student table
    public static void insertUser(String name, String pass, String imgFileName) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/login";
        String query = "INSERT INTO `std`(`uname`, `passwd`, `img`) VALUES (?, ?, ?)";

        try {
            Class.forName(driver);
            try (Connection con = DriverManager.getConnection(url, "root", "");
                 PreparedStatement pst = con.prepareStatement(query)) {
                pst.setString(1, name);
                pst.setString(2, pass);
                pst.setString(3, imgFileName);
                pst.executeUpdate();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dblogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  // Retrieve all prefects from student table
    public static List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/login";
        String query = "SELECT * FROM std";

        try {
            Class.forName(driver);
            try (Connection con = DriverManager.getConnection(url, "root", "");
                 PreparedStatement pst = con.prepareStatement(query);
                 ResultSet rs = pst.executeQuery()) {

                while (rs.next()) {
                    String uname = rs.getString("uname");
                    String passwd = rs.getString("passwd");
                    String imgg = rs.getString("img");

                    User user = new User(uname, passwd, imgg);
                    userList.add(user);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dblogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return userList;
    }
    
    // Insert data into prefect table
    public static void insertPrefect(String uname, String passwd, String imgg) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/login";
        String query = "INSERT INTO `prefect`(`username`, `password`, `img`) VALUES (?, ?, ?)";

        try {
            Class.forName(driver);
            try (Connection con = DriverManager.getConnection(url, "root", "");
                 PreparedStatement pst = con.prepareStatement(query)) {
                pst.setString(1, uname);
                pst.setString(2, passwd);
                pst.setString(3, imgg);
                pst.executeUpdate();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dblogin.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }
        
    // Retrieve all prefects from prefect table
    public static List<Prefect> getAllPrefects() {
        List<Prefect> prefectList = new ArrayList<>();

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/login";
        String query = "SELECT * FROM prefect";

        try {
            Class.forName(driver);
            try (Connection con = DriverManager.getConnection(url, "root", "");
                 PreparedStatement pst = con.prepareStatement(query);
                 ResultSet rs = pst.executeQuery()) {

                while (rs.next()) {
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    String imgFileName = rs.getString("img");

                    Prefect prefect = new Prefect(username, password, imgFileName);
                    prefectList.add(prefect);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dblogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return prefectList;
    }

    // Remove data from prefect table
    public static void removePrefect(String username, String password, String img) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/login";
        String query = "DELETE FROM prefect WHERE username = ? AND password = ? AND img = ?";

        try {
            Class.forName(driver);
            try (Connection con = DriverManager.getConnection(url, "root", "");
                 PreparedStatement pst = con.prepareStatement(query)) {
                pst.setString(1, username);
                pst.setString(2, password);
                pst.setString(3, img);
                pst.executeUpdate();
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dblogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
