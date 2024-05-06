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
public class strukturKontrol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          
        short umur = 0;
        System.out.println("How old are you : ");
        
        input.nextShort();
        System.out.println("You are : ");
        
        if (umur < 13) {
            System.out.println("\ttoo young create a Facebook account");
        }
        
        if (umur < 16) {
            System.out.println("\ttoo young to get a driver's license");
        }
        
        if (umur <= 18) {
            System.out.println("\ttoo young to marry someone");
        }
        
        if (umur < 35) {
            System.out.println("\ttoo young to run for President RI");
            System.out.println("\t\t(How Sad!)");
        }
        
        if (umur >= 50) {
            System.out.println("\tIf you are middle-aged, be careful with culinary delights");
        }
    }
    
}
