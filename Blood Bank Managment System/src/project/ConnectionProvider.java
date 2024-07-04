/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author Ayodya Thathsarani
 */
public class ConnectionProvider {
      public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adddonor", "root", "root");
            //Databse name=adddonor
            //sql user name password are respectively = roo, root
            return con;
        } catch (Exception e) {
            e.printStackTrace();  // This will print the error to the console
            return null;
        }
    }
   
    
    
}
