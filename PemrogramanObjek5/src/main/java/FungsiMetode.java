/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DKID 
 */

import java.util.Scanner;

public class FungsiMetode {
    public static void main(String[] args) {
        int varInteger;
        sayHello(); // memanggil metode sayHello()
        sayHelloTo("Riki"); //memanggil metode sayHelloTo(String nama)
        String namaMahasiswa = "Antonius Riki Hermawan";
        
// di bawah ini memanggil metode sayHelloTo(String nama) dengan memberikan data variabel namaMahasiswa sebagai parameter String nama
        
        sayHelloTo(namaMahasiswa);
        
// di bawah ini memanggil metode inputNilaiInteger(String namaVariabel)
// untuk memberikan nilai variabel varInteger melalui input dari user
        
        varInteger = inputNilaiInteger("var Integer");
        System.out.println("Nilai varInteger sekarang = " + varInteger);
        }
    
// metode bertipe void, tanpa parameter
        
        static void sayHello() {
            System.out.println("Hello ini dari metode bertipe void, tanpa parameter");
        }
        
// metode bertipe void, dengan parameter
        static void sayHelloTo(String nama) {
            System.out.println("Hello "+ nama +", Metode bertipe void, dengan parameter");
        }
        
// metode untuk input nilai integer
        static int inputNilaiInteger(String namaVariabel) {
            Scanner inputScanner = new Scanner(System.in);
            int nilaiInput;
            System.out.println("Silahkan input nilai untuk variabel"+ namaVariabel);
            nilaiInput = inputScanner.nextInt();
            return nilaiInput;
           
    }
    
}
