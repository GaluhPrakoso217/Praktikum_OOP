/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author Prakoso
 */
public class PeralatanPRT {
    String jenis, warna;
    int hargabeli, penjualan,hargajual,stokmasuk,stokkeluar;
    int tot,sisa;
    double diskon;
    
    int total(){
        return tot = hargajual - hargabeli;
    }
    
    int total(int stokmasuk,int stokkeluar){
        return tot = stokmasuk - stokkeluar;
    }
    
    double hitdiskon(){
        return diskon = 0;
    }
}
