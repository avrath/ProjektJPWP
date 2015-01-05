/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author p
 */
public class Patient {

    /////elementy składowe klasy
    private int ID;
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
    private String trzeszczenie;
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
    private String dokument;
    private String oznaczenie_dysp;
    private String kod_zrm;
    private String nr_zlec;
    private String ident_nfz;
    private Calendar data_udziel_pom;
    private Calendar przekaz_pacjenta;
    private Calendar zgon_odstap;
    private String przekaz_godz;
    private String przekaz_min;
    private String zgon_odstap_min;
    private String zgon_odstap_godz;
    private String wywiad;
    private String saturacja;
    private String cisnienie_1;
    private String cisnienie_2;
    private String tetno_min;
    private String glukoza_1;
    private String glukzoa_2;
    private String inne_dokl;
    private String rozpoznanie;
    private String zalecenia_uwagi;
    private String zast_leki;
    private String icd10_1;
    private String icd10_2;
    private String icd10_3;
    private String opis;
    private String ulica;
    private String ulica_nr;
    private String ulica_m;

    public Patient create(int ID, String imie, String nazwisko, Calendar data_ur, String pesel, String miasto, String miejsce_zdarzenia, String otwieranie_oczu, String reakcja_slowna, String decyzja, String r_ruchowa, String cz_oddech, String rr_skurcz, String gcs, String dusznosc, String sinica, String bezdech, String szmer, String furczenie, String swisty, String trzeszczenie, String rzezenie, String brak_szmeru, String inne, String reakcja_1, String reakcja_2, String reakcja_3, String szer_1, String szer_2, String szer_3, String tetno, String wyglad, String wilgotnosc, String temp, String brzuch, String ocena_psych, String tony_serca, String zapach, String niedowlad, String konczyna_g, String konczyna_d, String ekg, String czynnosci, String obr_anatomiczne, String dokument, String oznaczenie_dysp, String kod_zrm, String nr_zlec, String ident_nfz, Calendar data_udziel_pom, Calendar przekaz_pacjenta, Calendar zgon_odstap, String przekaz_godz, String przekaz_min, String zgon_odstap_min, String zgon_odstap_godz, String wywiad, String saturacja, String cisnienie_1, String cisnienie_2, String tetno_min, String glukoza_1, String glukzoa_2, String inne_dokl, String rozpoznanie, String zalecenia_uwagi, String zast_leki, String icd10_1, String icd10_2, String icd10_3, String opis, String ulica, String ulica_nr, String ulica_m) {
        this.ID = ID;
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
        this.trzeszczenie = trzeszczenie;
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
        this.dokument = dokument;
        this.oznaczenie_dysp = oznaczenie_dysp;
        this.kod_zrm = kod_zrm;
        this.nr_zlec = nr_zlec;
        this.ident_nfz = ident_nfz;
        this.data_udziel_pom = data_udziel_pom;
        this.przekaz_pacjenta = przekaz_pacjenta;
        this.zgon_odstap = zgon_odstap;
        this.przekaz_godz = przekaz_godz;
        this.przekaz_min = przekaz_min;
        this.zgon_odstap_min = zgon_odstap_min;
        this.zgon_odstap_godz = zgon_odstap_godz;
        this.wywiad = wywiad;
        this.saturacja = saturacja;
        this.cisnienie_1 = cisnienie_1;
        this.cisnienie_2 = cisnienie_2;
        this.tetno_min = tetno_min;
        this.glukoza_1 = glukoza_1;
        this.glukzoa_2 = glukzoa_2;
        this.inne_dokl = inne_dokl;
        this.rozpoznanie = rozpoznanie;
        this.zalecenia_uwagi = zalecenia_uwagi;
        this.zast_leki = zast_leki;
        this.icd10_1 = icd10_1;
        this.icd10_2 = icd10_2;
        this.icd10_3 = icd10_3;
        this.opis = opis;
        this.ulica = ulica;
        this.ulica_nr = ulica_nr;
        this.ulica_m = ulica_m;
        return this;
    }

