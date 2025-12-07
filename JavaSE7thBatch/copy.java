/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter13;

import java.util.Scanner;
import static java.lang.System.out;
/**
 *
 * @author macbook
 */
public class ReadConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name ;
        out.println("Enter your name ");
        name = scanner.next();
        
        
        int age ;
        out.println("Enter age ");
        age = scanner.nextInt();
        
        out.println("Your name is "+name);
        out.println("Age "+age);
    }
}
