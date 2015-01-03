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
    private Calendar data_ur;
    private String pesel;
    private String miasto;
    private String miejsce_zdarzenia;
    private String otwieranie_oczu;
    private String reakcja_slowna;
    private String decyzja;
    private String r_ruchowa;
    private String cz_oddech;
    private String rr_skurcz;
    private String gcs;
    private String dusznosc;
    private String sinica;
    private String bezdech;
    private String szmer;
    private String furczenie;
    private String swisty;
    private String rzezenie;
    private String brak_szmeru;
    private String inne;
    private String reakcja_1;
    private String reakcja_2;
    private String reakcja_3;
    private String szer_1;
    private String szer_2;
    private String szer_3;
    private String tetno;
    private String wyglad;
    private String wilgotnosc;
    private String temp;
    private String brzuch;
    private String ocena_psych;
    private String tony_serca;
    private String zapach;
    private String niedowlad;
    private String konczyna_g;
    private String konczyna_d;
    private String ekg;
    private String czynnosci;
    private String obr_anatomiczne;
    

    public Patient create(String imie, String nazwisko, Calendar data_ur, String pesel, String miasto, String miejsce_zdarzenia, String otwieranie_oczu, String reakcja_slowna, String decyzja, String r_ruchowa, String cz_oddech, String rr_skurcz, String gcs, String dusznosc, String sinica, String bezdech, String szmer, String furczenie, String swisty, String rzezenie, String brak_szmeru, String inne, String reakcja_1, String reakcja_2, String reakcja_3, String szer_1, String szer_2, String szer_3, String tetno, String wyglad, String wilgotnosc, String temp, String brzuch, String ocena_psych, String tony_serca, String zapach, String niedowlad, String konczyna_g, String konczyna_d, String ekg, String czynnosci, String obr_anatomiczne) {
        this.imie = imie;
        this.nazwisko = nazwisko;        
        this.data_ur = data_ur;
        this.pesel = pesel;
        this.miasto = miasto;
        this.miejsce_zdarzenia = miejsce_zdarzenia;
        this.otwieranie_oczu = otwieranie_oczu;
        this.reakcja_slowna = reakcja_slowna;
        this.decyzja = decyzja;
        this.r_ruchowa = r_ruchowa;
        this.cz_oddech = cz_oddech;
        this.rr_skurcz = rr_skurcz;
        this.gcs = gcs;
        this.dusznosc = dusznosc;
        this.sinica = sinica;
        this.bezdech = bezdech;
        this.szmer = szmer;
        this.furczenie = furczenie;
        this.swisty = swisty;
        this.rzezenie = rzezenie;
        this.brak_szmeru = brak_szmeru;
        this.inne = inne;
        this.reakcja_1 = reakcja_1;
        this.reakcja_2 = reakcja_2;
        this.reakcja_3 = reakcja_3;
        this.szer_1 = szer_1;
        this.szer_2 = szer_2;
        this.szer_3 = szer_3;
        this.tetno = tetno;
        this.wyglad = wyglad;
        this.wilgotnosc = wilgotnosc;
        this.temp = temp;
        this.brzuch = brzuch;
        this.ocena_psych = ocena_psych;
        this.tony_serca = tony_serca;
        this.zapach = zapach;
        this.niedowlad = niedowlad;
        this.konczyna_g = konczyna_g;
        this.konczyna_d = konczyna_d;
        this.ekg = ekg;
        this.czynnosci = czynnosci;
        this.obr_anatomiczne = obr_anatomiczne;
        return this;
    }

    public String add() {
        String bdata = this.data_ur.get(this.data_ur.YEAR) + "-" + (this.data_ur.get(this.data_ur.MONTH) + 1) + "-" + this.data_ur.get(this.data_ur.DATE);
        String sql = "INSERT INTO `pacients`(`fname`,`lname`,`bdate`,`address_city`,`place`,`pesel`,`o_oczu`,`r_slowna`,`obr_anat`) values ('" + this.imie + "','" + this.nazwisko + "','" + bdata + "','" + this.miasto + "','" + this.miejsce_zdarzenia + "','" + this.pesel + "','" + this.otwieranie_oczu + "','" + this.reakcja_slowna + "','" + this.obr_anatomiczne + "');";
        return sql;
    }

    public static String wyszukaj(ButtonGroup group) {
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

    public static String wyszukaj2(ArrayList<JCheckBox> list) {
        String wybor = new String();
        for (JCheckBox checkbox : list) {
            if (checkbox.isSelected()) {
                wybor += checkbox.getText() + ";";
                //checkbox.setSelected(false);
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
                box.setSelected(true);
//                        System.out.println("did it");
                break;
            } else {
                box.setSelected(false);
//                        System.out.println(i);
//                        i++;
            }
        }

    }

    public static void zaznacz2(ArrayList<JCheckBox> buttons, String list) {
        String[] lista = list.split(";");
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

    public String getObr_anatomiczne() {
        return obr_anatomiczne;
    }

    public void setObr_Anatomiczne(String obr_anatomiczne) {
        this.obr_anatomiczne = obr_anatomiczne;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
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

    public String getDecyzja() {
        return decyzja;
    }

    public void setDecyzja(String decyzja) {
        this.decyzja = decyzja;
    }

    public String getR_ruchowa() {
        return r_ruchowa;
    }

    public void setR_ruchowa(String r_ruchowa) {
        this.r_ruchowa = r_ruchowa;
    }

    public String getCz_oddech() {
        return cz_oddech;
    }

    public void setCz_oddech(String cz_oddech) {
        this.cz_oddech = cz_oddech;
    }

    public String getRr_skurcz() {
        return rr_skurcz;
    }

    public void setRr_skurcz(String rr_skurcz) {
        this.rr_skurcz = rr_skurcz;
    }

    public String getGcs() {
        return gcs;
    }

    public void setGcs(String gcs) {
        this.gcs = gcs;
    }

    public String getDusznosc() {
        return dusznosc;
    }

    public void setDusznosc(String dusznosc) {
        this.dusznosc = dusznosc;
    }

    public String getSinica() {
        return sinica;
    }

    public void setSinica(String sinica) {
        this.sinica = sinica;
    }

    public String getBezdech() {
        return bezdech;
    }

    public void setBezdech(String bezdech) {
        this.bezdech = bezdech;
    }

    public String getSzmer() {
        return szmer;
    }

    public void setSzmer(String szmer) {
        this.szmer = szmer;
    }

    public String getFurczenie() {
        return furczenie;
    }

    public void setFurczenie(String furczenie) {
        this.furczenie = furczenie;
    }

    public String getSwisty() {
        return swisty;
    }

    public void setSwisty(String swisty) {
        this.swisty = swisty;
    }

    public String getRzezenie() {
        return rzezenie;
    }

    public void setRzezenie(String rzezenie) {
        this.rzezenie = rzezenie;
    }

    public String getBrak_szmeru() {
        return brak_szmeru;
    }

    public void setBrak_szmeru(String brak_szmeru) {
        this.brak_szmeru = brak_szmeru;
    }

    public String getInne() {
        return inne;
    }

    public void setInne(String inne) {
        this.inne = inne;
    }

    public String getReakcja_1() {
        return reakcja_1;
    }

    public void setReakcja_1(String reakcja_1) {
        this.reakcja_1 = reakcja_1;
    }

    public String getReakcja_2() {
        return reakcja_2;
    }

    public void setReakcja_2(String reakcja_2) {
        this.reakcja_2 = reakcja_2;
    }

    public String getReakcja_3() {
        return reakcja_3;
    }

    public void setReakcja_3(String reakcja_3) {
        this.reakcja_3 = reakcja_3;
    }

    public String getSzer_1() {
        return szer_1;
    }

    public void setSzer_1(String szer_1) {
        this.szer_1 = szer_1;
    }

    public String getSzer_2() {
        return szer_2;
    }

    public void setSzer_2(String szer_2) {
        this.szer_2 = szer_2;
    }

    public String getSzer_3() {
        return szer_3;
    }

    public void setSzer_3(String szer_3) {
        this.szer_3 = szer_3;
    }

    public String getTetno() {
        return tetno;
    }

    public void setTetno(String tetno) {
        this.tetno = tetno;
    }

    public String getWyglad() {
        return wyglad;
    }

    public void setWyglad(String wyglad) {
        this.wyglad = wyglad;
    }

    public String getWilgotnosc() {
        return wilgotnosc;
    }

    public void setWilgotnosc(String wilgotnosc) {
        this.wilgotnosc = wilgotnosc;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getBrzuch() {
        return brzuch;
    }

    public void setBrzuch(String brzuch) {
        this.brzuch = brzuch;
    }

    public String getOcena_psych() {
        return ocena_psych;
    }

    public void setOcena_psych(String ocena_psych) {
        this.ocena_psych = ocena_psych;
    }

    public String getTony_serca() {
        return tony_serca;
    }

    public void setTony_serca(String tony_serca) {
        this.tony_serca = tony_serca;
    }

    public String getZapach() {
        return zapach;
    }

    public void setZapach(String zapach) {
        this.zapach = zapach;
    }

    public String getNiedowlad() {
        return niedowlad;
    }

    public void setNiedowlad(String niedowlad) {
        this.niedowlad = niedowlad;
    }

    public String getKonczyna_g() {
        return konczyna_g;
    }

    public void setKonczyna_g(String konczyna_g) {
        this.konczyna_g = konczyna_g;
    }

    public String getKonczyna_d() {
        return konczyna_d;
    }

    public void setKonczyna_d(String konczyna_d) {
        this.konczyna_d = konczyna_d;
    }

    public String getEkg() {
        return ekg;
    }

    public void setEkg(String ekg) {
        this.ekg = ekg;
    }

    public String getCzynnosci() {
        return czynnosci;
    }

    public void setCzynnosci(String czynnosci) {
        this.czynnosci = czynnosci;
    }

}
