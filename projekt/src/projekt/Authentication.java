/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projekt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author M
 */
public class Authentication {
 
    private final String password, username;
    private Connection con = null;

    
    public Authentication(String username, String password){
        this.password = password;
        this.username = username;
        con = WisSelected.conn();
        try{
            Statement stmt = con.createStatement();
            String sql = "select * from login where login='"+username+"' and pass='"+password+"';";
            ResultSet rs = stmt.executeQuery(sql);
            if(!rs.isBeforeFirst()){
                //System.out.println("no data");
                con=null;
            }
            
            
        }catch(SQLException err){
            System.out.println(err.getMessage());
         
        }
        /*
        //Connection con = null;
        try {
                String host = "jdbc:mysql://mysql.agh.edu.pl:3306/sevik";
                //String host = "jdbc:mysql://localhost:3306/sevik";
                //String uName = "sevik";
                //String uPass = "s919o7ER";
                
                con = DriverManager.getConnection(host, username, password);
                
        }catch(SQLException err){
            System.out.println("An error occured: " + err);
        }
                */
    }
    /*
    public static Connection connect(String username, String password){
        Connection con = null;
        try {
                String host = "jdbc:mysql://mysql.agh.edu.pl:3306/sevik";
                //String host = "jdbc:mysql://localhost:3306/sevik";
                //String uName = "sevik";
                //String uPass = "s919o7ER";
                
                con = DriverManager.getConnection(host, username, password);
                
        }catch(SQLException err){
            System.out.println("An error occured: " + err);
        }
        if (con!=null)
            return con;
        else
            return null;
    }
    */
    
    public boolean authenticate() {
        
        if (con!=null) {
            return true;
        }
        return false;
    }
    
    public Connection getCon() {
        return con;
    }
    
}
