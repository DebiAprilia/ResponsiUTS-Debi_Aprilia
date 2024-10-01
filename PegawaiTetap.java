/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_debi_aprilia;

/**
 *
 * @author user
 */
public class PegawaiTetap extends Pegawai {
    //Kelas turunan Pegawai dengan tambahan atribut tunjangan
    private int tunjangan;
    
    //Konstruktor
    public PegawaiTetap(String namaPegawai, int gaji, int tunjangan){
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    //Metode Getter dan Setter
    public int getTunjangan(){
        return tunjangan;
    }
    public void setTunjangan(int tunjangan){
        this.tunjangan = tunjangan;
    }
    
    //Implementasi polimorfisme dengan melakukan override pada metode tampilkanInfo()
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Tunjangan : " + tunjangan);
        System.out.println();
    }
}
