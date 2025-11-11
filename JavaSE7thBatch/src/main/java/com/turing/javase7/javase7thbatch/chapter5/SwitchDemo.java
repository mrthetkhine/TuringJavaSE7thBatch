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
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number");
        int num = scanner.nextInt();
        
        //float f = 1.3f;
        
        //String str ="Hello";
        switch(num)
        {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
            case 4:
                System.out.println("Three or Four");
                break;
            default:
                System.out.println("Others");
        }
       
    }
}
