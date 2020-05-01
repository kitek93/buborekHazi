/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Kutya extends HaziAllatFajta {

    public Kutya(int mennyibeKerul, String nev) {
        super(mennyibeKerul, nev);
    }

    @Override
    public String kiadHangot() {
        return "Vau, Vau";
    }
}
