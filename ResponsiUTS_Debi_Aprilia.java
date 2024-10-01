/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.responsiuts_debi_aprilia;
/**
 *
 * @author user
 */
public class ResponsiUTS_Debi_Aprilia {

    public static void main(String[] args) {
        //Membuat dua objek dari kelas Elektronik dan Makanan
        Produk produk1 = new Elektronik("Laptop", 15000000, 2);
        Produk produk2 = new Makanan("Pizza", 150000, "10/10/2024");
        //Memanggil metode yang telah di override pada kelas turunan
        //Untuk menggunakan kembali metode dari kelas induk
        produk1.tampilkanInfo();
        produk2.tampilkanInfo();
        
        //Mmebuat dua objek dari kelas PegawaiTetap dan PegawaiKontrak
        Pegawai pegawai1 = new PegawaiTetap("Debi", 50000000, 5000000);
        Pegawai pegawai2 = new PegawaiKontrak("Aprilia", 25000000, 3);
        //Memanggil metode yang telah di override pada kelas turunan
        //Untuk menggunakan kembali metode dari kelas induk
        pegawai1.tampilkanInfo();
        pegawai2.tampilkanInfo();
    }
}
