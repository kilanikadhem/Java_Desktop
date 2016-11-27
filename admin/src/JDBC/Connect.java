/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kadhem
 */
public class Connect {
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement ps=null;
    
     public static Connection conDB() throws SQLException{
         
        try {         
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pfe","root","");
            return con;
            
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null,ex);
            return null;
        }
       
     
     
     }
}