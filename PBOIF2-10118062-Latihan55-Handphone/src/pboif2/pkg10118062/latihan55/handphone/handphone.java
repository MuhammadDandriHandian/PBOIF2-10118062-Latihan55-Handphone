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
public class handphone {
    protected String manufacture,operatingsystem,model;
   protected int harga;

    public handphone(String manufacture, String operatingsystem, String model, int harga) {
        this.manufacture = manufacture;
        this.operatingsystem = operatingsystem;
        this.model = model;
        this.harga = harga;
    }
   public void displayproduct(){
       System.out.println("Manufaktur :"+this.manufacture );
       System.out.println("OS :"+this.operatingsystem);
       System.out.println("Model :  "+this.model);
       System.out.println("Harga : "+this.harga);
   }
}
