/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projekt;

/**
 *
 * @author M
 */
public class Authentication {
 
    public static boolean authenticate(String username, String password) {
        // na razie na sztywno, potem bedzie sie bawic z prawdziwym zalogowaniem do bazy
        
        if (username.equals("admin1") && password.equals("admin1")) {
            return true;
        }
        return false;
    }
}
