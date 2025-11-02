/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class CharacterDemo {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println("Ch "+ch);
        
        ch ++;
        System.out.println("Ch "+ch);
        
        int codePoint = ch;
        
        System.out.println("Codepoint "+codePoint);
        
        codePoint = 97;
        ch = (char) codePoint;
        
        System.out.println("Ch "+ch);
    }
}
