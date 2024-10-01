/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_debi_aprilia;

/**
 *
 * @author user
 */
public class Produk {
    //Atribut Kelas Produk yang menggunakan akses modifier private
    private String namaProduk;
    private int harga;
    
    //Konstruktor
    public Produk(String namaProduk, int harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    //Metode Getter dan Setter
    public String getNamaProduk(){
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    
    public int harga(){
        return harga;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    //Metode tampilkanInfo() yang akan di Override di kelas turunan
    public void tampilkanInfo(){
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga : " + harga);
    }
}
