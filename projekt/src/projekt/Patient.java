/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JCheckBox;

/**
 *
 * @author p
 */
public class Patient {

    /////elementy składowe klasy

    private String imie;
    private String nazwisko;
    private String miejsce_zdarzenia;
    private String otwieranie_oczu;
    private String reakcja_slowna;
    private Calendar data_ur;
    private String pesel;
    private String miasto;
    private String obr_anat_1;

    public Patient create(String imie, String nazwisko, String miasto, String miejsce_zdarzenia, String otwieranie_oczu, String reakcja_slowna, Calendar data_ur, String pesel, String obr_anat_1) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.miejsce_zdarzenia = miejsce_zdarzenia;
        this.otwieranie_oczu = otwieranie_oczu;
        this.reakcja_slowna = reakcja_slowna;
        this.data_ur = data_ur;
        this.pesel = pesel;
        this.obr_anat_1 = obr_anat_1;
        return this;
    }

    public String add() {
        String bdata = this.data_ur.get(this.data_ur.YEAR) + "-" + (this.data_ur.get(this.data_ur.MONTH) + 1) + "-" + this.data_ur.get(this.data_ur.DATE);
        String sql = "INSERT INTO `pacients`(`fname`,`lname`,`bdate`,`address_city`,`place`,`pesel`,`o_oczu`,`r_slowna`,`obr_anat_1`) values ('" + this.imie + "','" + this.nazwisko + "','" + bdata + "','" + this.miasto + "','" + this.miejsce_zdarzenia + "','" + this.pesel + "','" + this.otwieranie_oczu + "','" + this.reakcja_slowna + "','" + this.obr_anat_1 + "');";
        return sql;
    }

    public static String wyszukaj(javax.swing.ButtonGroup group) {
        ButtonModel butmod = group.getSelection();
        String wybor = new String();
        if (butmod != null) {
            Enumeration<AbstractButton> ab = group.getElements();
            JCheckBox box = null;
            while (ab.hasMoreElements()) {
                box = (JCheckBox) ab.nextElement();
                if (box.isSelected()) {
                    break;
                }

            }
            wybor = box.getText();
        }
        return wybor;
    }

    public static String wyszukaj2(ArrayList<JCheckBox> list){
        String wybor = new String();
        for (JCheckBox checkbox : list) {
            if (checkbox.isSelected()) {
                wybor += checkbox.getText() + ", ";
                checkbox.setSelected(false);
            }
        }
        return wybor;
    }
    
    public static void zaznacz(String name, ButtonGroup group) {
        
        Enumeration<AbstractButton> ab = group.getElements();
        JCheckBox box = null;
        while (ab.hasMoreElements()) {
            box = (JCheckBox) ab.nextElement();
            if (box.getText().equals(name)) {
                box.setSelected(Boolean.TRUE);
//                        System.out.println("did it");
                break;
            } else {
                box.setSelected(Boolean.FALSE);
//                        System.out.println(i);
//                        i++;
            }
        }

    }
    
    public static void zaznacz2(ArrayList<JCheckBox> buttons, String[] lista){
                    for (JCheckBox checkbox : buttons) {
                        for (String lista1 : lista) {
                            if (checkbox.getText().equals(lista1)) {
                                checkbox.setSelected(true);
                            }
                        }                
                }    
    }
    
    public static void wyczysc(String name, ButtonGroup group) {
        Enumeration<AbstractButton> ab = group.getElements();
        JCheckBox box = new JCheckBox();
        while (ab.hasMoreElements()) {
            box = (JCheckBox) ab.nextElement();
            if (box.getText().equals(name)) {
                box.setSelected(false);
//                        System.out.println("did it");
                break;
            }
        }
    }

    ///////////////////setery i getery
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getObr_anat_1(){
        return obr_anat_1;
    }
    
    public void setObr_Anat__1(String obr_anat_1){
        this.obr_anat_1 = obr_anat_1;
    }
    
    public String getMiasto(){
        return miasto;
    }
    
    public void setMiasto(String miasto){
        this.miasto = miasto;
    }
    
    public String getMiejsce_zdarzenia() {
        return miejsce_zdarzenia;
    }

    public void setMiejsce_zdarzenia(String miejsce_zdarzenia) {
        this.miejsce_zdarzenia = miejsce_zdarzenia;
    }

    public String getOtwieranie_oczu() {
        return otwieranie_oczu;
    }

    public void setOtwieranie_oczu(String otwieranie_oczu) {
        this.otwieranie_oczu = otwieranie_oczu;
    }

    public String getReakcja_slowna() {
        return reakcja_slowna;
    }

    public void setReakcja_slowna(String reakcja_slowna) {
        this.reakcja_slowna = reakcja_slowna;
    }

    public Calendar getData_ur() {
        return data_ur;
    }

    public void setData_ur(Calendar data_ur) {
        this.data_ur = data_ur;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

}
