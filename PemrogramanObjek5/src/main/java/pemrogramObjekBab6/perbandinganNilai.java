/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pemrogramObjekBab6;

import java.util.Scanner;

/**
 *
 * @author DKID
 */
public class perbandinganNilai {
    public static void main(String[] args) {
        int variabel1 = inputNilaiInteger("variabel1");
        int variabel2 = inputNilaiInteger("variabel2");
        int variabel3 = inputNilaiInteger("variabel3");
        int batasBawah = inputNilaiInteger("batasBawah");
        int batasAtas = inputNilaiInteger("batasAtas");
     
        if (variabel1 < variabel2) {
            System.out.println("variabel1 = "+ variabel1 + "kurang dari batasBawah yang bernilai "+ batasBawah);
        }
        
        if ((variabel1 < batasBawah) && (variabel1 < batasAtas)) {
            System.out.println("variabel1 = " + variabel1 +"kurang dari batasBawah yang bernilai "+ batasBawah + "dan kurang dari batasAtas juga yang bernilai : "+batasAtas);
        }
        
        if (variabel1 <= batasBawah || variabel1 >= batasAtas) {
            System.out.println("variabel 1 nilainya tidak berada di antara batasBawah dan batasAtas");
        }
        
        if (variabel1 > variabel2 && variabel1 < variabel3) {
            System.out.println("variabel1 berada diantara nilai variabel2 dan variabel3");
        }
        
    }
        
        static int inputNilaiInteger(String namaVariabel) {
            Scanner inputScanner = new Scanner(System.in);
            int nilaiInput;
            System.out.println("Silahkan input nilai untuk variabel "+ namaVariabel);
            nilaiInput = inputScanner.nextInt();
            return nilaiInput;
    }
}


    
    

