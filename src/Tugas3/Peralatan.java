/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3;

/**
 *
 * @author Prakoso
 */
public class Peralatan {
    String jenis, warna;
    int harga, penjualan;
    int a;
    
    int Lusin(){
        return (a * 12 * harga) ;
    }
    int Sale(){
        return (harga * penjualan);
    }
    int tampilsatuan(){
        return Sale();
    }
    double tampillusin(){
        return Lusin();
    }
    double Total(){
    return  (Lusin() + Sale()) ;
    }
    double Diskon(){
        return 0;
    }
}
