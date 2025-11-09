/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class CompoundAssignment {
    public static void main(String[] args) {
        int a = 10;
        //a = a + 2;
        //a += 2;
        a += 2 + 3 ;//a =(type of a) a + (2+3)
        
        System.out.println("A "+a);
        
        byte b = 10;
        //b = b + 1;
        b += 1;
        //b = a + 1;
        b += a;
    }
}
