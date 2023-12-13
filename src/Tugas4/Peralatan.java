/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author Prakoso
 */
public class Peralatan {
    String jenis, warna;
    private int harga, penjualan;
    int a;
    
    public int getharga(){
        return harga;
    }
    public void setharga(int harga){
        this.harga = harga;
    }
    public int getpenjualan(){
        return penjualan;
    }
    public void setpenjualan(int penjualan){
        this.penjualan = penjualan;
    }
    
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
