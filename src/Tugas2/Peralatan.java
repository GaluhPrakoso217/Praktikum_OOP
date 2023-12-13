/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author Prakoso
 */
public class Peralatan {
        String bentuk,keuangan,jumlah,warna,bahan,merk ; 
    
public Peralatan(String jenis,String harga,String stok, String Warna, String Bahan,String Merk){
        this.bentuk = jenis;
        this.keuangan = harga;
        this.jumlah = stok;
        this.warna = Warna;
        this.bahan = Bahan;
        this.merk = Merk;
    }  
        public void setjenis(String jenis) {
        this.bentuk = jenis;
    }
        public void setharga(String harga) {
        this.keuangan = harga;
    }
        public void setstok(String stok) {
        this.jumlah = stok;
    }
        public void setwarna(String Warna) {
        this.warna = Warna;
    }
        public void setbahan(String Bahan) {
        this.bahan = Bahan;
    }
        public void setmerk(String Merk) {
        this.merk = Merk;
    }  

}
