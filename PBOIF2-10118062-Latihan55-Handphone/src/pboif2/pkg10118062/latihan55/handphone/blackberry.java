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
public class blackberry extends handphone {
    private String pinbb;

    public blackberry(String pinbb, String manufacture, String operatingsystem, String modal, int harga) {
        super(manufacture, operatingsystem, modal, harga);
        this.pinbb = pinbb;
    }

    public String getPinbb() {
        System.out.println("Pin : "+pinbb);
        System.out.println("");
        return pinbb;
    }

    public void setPinbb(String pinbb) {
        this.pinbb = pinbb;
    }
    
}
