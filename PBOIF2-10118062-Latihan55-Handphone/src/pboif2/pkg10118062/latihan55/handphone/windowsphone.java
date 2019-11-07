/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan55.handphone;

/**
 *
 * @author ASUS
 */
public class windowsphone extends handphone {
    private String wpkeystore;

    public windowsphone(String wpkeystore, String manufacture, String operatingsystem, String modal, int harga) {
        super(manufacture, operatingsystem, modal, harga);
        this.wpkeystore = wpkeystore;
    }

    public String getWpkeystore() {
        System.out.println("Wp Key Store : "+wpkeystore);
        System.out.println("");
        return wpkeystore;
    }

    public void setWpkeystore(String wpkeystore) {
        this.wpkeystore = wpkeystore;
    }
    
}
