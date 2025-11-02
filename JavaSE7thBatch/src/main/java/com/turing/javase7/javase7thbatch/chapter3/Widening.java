/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class Widening {
    public static void main(String[] args) {
        int a = 10;
        byte b =2;
        
        int c = a + b;//b->byte->int
        //auto ->coercion
        //manual-> type cast
        System.out.println("C "+c);
        
        b = (byte)a;//narrowing, typecast
        
        boolean flag = true;
        //b = (byte) flag;
        b =(byte)( b + 2);
        // b = (int)b + 2;
    }
}