    public void add() {
        setID(lastID() + 1);
        String bdata = this.data_ur.get(Calendar.YEAR) + "-" + (this.data_ur.get(Calendar.MONTH) + 1) + "-" + this.data_ur.get(Calendar.DATE);
        String data_udziel = this.data_udziel_pom.get(Calendar.YEAR) + "-" + (this.data_udziel_pom.get(Calendar.MONTH) + 1) + "-" + this.data_udziel_pom.get(Calendar.DATE);
        String przekaz = this.przekaz_pacjenta.get(Calendar.YEAR) + "-" + (this.przekaz_pacjenta.get(Calendar.MONTH) + 1) + "-" + this.przekaz_pacjenta.get(Calendar.DATE);
        String zgon = this.zgon_odstap.get(Calendar.YEAR) + "-" + (this.zgon_odstap.get(Calendar.MONTH) + 1) + "-" + this.zgon_odstap.get(Calendar.DATE);

        String sql = "INSERT INTO `pacients`(`ID`, `fname`, `lname`, `bdate`, `pesel`, `address_city`, `place`, `o_oczu`, `r_slowna`, `r_ruchowa`,"
                + " `cz_odech`, `rr_skurcz`, `gcs`, `dusznosc`, `sinica`, `bezdech`, `szmer`, `furczenie`, `swisty`, `trzeszczenie`, `rzezenie`,"
                + " `brak_szmeru`, `inne`, `reakcja_1`, `reakcja_2`, `reakcja_3`, `szer_1`, `szer_2`, `szer_3`, `tetno`, `wyglad`, `wilgotnosc`,"
                + " `temp`, `brzuch`, `ocena_psych`, `tony_serca`, `zapach`, `niedowlad`, `konczyna_g`, `konczyna_d`, `ekg`, `czynnosci`,"
                + " `obr_anatomiczne`, `decyzja`, `dokument`, `oznaczenie_dysp`, `kod_zrm`, `nr_zlec`, `ident_nfz`, `data_udziel_pom`,"
                + " `przekaz_pacjenta`, `przekaz_godz`, `przekaz_min`, `zgon_odstap_godz`, `zgon_odstap_min`, `wywiad`, `saturacja`,"
                + " `cisnienie_1`, `cisnienie_2`, `tetno_min`, `glukoza_1`, `glukoza_2`, `inne_dokl`, `rozpoznanie`, `zalecenia_uwagi`, `zast_leki`,"
                + " `icd10_1`, `icd10_2`, `icd10_3`, `opis`, `zgon_odstap`, `ulica`, `ulica_nr`, `ulica_m`) "
                + "VALUES (" + this.ID + ",'" + this.imie + "','" + this.nazwisko + "','" + bdata + "','" + this.pesel + "','" + this.miasto + "','"
                + this.miejsce_zdarzenia + "','" + this.otwieranie_oczu + "','" + this.reakcja_slowna + "','" + this.r_ruchowa + "','"
                + this.cz_oddech + "','" + this.rr_skurcz + "','" + this.gcs + "','" + this.dusznosc + "','" + this.sinica + "','"
                + this.bezdech + "','" + this.szmer + "','" + this.furczenie + "','" + this.swisty + "','" + this.trzeszczenie + "','"
                + this.rzezenie + "','" + this.brak_szmeru + "','" + this.inne + "','" + this.reakcja_1 + "','"
                + this.reakcja_2 + "','" + this.reakcja_3 + "','" + this.szer_1 + "','" + this.szer_2 + "','" + this.szer_3 + "','" + this.tetno + "','"
                + this.wyglad + "','" + this.wilgotnosc + "','" + this.temp + "','" + this.brzuch + "','" + this.ocena_psych + "','"
                + this.tony_serca + "','" + this.zapach + "','" + this.niedowlad + "','" + this.konczyna_g + "','" + this.konczyna_d + "','"
                + this.ekg + "','" + this.czynnosci + "','" + this.obr_anatomiczne + "','" + this.decyzja + "','" + this.dokument + "','"
                + this.oznaczenie_dysp + "','" + this.kod_zrm + "','" + this.nr_zlec + "','" + this.ident_nfz + "','" + data_udziel + "','"
                + przekaz + "','" + this.przekaz_godz + "','" + this.przekaz_min + "','" + this.zgon_odstap_godz + "','"
                + this.zgon_odstap_min + "','" + this.wywiad + "','" + this.saturacja + "','" + this.cisnienie_1 + "','" + this.cisnienie_2 + "','"
                + this.tetno_min + "','" + this.glukoza_1 + "','" + this.glukzoa_2 + "','" + this.inne_dokl + "','" + this.rozpoznanie + "','"
                + this.zalecenia_uwagi + "','" + this.zast_leki + "','" + this.icd10_1 + "','" + this.icd10_2 + "','" + this.icd10_3 + "','"
                + this.opis + "','" + zgon + "','" + this.ulica + "','" + this.ulica_nr + "','" + this.ulica_m + "');";

        try {
            Connection con = Authentication.getCon();
            Statement stmt = con.createStatement();

            stmt.execute(sql);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage(), "Komunikat", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void uaktualnij() {
        String bdata = this.data_ur.get(Calendar.YEAR) + "-" + (this.data_ur.get(Calendar.MONTH) + 1) + "-" + this.data_ur.get(Calendar.DATE);
        String data_udziel = this.data_udziel_pom.get(Calendar.YEAR) + "-" + (this.data_udziel_pom.get(Calendar.MONTH) + 1) + "-" + this.data_udziel_pom.get(Calendar.DATE);
        String przekaz = this.przekaz_pacjenta.get(Calendar.YEAR) + "-" + (this.przekaz_pacjenta.get(Calendar.MONTH) + 1) + "-" + this.przekaz_pacjenta.get(Calendar.DATE);
        String zgon = this.zgon_odstap.get(Calendar.YEAR) + "-" + (this.zgon_odstap.get(Calendar.MONTH) + 1) + "-" + this.zgon_odstap.get(Calendar.DATE);

        String sql = "UPDATE `pacients` SET `fname`='" + this.imie + "',`lname`='" + this.nazwisko + "',`bdate`='" + bdata + "',`pesel`='"
                + this.pesel + "',`address_city`='" + this.miasto + "',`place`='" + this.miejsce_zdarzenia + "',`o_oczu`='"
                + this.otwieranie_oczu + "',`r_slowna`='" + this.reakcja_slowna + "',`r_ruchowa`='" + this.r_ruchowa + "',`cz_odech`='"
                + this.cz_oddech + "',`rr_skurcz`='" + this.rr_skurcz + "',`gcs`='" + this.gcs + "',`dusznosc`='" + this.dusznosc + "',`sinica`='"
                + this.sinica + "',`bezdech`='" + this.bezdech + "',`szmer`='" + this.szmer + "',`furczenie`='" + this.furczenie + "',`swisty`='"
                + this.swisty + "',`trzeszczenie`='" + this.trzeszczenie + "',`rzezenie`='" + this.rzezenie + "',`brak_szmeru`='"
                + this.brak_szmeru + "',`inne`='" + this.inne + "',`reakcja_1`='" + this.reakcja_1 + "',`reakcja_2`='" + this.reakcja_2 + "',`reakcja_3`='"
                + this.reakcja_3 + "',`szer_1`='" + this.szer_1 + "',`szer_2`='" + this.szer_2 + "',`szer_3`='" + this.szer_3 + "',`tetno`='"
                + this.tetno + "',`wyglad`='" + this.wyglad + "',`wilgotnosc`='" + this.wilgotnosc + "',`temp`='" + this.temp + "',`brzuch`='"
                + this.brzuch + "',`ocena_psych`='" + this.ocena_psych + "',`tony_serca`='" + this.tony_serca + "',`zapach`='"
                + this.zapach + "',`niedowlad`='" + this.niedowlad + "',`konczyna_g`='" + this.konczyna_g + "',`konczyna_d`='"
                + this.konczyna_d + "',`ekg`='" + this.ekg + "',`czynnosci`='" + this.czynnosci + "',`obr_anatomiczne`='"
                + this.obr_anatomiczne + "',`decyzja`='" + this.decyzja + "',`dokument`='" + this.dokument + "',`oznaczenie_dysp`='"
                + this.oznaczenie_dysp + "',`kod_zrm`='" + this.kod_zrm + "',`nr_zlec`='" + this.nr_zlec + "',`ident_nfz`='"
                + this.ident_nfz + "',`data_udziel_pom`='" + data_udziel + "',`przekaz_pacjenta`='" + przekaz + "',`przekaz_godz`='"
                + this.przekaz_godz + "',`przekaz_min`='" + this.przekaz_min + "',`zgon_odstap_godz`='" + this.zgon_odstap_godz + "',`zgon_odstap_min`='"
                + this.zgon_odstap_min + "',`wywiad`='" + this.wywiad + "',`saturacja`='" + this.saturacja + "',`cisnienie_1`='"
                + this.cisnienie_1 + "',`cisnienie_2`='" + this.cisnienie_2 + "',`tetno_min`='" + this.tetno_min + "',`glukoza_1`='"
                + this.glukoza_1 + "',`glukoza_2`='" + this.glukzoa_2 + "',`inne_dokl`='" + this.inne_dokl + "',`rozpoznanie`='"
                + this.rozpoznanie + "',`zalecenia_uwagi`='" + this.zalecenia_uwagi + "',`zast_leki`='" + this.zalecenia_uwagi + "',`icd10_1`='"
                + this.icd10_1 + "',`icd10_2`='" + this.icd10_2 + "',`icd10_3`='" + this.icd10_3 + "',`opis`='" + this.opis + "',`zgon_odstap`='"
                + zgon + "',`ulica`='" + this.ulica + "',`ulica_nr`='" + this.ulica_nr + "',`ulica_m`='" + this.ulica_m + "' WHERE ID = " + this.ID + ";";

        try {
            Connection con = Authentication.getCon();
            Statement stmt = con.createStatement();

            stmt.execute(sql);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage(), "Komunikat", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static String[] pobierz(int ID) {
        String[] dane = new String[74];
        try {
            Connection con = Authentication.getCon();
            Statement stmt = con.createStatement();
            String sql = "SELECT * from pacients where ID=" + ID + ";";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                for (int i = 2; i < 75; i++) {
                    dane[i - 2] = rs.getString(i);
                }
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage(), "Komunikat", JOptionPane.WARNING_MESSAGE);
        }
        return dane;
    }

    public static int lastID() {
        int ID = 0;
        try {
            Connection con = Authentication.getCon();
            Statement stmt = con.createStatement();
            String sql = "SELECT id from pacients where ID=(SELECT max(id) from pacients);";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ID = rs.getInt("id");
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage(), "Komunikat", JOptionPane.WARNING_MESSAGE);
        }
        return ID;
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
            }
        }
        return wybor;
    }

