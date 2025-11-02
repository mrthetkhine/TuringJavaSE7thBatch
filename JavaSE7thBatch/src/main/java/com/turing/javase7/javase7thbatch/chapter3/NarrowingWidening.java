/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter3;

/**
 *
 * @author macbook
 */
public class NarrowingWidening {
    public static void main(String[] args) {
        byte b = 12;
        byte c = (byte)(b + b);
        
        System.out.println("C "+c);
        
        int a =10;
        b = (byte)a;
        System.out.println("B "+b);
        
        
        float price = 1.2f;//4 byte
        price = a;
        
        //a = price;
        double amount = 1.2;//8 byte
        
        //price = amount;
        amount = price;
        
        long longData = 122;
        //longData = amount;
    }
}
