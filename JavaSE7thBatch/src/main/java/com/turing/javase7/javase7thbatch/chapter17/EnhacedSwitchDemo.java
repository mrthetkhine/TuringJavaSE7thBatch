/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter17;

import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class EnhacedSwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ;
        System.out.println("Enter number ");
        num = scanner.nextInt();
        
        switch(num)
        {
            /*
            case 1:
            case 2:
            case 3:
            */
            case 1,2,3:
                System.out.println("1 or 2 or 3");
                break;
            default:
                System.out.println("Others");
        }
    }
}
