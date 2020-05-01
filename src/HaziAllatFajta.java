/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class HaziAllatFajta implements Kommunikalasok {

    public HaziAllatFajta(int mennyibeKerul, String nev) {
        this.mennyibeKerul = mennyibeKerul;
        this.nev = nev;
    }

    private int mennyibeKerul;
    private String nev;

    public int getMennyibeKerul() {
        return mennyibeKerul;
    }

    public void setMennyibeKerul(int mennyibeKerul) {
        this.mennyibeKerul = mennyibeKerul;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    @Override
    public String kiadHangot() {
        return ("A háziállatok különböző hangot adnak ki.");
    }

    @Override
    public String toString() {
        return "HaziAllatFajta{" + "mennyibeKerul=" + mennyibeKerul + ", nev=" + nev + '}';
    }

     
}
