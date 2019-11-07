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
public class PBOIF210118062Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int harga = 3000000;
        // TODO code application logic here
        
        android hasil1 = new android("kay store",  "samsung", "Android", "Grand", 3000000);
        hasil1.displayproduct();
        hasil1.setKeystore("234ibfd3840fo");
        hasil1.getKeystore();
        
        blackberry hasil2 = new blackberry("pinbb", "BlackB","RIM" ,"Curve", 2000000);
        hasil2.displayproduct();
        hasil2.setPinbb("BHS249");
        hasil2.getPinbb();
        
        windowsphone hasil3 = new windowsphone("WP KEY", "Nokia","Win8" ,"Lumia", 1000000);
        hasil3.displayproduct();
        hasil3.setWpkeystore("UUUQIJWORJ");
        hasil3.getWpkeystore();
        }
    
}
