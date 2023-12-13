/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author Prakoso
 */
public class Peralatan {
    String jenis,nama, warna,harga, supply;
 
 void setjenis(String jenis) {
 this.jenis = jenis;
 }
 void setnama(String nama) {
 this.nama = nama;
 }
 void setwarna(String warna) {
 this.warna = warna;
 }
 void setharga(String harga) {
 this.harga = harga;
 }
 void setsupply(String supply) {
 this.supply = supply;
 }

 String getnama() {
 return nama;
 }
 String getWarna() {
 return warna;
 }
 String getHarga() {
 return harga;
 }
 String getsupply() {
 return supply;
 }
 String getjenis() {
 return jenis;
 }
}
