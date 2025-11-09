/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        int b = a ++;//post fix
        System.out.println("A "+a);
        System.out.println("B "+b);
        
        b = ++ a;
        System.out.println("A "+a);
        System.out.println("B "+b);
        
        --a;
        ++a;
    }
}
