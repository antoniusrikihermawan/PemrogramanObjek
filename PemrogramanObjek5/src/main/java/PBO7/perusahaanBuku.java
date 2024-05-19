/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO7;

/**
 *
 * @author DKID
 */
public class perusahaanBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        
        buku1.judul = "Java 1";
        buku2.judul = "Java 2";
        buku1.author = "Antonius Riki";
        buku2.author = "Hermawan";
        
        System.out.println(buku1.judul);
        System.out.println(buku1.author);
        System.out.println(buku2.judul);
        System.out.println(buku2.author);
    }
}

class Buku {
    String judul;
    String author;
    int tahunPenerbitan = 2024;
    Harga harga = new Harga();
}

class Harga {
    double jual = 100000.00;
    double beli = 90000.00;
}
