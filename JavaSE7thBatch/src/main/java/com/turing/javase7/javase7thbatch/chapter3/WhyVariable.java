/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class WhyVariable {
    public static void main(String[] args) {
        
        int a = 8;
        int b = 3;
        
        System.out.println(" + "+ ( a + b ));
        System.out.println(" - "+ ( a - b ));
        System.out.println(" * "+ ( a * b ));
        System.out.println(" / "+ ( a / b ));
        
        a = a + 1;
        System.out.println("A is "+a);
        
        //a = false;
        Object obj = 3;
        obj = "Hello";
        obj = false;
    }
}
