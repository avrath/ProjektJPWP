/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import java.util.Vector;
import java.util.AbstractCollection;
import java.util.AbstractList;
import javax.swing.ButtonGroup;

/**
 *
 * @author p
 */
public class WisSelected {
    public static Connection conn(){
        Connection con = null;
        try {
                String host = "jdbc:mysql://mysql.agh.edu.pl:3306/sevik";
                String uName = "sevik";
                String uPass = "s919o7ER";
                con = DriverManager.getConnection(host, uName, uPass);
                
        }catch(SQLException err){
            System.out.println("We have occured an error: " + err);
        }
        if (con!=null)
            return con;
        else
            return null;
    }
    /*public static void choice(javax.swing.ButtonGroup[] baza,int k){
        Enumeration<AbstractButton> but = null;
        switch (k){
            case 1: but = baza[1].getElements();
                break;
            case 2: but = baza[2].getElements();
                break;
            case 3: but = baza[3].getElements();
                break;
            default: System.out.println("Blad");
                break;
        }
                //Enumeration<AbstractButton> ab = buttonGroup2.getElements();
                JCheckBox box = null;
                while (but.hasMoreElements()) {
                    box = (JCheckBox) but.nextElement();
                    if (Integer.parseInt(box.getName()) == place) {
                        box.setSelected(Boolean.TRUE);
                        break;
                    }
                }
    }*/
    public static void choice(){

    }
}