    public static int suma(ButtonGroup group) {
        int suma = 0;
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
            suma = Integer.parseInt(box.getName());
        }
        return suma;
    }

    public static void zaznacz(String name, ButtonGroup group) {

        Enumeration<AbstractButton> ab = group.getElements();
        JCheckBox box = null;
        while (ab.hasMoreElements()) {
            box = (JCheckBox) ab.nextElement();
            if (box.getText().equals(name)) {
                box.setSelected(true);
                break;
            } else {
                box.setSelected(false);
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

    ///////////////////setery i getery
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

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

    public String getDokument() {
        return dokument;
    }

    public void setDokument(String dokument) {
        this.dokument = dokument;
    }

    public String getOznaczenie_dysp() {
        return oznaczenie_dysp;
    }

    public void setOznaczenie_dysp(String oznaczenie_dysp) {
        this.oznaczenie_dysp = oznaczenie_dysp;
    }

    public String getKod_zrm() {
        return kod_zrm;
    }

    public void setKod_zrm(String kod_zrm) {
        this.kod_zrm = kod_zrm;
    }

    public String getNr_zlec() {
        return nr_zlec;
    }

    public void setNr_zlec(String nr_zlec) {
        this.nr_zlec = nr_zlec;
    }

    public String getIdent_nfz() {
        return ident_nfz;
    }

    public void setIdent_nfz(String ident_nfz) {
        this.ident_nfz = ident_nfz;
    }

    public Calendar getData_udziel_pom() {
        return data_udziel_pom;
    }

    public void setData_udziel_pom(Calendar data_udziel_pom) {
        this.data_udziel_pom = data_udziel_pom;
    }

    public Calendar getPrzekaz_pacjenta() {
        return przekaz_pacjenta;
    }

    public void setPrzekaz_pacjenta(Calendar przekaz_pacjenta) {
        this.przekaz_pacjenta = przekaz_pacjenta;
    }

    public Calendar getZgon_odstap() {
        return zgon_odstap;
    }

    public void setZgon_odstap(Calendar zgon_odstap) {
        this.zgon_odstap = zgon_odstap;
    }

    public String getPrzekaz_godz() {
        return przekaz_godz;
    }

    public void setPrzekaz_godz(String przekaz_godz) {
        this.przekaz_godz = przekaz_godz;
    }

    public String getPrzekaz_min() {
        return przekaz_min;
    }

    public void setPrzekaz_min(String przekaz_min) {
        this.przekaz_min = przekaz_min;
    }

    public String getZgon_odstap_min() {
        return zgon_odstap_min;
    }

    public void setZgon_odstap_min(String zgon_odstap_min) {
        this.zgon_odstap_min = zgon_odstap_min;
    }

    public String getZgon_odstap_godz() {
        return zgon_odstap_godz;
    }

    public void setZgon_odstap_godz(String zgon_odstap_godz) {
        this.zgon_odstap_godz = zgon_odstap_godz;
    }

    public String getWywiad() {
        return wywiad;
    }

    public void setWywiad(String wywiad) {
        this.wywiad = wywiad;
    }

    public String getSaturacja() {
        return saturacja;
    }

    public void setSaturacja(String saturacja) {
        this.saturacja = saturacja;
    }

    public String getCisnienie_1() {
        return cisnienie_1;
    }

    public void setCisnienie_1(String cisnienie_1) {
        this.cisnienie_1 = cisnienie_1;
    }

    public String getCisnienie_2() {
        return cisnienie_2;
    }

    public void setCisnienie_2(String cisnienie_2) {
        this.cisnienie_2 = cisnienie_2;
    }

    public String getTetno_min() {
        return tetno_min;
    }

    public void setTetno_min(String tetno_min) {
        this.tetno_min = tetno_min;
    }

    public String getGlukoza_1() {
        return glukoza_1;
    }

    public void setGlukoza_1(String glukoza_1) {
        this.glukoza_1 = glukoza_1;
    }

    public String getGlukzoa_2() {
        return glukzoa_2;
    }

    public void setGlukzoa_2(String glukzoa_2) {
        this.glukzoa_2 = glukzoa_2;
    }

    public String getInne_dokl() {
        return inne_dokl;
    }

    public void setInne_dokl(String inne_dokl) {
        this.inne_dokl = inne_dokl;
    }

    public String getRozpoznanie() {
        return rozpoznanie;
    }

    public void setRozpoznanie(String rozpoznanie) {
        this.rozpoznanie = rozpoznanie;
    }

    public String getZalecenia_uwagi() {
        return zalecenia_uwagi;
    }

    public void setZalecenia_uwagi(String zalecenia_uwagi) {
        this.zalecenia_uwagi = zalecenia_uwagi;
    }

    public String getZast_leki() {
        return zast_leki;
    }

    public void setZast_leki(String zast_leki) {
        this.zast_leki = zast_leki;
    }

    public String getIcd10_1() {
        return icd10_1;
    }

    public void setIcd10_1(String icd10_1) {
        this.icd10_1 = icd10_1;
    }

    public String getIcd10_2() {
        return icd10_2;
    }

    public void setIcd10_2(String icd10_2) {
        this.icd10_2 = icd10_2;
    }

    public String getIcd10_3() {
        return icd10_3;
    }

    public void setIcd10_3(String icd10_3) {
        this.icd10_3 = icd10_3;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getUlica_nr() {
        return ulica_nr;
    }

    public void setUlica_nr(String ulica_nr) {
        this.ulica_nr = ulica_nr;
    }

    public String getTrzeszczenie() {
        return trzeszczenie;
    }

    public void setTrzeszczenie(String trzeszczenie) {
        this.trzeszczenie = trzeszczenie;
    }

    public String getUlica_m() {
        return ulica_m;
    }

    public void setUlica_m(String ulica_m) {
        this.ulica_m = ulica_m;
    }

}
