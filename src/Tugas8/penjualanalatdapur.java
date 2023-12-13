/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8;

/**
 *
 * @author Prakoso
 */
public class penjualanalatdapur extends penjualanalatmakan {
    String warna;
    
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
