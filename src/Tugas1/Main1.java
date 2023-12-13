/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author Prakoso
 */
public class Main1 {
    public static void main(String[] args) {

 Peralatan piring = new Peralatan();
 Peralatan gelas = new Peralatan();
 
 piring.setnama("Piring");
 piring.setwarna("Putih");
 piring.setharga("3000");
 piring.setsupply("200");
 
 gelas.setnama("Gelas");
 gelas.setwarna("Merah");
 gelas.setharga("5000");
 gelas.setsupply("10");

 
 System.out.println("Nama: " + piring.getnama());
 System.out.println("Warna: " + piring.getWarna());
 System.out.println("harga: " + piring.getHarga());
 System.out.println("Supply: " + piring.getsupply());
System.out.println("\n");
 System.out.println("Nama: " + gelas.getnama());
 System.out.println("Warna: " + gelas.getWarna());
 System.out.println("harga: " + gelas.getHarga());
 System.out.println("Supply: " + gelas.getsupply());
 }

}
