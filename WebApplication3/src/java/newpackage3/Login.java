/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import org.jboss.logging.Logger;

/**
 *
 * @author chith
 */
public class Login {
    static Statement st;
    viewBooks();
    public static void main(String[] arg){
    //void connectToDb() throws SQLException {

        String query= "INSERT INTO Books(T,'Java', 'Ritchy')";
        try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,"root","");
            Statement st = con.createStatement();
            st.executeUpdate(query);
            System.out.println("Record inserted");
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println(ex.getMessage());
        }
        void connecToDB(){
        String driver = "com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/librarydb"; 
        try{
            Class.forName(driver);
            Conect
        }
    }
    }    

}
