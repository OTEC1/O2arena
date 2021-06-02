/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_connection;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Connection_close {
    
    
    
    public  void Connection_terminate(Connection con){
                try{
                con.close();
                }catch(SQLException ex){System.out.println(ex);}
                }
     
   
}
