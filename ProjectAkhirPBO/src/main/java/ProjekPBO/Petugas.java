/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjekPBO;

import java.util.Scanner;

/**
 *
 * @author santos
 */
public class Petugas extends Penguna{  
    private String nama, alamat,noktp,nohp;
    private String namek,tglmasuk;
    private int nokamar,kapasitas;    
    private String namap;
    private Penguna[] kamar;
    private int index,jumlah;    
    Scanner daftar = new Scanner(System.in);  
           
    public void daftarAngota(){
    System.out.println();
         System.out.print("Masukan Nama: ");
         nama = daftar.nextLine();
         System.out.print("Masukan Alamat: ");
         alamat = daftar.nextLine();
         System.out.print("Masukan Nomor KTP: ");
         noktp = daftar.nextLine();
         System.out.print("Masukan Nomor HP: ");
         nohp = daftar.nextLine();
         System.out.print("Masukan Nama Kamar: ");
         namek = daftar.nextLine();
         System.out.print("Masukan Tanggal masuk: ");
         tglmasuk = daftar.nextLine();
         System.out.print("Masukan Nomor Kamar: ");
         nokamar = daftar.nextInt();
         System.out.print("Masukan Kapasitas: ");
         kapasitas = daftar.nextInt();
          System.out.println("---------------------------------");                 
    }
    
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoktp() {
        return noktp;
    }

    public String getNohp() {
        return nohp;
    }

    public String getNamek() {
        return namek;
    }

    public String getTglmasuk() {
        return tglmasuk;
    }

    public int getNokamar() {
        return nokamar;
    }

    public String getNamap() {
        return namap;
    }

    public Penguna[] getKamar() {
        return kamar;
    }

    public int getIndex() {
        return index;
    }

    public int getJumlah() {
        return jumlah;
    }
    
    //metode menamba kamar
     public Petugas(){

        System.out.print("petugas: ");
        namap = daftar.nextLine();
        kamar = new Petugas[30];
        for(int i = 0; i< kamar.length; i++){ 
            kamar[i] = null;   
        }        
        index = -1;  
    }
     
    //metode keluarkan angota atau hapus angota
    public Penguna HapusAngota(){
    Penguna temp = kamar[index];
    index = index-1;
    return temp;    
    } 
  
    @Override
    public void TambahAngota(Penguna x) {
        index = index +1;
        kamar[index]= x;
    }
    
    @Override
    public void TampilkanAngotaKos() {       
        System.out.println("\n----Daftar Angota Kost-----\n");
        System.out.println("Nama: "+nama);
        System.out.println("Alamat: "+alamat);
        System.out.println("Nomor KTP: "+noktp);
        System.out.println("Nomor HP: "+nohp);
        System.out.println("Nama Kamar: "+namek);
        System.out.println("Tangal Masuk: "+tglmasuk); 
        System.out.println("Nomor Kamar: "+nokamar); 
        System.out.println("Kapasitas Orang: "+kapasitas);
    }
    
     @Override
    public void TampilkanAngota() {
         System.out.println("\nNama Petugas Kost: "+ namap);
        for(int i=0; i<= index; i++)
            kamar[i].TampilkanAngotaKos();
    }     
}

