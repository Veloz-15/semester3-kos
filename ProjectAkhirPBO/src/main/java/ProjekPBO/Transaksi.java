/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjekPBO;

import java.util.Scanner;

public class Transaksi {    
    int harga; 
    String hargaTambahan,nama,nohp,namak,tglbayar,nok;     
    Scanner bayar = new Scanner(System.in);  
    
    public void setHarga1() {
        System.out.println();
         System.out.print("Masukan Nama: ");
         nama = bayar.nextLine();
         System.out.print("Masukan Nomor HP: ");
         nohp = bayar.nextLine();
         System.out.print("Masukan Nomor Kamar: ");
         nok = bayar.nextLine();
         System.out.print("Masukan Nama Kamar: ");
         namak = bayar.nextLine();
         System.out.print("Masukan Tanggal Bayar: ");
         tglbayar = bayar.nextLine();
         System.out.print("Masukan Harga: ");
         harga = bayar.nextInt();         
        }
       
    public void TampilHasilPembayaran() {         
           System.out.println("\n\nNama: "+nama);
           System.out.println("Nomor HP: "+nohp);
           System.out.println("Nama Kamar: "+namak);
           System.out.println("Nomor Kamar: "+nok);           
           if(harga == 1500000){
                System.out.println("Total Pembayaran: "+harga);
           }
           else if(harga == 1200000){          
                System.out.println("Total Pembayaran: "+harga);
           }else{
                System.out.println("Pembayaran Gagal");
           System.out.println("uang Tidak cukup Atau udah lebih");
           }    
    }   
}







