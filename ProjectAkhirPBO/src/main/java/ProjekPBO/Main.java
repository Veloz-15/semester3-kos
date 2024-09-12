
package ProjekPBO;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    
   Scanner scanner = new Scanner(System.in);
     int pilihan;
        do {
            System.out.println("\n\n---------------------------------Aplikasi Sewa Kamar Kost----------------------------------");
            System.out.println("\nMenu:");
            System.out.println("1. Info Kos");
            System.out.println("2. Daftar Angota Kost");
            System.out.println("3. Transaksi");
            System.out.println("Pilih 0 untuk Keluar");
            System.out.print("\nPilih Menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:                                      
                    Rumah petugas = new  Kos("Pedro da Costa", 2);
                    Rumah petugas1 = new  Ketersediaan();
                    petugas.infoKos();
                    petugas1.infoKos();                   
                    break;
                    
                case 2:                   
                    Petugas angota1= new  Petugas();
                    angota1.daftarAngota();
                    Petugas angota2= new  Petugas();
                     angota2.daftarAngota();                                        
                     angota1.TambahAngota(angota1);                    
                    angota1.TambahAngota(angota2);
                    angota1.TampilkanAngota();                   
                 break;
                 
                case 3:                   
                    Transaksi bayar = new  Transaksi ();
                     Transaksi bayar2 = new  Transaksi ();                   
                    bayar.setHarga1();
                     bayar.TampilHasilPembayaran();
                    bayar2.setHarga1();                   
                    bayar.TampilHasilPembayaran();                  
                    break; 
                    
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                    
                case 9:
                    System.out.println("Balik ke menu");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            if(pilihan == 9);                
        } while (pilihan != 0);        
    }    
}
    

