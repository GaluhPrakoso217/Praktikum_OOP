/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author Prakoso
 */
public class Penjualan extends Peralatan{
    public int harga, penjualan,jual;
    int lusin,satuan,tolus,stok,sisa;
    
    int satu(){
        return satuan = penjualan * harga;
    }
    int lusinan(){
        return tolus = (12 * lusin) * harga - (harga * 2);
    }
    int jumlah(){
        return sisa = stok - penjualan - (12 * lusin) ;
    }
    
    @Override
    double total(){
        return jual = satuan + tolus;
    }
}
