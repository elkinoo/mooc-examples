/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author noora
 */
public class Kirja {

    private String nimi;
    private int sivuja;
    private int vuosi;

    public Kirja(String nimi, int sivuja, int vuosi) {
        this.nimi = nimi;
        this.sivuja = sivuja;
        this.vuosi = vuosi;
    }

    public void tulosta(String mita) {
        if (mita.equals("kaikki")) {
            System.out.println(this.nimi + ", " + this.sivuja + " sivua, " + this.vuosi);
        } else if (mita.equals("nimi")) {
            System.out.println(this.nimi);
        }
    }
}
