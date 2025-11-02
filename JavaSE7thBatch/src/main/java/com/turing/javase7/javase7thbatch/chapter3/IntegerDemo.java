/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class IntegerDemo {
    public static void main(String[] args) {
        byte a = 10;
        a = -128;
        
        a --;//underflow
        System.out.println("A "+ a);
        
        a = 127;
        a ++;//overflow
        System.out.println("A "+ a);
        
        //a = 128;
        
        short b = -32768;
        b --;
        System.out.println("Short B "+b);
        
        b = 32767;
        b ++;
        System.out.println("Short B "+b);
        
        //a = b;
        b = a;
        
        boolean flag = false;
        //b = flag;
        
        int num = -2147483647;
        //int a;
        num --;
        System.out.println("Num "+num);
        
        long data = 12_3;
        data = num;
        data = b;
        data = a;
        
        //num = data;
    }
}
