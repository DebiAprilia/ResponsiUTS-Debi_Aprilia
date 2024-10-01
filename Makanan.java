/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_debi_aprilia;

/**
 *
 * @author user
 */
public class Makanan extends Produk {
    //Kelas turunan Produk dengan tambahan atribut tanggalKadaluarsa
    private String tanggalKadaluarsa;
    
    //Konstruktor
    public Makanan(String namaProduk, int harga, String tanggalKadaluarsa){
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    //Metode Getter dan Setter
    public String getTanggalKadaluarsa(){
        return tanggalKadaluarsa;
    }
    public void setTanggalKadaluarsa(String tanggalKadaluarsa){
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    //Implementasi polimorfisme dengan melakukan override pada metode tampilkanInfo()
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa : " + tanggalKadaluarsa);
        System.out.println();
    }
}
