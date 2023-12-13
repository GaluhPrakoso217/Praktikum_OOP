/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6tes;

/**
 *
 * @author Prakoso
 */
public class keuangan extends toko {
    double  hargapokok, hargajual, tod;


     @Override
     public double keuntungan(){
         return tod = hargajual - hargapokok;
     }
}
