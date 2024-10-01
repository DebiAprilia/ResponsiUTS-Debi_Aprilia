/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_debi_aprilia;

/**
 *
 * @author user
 */
public class Elektronik extends Produk {
    //Kelas turunan Produk dengan tambahan atribut garansi
    private int garansi;
    
    //Konstruktor
    public Elektronik(String namaProduk, int harga, int garansi){
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    //Metode Getter dan Setter
    public int getGaransi(){
        return garansi;
    }
    public void setGaransi(int garansi){
        this.garansi = garansi;
    }
    
    //Implementasi polimorfisme dengan melakukan override pada metode tampilkanInfo()
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Garansi : " + garansi + " tahun");
        System.out.println();
    }
}
