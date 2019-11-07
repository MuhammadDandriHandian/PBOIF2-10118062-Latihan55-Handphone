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
public class android extends handphone {
    private String keystore;

    public android(String keystore, String manufacture, String operatingsystem, String modal, int harga) {
        super(manufacture, operatingsystem, modal, harga);
        this.keystore = keystore;
    }
    
    public String getKeystore() {
        System.out.println("android Key Store : "+keystore);
        System.out.println("");
        return keystore;
    }

    public void setKeystore(String keystore) {
        this.keystore = keystore;
    }
    
}
