/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_connection;


import org.springframework.security.crypto.bcrypt.*;

public class Auth02 {
    
    
public  String encryt(String pass) {
        return(BCrypt.hashpw(pass, BCrypt.gensalt(12)));

}

public  boolean decryt(String plan, String hashed) {	
        return  (BCrypt.checkpw(plan, hashed));

}
		    
	
		

	
}

