/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Papagaj extends HaziAllatFajta {

    public Papagaj(int mennyibeKerul, String nev) {
        super(mennyibeKerul, nev);
    }

    @Override
    public String kiadHangot() {
        return "Csip, csip... Motherfucker (beszélő papagáj)";
    }
}
