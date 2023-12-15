/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan1;

/**
 *
 * @author USER
 */
public class CLI_CetakKTM {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.dataNIM("2218102");
        mhs.dataNama("Nayaka Apta Nayottama");
        mhs.dataJenisKelamin("Laki-Laki");
        mhs.dataProdi("TI");
        mhs.dataAngkatan("2022");
        mhs.dataAlamat("Jalan Bareng");
        System.out.println("KTM ITN Malang");
        System.out.println("----------------------");
        System.out.println("NIM             : " +mhs.cetakNIM());
        System.out.println("Nama            : " +mhs.cetakNama());
        System.out.println("Jenis Kelamin   : " +mhs.cetakJenisKelamin());
        System.out.println("Prodi           : " +mhs.cetakProdi());
        System.out.println("Angkatan        : " +mhs.cetakAngkatan());
        System.out.println("Alamat          : " +mhs.cetakAlamat());
    }
}
