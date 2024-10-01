/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_debi_aprilia;

/**
 *
 * @author user
 */
public class PegawaiKontrak extends Pegawai {
    //Kelas turunan Pegawai dengan tambahan atribut lamaKontrak
    private int lamaKontrak;
    
    //Konstruktor
    public PegawaiKontrak(String namaPegawai, int gaji, int lamaKontrak){
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    
    //Metode Getter dan Setter
    public int getLamaKontrak(){
        return lamaKontrak;
    }
    public void setLamaKontrak(int lamaKontrak){
        this.lamaKontrak = lamaKontrak;
    }
    
    //Implementasi polimorfisme dengan melakukan override pada metode tampilkanInfo()
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Lama Kontrak : " + lamaKontrak + " bulan ");
        System.out.println();
    }
}
