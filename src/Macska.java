/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Macska extends HaziAllatFajta {

    public Macska(int mennyibeKerul, String nev) {
        super(mennyibeKerul, nev);
    }

    @Override
    public String kiadHangot() {
        return "Miau. Miau";
    }
}
