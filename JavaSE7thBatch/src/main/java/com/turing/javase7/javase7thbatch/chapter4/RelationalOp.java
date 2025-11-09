/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter4;

import java.util.Scanner;

/**
 *
 * @author macbook
 */
public class RelationalOp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number");
        int num = scanner.nextInt();
        
        if(num % 2 == 0 )
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
