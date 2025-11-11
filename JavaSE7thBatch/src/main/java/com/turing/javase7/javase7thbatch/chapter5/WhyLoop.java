/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class WhyLoop {
    public static void main(String[] args) {
        /*
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        */
        int i = 0;
        while(i < 5)//condition
        {
            System.out.println("Hello "+i);
            i++;//step
        }
        System.out.println("End "+i);
    }
    
}
