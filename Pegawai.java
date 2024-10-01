/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts_debi_aprilia;

/**
 *
 * @author user
 */
public class Pegawai {
    //Atribut Kelas Pegawai yang menggunakan akses modifier private 
    private String namaPegawai;
    private int gaji;
    
    //Konstruktor
    public Pegawai(String namaPegawai, int gaji){
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    //Metode getter dan setter
    public String getNamaPegawai(){
        return namaPegawai;
    }
    public void setNamaPegawai(String namaPegawai){
        this.namaPegawai = namaPegawai;
    }
    
    public int gaji(){
        return gaji;
    }
    public void setGaji(int gaji){
        this.gaji = gaji;
    }
    
    //Metode tampilkanInfo() yang akan di Override di kelas turunan
    public void tampilkanInfo(){
        System.out.println("Nama Pegawai : " + namaPegawai);
        System.out.println("Gaji : " + gaji);
    }
}
