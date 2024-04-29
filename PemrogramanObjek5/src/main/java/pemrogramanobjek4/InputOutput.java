/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemrogramanobjek4;

/**
 *
 * @author DKID
 */

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // Deklarasi Variabel
        char huruf;
        boolean isMasihBelajar;
        byte nilaiUjian;
        double hargaBarang;
        float diskon;
        byte umur;
        short nomerInduk;
        long populasiNegara;
        String namaLengkap;

        // Membuat objek Scanner untuk scanner data 
        Scanner scanner = new Scanner(System.in);

        // Input data karakter
        System.out.println("Masukkan karakter : ");
        huruf = scanner.next().charAt(0);

        // Input data boolean
        System.out.println("Apakah anda masih belajar : ");
        isMasihBelajar = scanner.nextBoolean();

        // Input data byte
        System.out.println("Masukkan Nilai Ujian : ");
        nilaiUjian = scanner.nextByte();

        // Input data double
        System.out.println("Masukkan harga barang : ");
        hargaBarang = scanner.nextDouble();

        // Input data float 
        System.out.println("Masukkan harga diskon : ");
        diskon = scanner.nextFloat();

        // Input data integer
        System.out.println("Masukkan Umur : ");
        umur = scanner.nextByte();

        // Input data short
        System.out.println("Masukkan nomer induk : ");
        nomerInduk = scanner.nextShort();

        // Input data long
        System.out.println("Masukkan populasi negara : ");
        populasiNegara = scanner.nextLong();

        // Input data String
        System.out.println("Masukkan nama lengkap : ");
        scanner.nextLine(); // Menangkap newline yang tersisa
        namaLengkap = scanner.nextLine();

        // Mencetak hasil inputan 
        System.out.println("Huruf : " + huruf);
        System.out.println("Apakah anda masih belajar : " + isMasihBelajar);
        System.out.println("Nilai Ujian : " + nilaiUjian);
        System.out.println("Harga Barang : " + hargaBarang);
        System.out.println("Harga Diskon : " + diskon);
        System.out.println("Umur : " + umur);
        System.out.println("Nomer Induk : " + nomerInduk);
        System.out.println("Populasi Negara : " + populasiNegara);
        System.out.println("Nama Lengkap : " + namaLengkap);
    }
}

  
