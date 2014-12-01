/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author p
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            String host = "jdbc:mysql://mysql.agh.edu.pl:3306/sevik";
            String uName = "sevik";
            String uPass = "s919o7ER";
            Connection con = DriverManager.getConnection(host, uName, uPass);
            System.out.println("Udało się!");
            Statement stmt = con.createStatement();
//            String sql3 = "alter table pacjenci "
//            String sql = "insert into pacjenci(imie,nazwisko,telefon,data_urodzenia) values('Fryderyk','Chopin','012123456789','22.02.1810')";
//            boolean ab;
//            ab=stmt.execute(sql);
//            String sql4 = "delete from pacjenci where imie='Fryderyk' and telefon=12123456789";
//            stmt.execute(sql4);

            String sql2 = "select * from pacjenci";
            ResultSet rs = stmt.executeQuery(sql2);

            while (rs.next()) {
                String imie = rs.getString("imie");
                String nazwisko = rs.getString("nazwisko");
                String telefon = rs.getString("telefon");
                String birthday = rs.getString("data_urodzenia");
                String p = imie + " " + nazwisko + " " + telefon + " " + birthday;
                System.out.println(p);
            }

        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }

    }
}
