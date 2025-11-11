/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter5;

import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class NumberToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number");
        int num = scanner.nextInt();
        
        if(num==0)
            System.out.println("Zero");
        else if(num==1)
            System.out.println("One");    
        else if(num==2)  
            System.out.println("Two");
        else
            System.out.println("Others");
                
            
        
    }
}
