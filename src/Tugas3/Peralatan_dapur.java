/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author Prakoso
 */
public class Peralatan_dapur extends Peralatan {   
    double diskon;
    
   public Peralatan_dapur(){
       this.diskon = 0;
   }
   @Override
    double Diskon(){
        return(Lusin() - (diskon * 0.1) + Sale());
    }
    double Diskonsatuan(){
        return((diskon * 0.01)* harga);
    }
    double Diskontotal(){
        return(harga - Diskonsatuan());
}
}
