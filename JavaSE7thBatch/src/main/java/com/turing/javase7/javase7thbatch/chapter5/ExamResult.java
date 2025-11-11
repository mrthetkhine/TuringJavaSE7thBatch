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
public class ExamResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter myan ");
        int myan = scanner.nextInt();
        
        System.out.println("Enter eng ");
        int eng = scanner.nextInt();
        
        if(myan >= 40)
        {
            if( eng >= 40)
            {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Failed");
            }
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
