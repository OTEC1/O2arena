/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class ConnectDb {
    
    
  private  Connection con;

    
    public Connection getConnection(){
        
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
           
            con= DriverManager.getConnection(Hash.URL,  Hash.USER,  Hash.PASS);
        
         } catch (SQLException ex) {
            Logger.getLogger(ConnectDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
            return  con;
    }
}
