/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjekPBO;

/**
 *
 * @author santos
 */
public class Kos implements Rumah {
    
     private String namaP;
   
      private int infkapasitas;
    
    //konstractor
    public Kos(String namap,int kpsts) {
        this.namaP = namap;
        this.infkapasitas = kpsts;
}
    
    // Getters dan setters untuk variabel private
     public String getNamap() {
        return namaP;
    }
     
//    public boolean isTersedia() {
//        return tersedia;
//    }
//
//    public void setTersedia(boolean tersedia) {
//        this.tersedia = tersedia;
//    }
    
     public int getKapasitas() {
        return infkapasitas;
    }
     
     // Implementasi dari metode dalam interface inter atau 
    // Implementasi dari metode abstract 
    @Override
    public void infoKos() {
         // Menampilkan fasilitas-fasilitas yang ada di kos dan
        // Juga menampilkan informasi kamar kosong dan kapasitas orang yang masuk
      System.out.println("\nNama Petugas: "+getNamap());
//      System.out.println("Kamar Kosong: "+(isTersedia() ? "Ada" : "Tidak Ada"));
      System.out.println("Kapasitas Maksimal: " + getKapasitas()+ " orang");
      
      System.out.println("|-------------------------------Fasilitas umum di Kost------------------------------|");
      System.out.println("|1. Kulkas                  5. Tempat duduk nonkrong      9. Free Air               |");
      System.out.println("|2. Free Listrik            6. kamar Mandi Umum           10. Free Wifi             |");
      System.out.println("|3. sapu + kain Pel         7. Setrika                    11. Wartek di Depan Kost  |");
      System.out.println("|4. Tempat penjemuran Baju  8. Dapur                      12. Barang Dapur          |");
      System.out.println("|-----------------------------------------------------------------------------------|");
      System.out.println("");
      System.out.println("------------------------Fasilitas Tipe Kamar Kost-----------------------|");
      System.out.println("|1. Kamar T1 = Rp1.500.000        |        2. Kamar T2 = Rp1.200.000    |");
      System.out.println("|  - AC                           |          - Tempat Tidur             |");
      System.out.println("|  - Tempat Tidur                 |          - Kasur+Bantal             |");
      System.out.println("|  - Kasur+Bantal                 |          - Lemari Baju              |");
      System.out.println("|  - Lemari Baju                 A |          - Meza Belajar             |");
      System.out.println("|  - Meza Belajar                 |          - Kursi                    |");
      System.out.println("|  - Kursi                        |          - AC                       |");
      System.out.println("|  - Kamar Mandi                  |                                     |");
      System.out.println("|-----------------------------------------------------------------------|");
             
    } 
}

class Ketersediaan implements Rumah{
    
   private boolean tersedia;
      
    public Ketersediaan(){
        this.tersedia = true;
    }
    
    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
    
   @Override
   public void infoKos() {
        System.out.println("Kamar Kosong: "+(isTersedia() ? "Ada" : "Tidak Ada"));        
  }        
}

  
            


