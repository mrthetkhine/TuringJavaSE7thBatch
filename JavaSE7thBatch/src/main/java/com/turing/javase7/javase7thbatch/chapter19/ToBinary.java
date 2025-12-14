/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter19;

/**
 *
 * @author macbook
 */
public class ToBinary {
    public static void main(String[] args) {
        int a = 3;
        System.out.println("3 in binary "+Integer.toBinaryString(a));
        
        char ch = 'A';
        System.out.println("is Letter "+Character.isLetter(ch));
        System.out.println("Letter or digit "+Character.isLetterOrDigit(ch));
        System.out.println("digit 3 "+Character.isDigit('3'));
    }
}
