/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8;

/**
 *
 * @author Prakoso
 */
public class Penjualanprt implements diskon,satuan,lusin {
    String jenis;
    int harga;
    int total,satu,lusin;
    double totdis,diskon;
    @Override
    public int hitsatu(int satu){
       return  total = harga * satu;
    }
    @Override
    public int hitlusin(int lusin){
        
       return  total = harga * (lusin * 12);
    }
    @Override
    public double hitdiskon(double diskon){
       return  totdis = (harga * ( lusin * 12 )) * (diskon * 0.01);
    }
}
