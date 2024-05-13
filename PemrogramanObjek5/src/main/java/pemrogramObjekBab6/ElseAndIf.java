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
public class ElseAndIf {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        byte age;
        byte cars;
        byte buses;
        
        System.out.println("How old are you ? ");
        age = input.nextByte();
        
        System.out.println ("Am I allowed to drive a car ? ");
        cars = input.nextByte();
        
        System.out.println("Am I allowed to drive buses ? ");
        buses = input.nextByte();
        
        if (cars > age)
        {
            System.out.println("we should take the cars.");
        }    
        if (cars < age)
        {
            System.out.println("we should not take the cars.");
        }else {
            System.out.println("we cant't decide.");
        }
        if (buses > cars)
        {
            System.out.println("That's too many buses.");    
        }
        else if (buses < cars)
        {
            System.out.println("Maybe we could take the buses.");
        }
        else 
        {
            System.out.println("we still can't decide.");
        }
        if (age > buses)
        {
            System.out.println("All right, let's just take the buses.");
        }else{
            System.out.println("Fine, let's stat home than.");
        }
    }
}