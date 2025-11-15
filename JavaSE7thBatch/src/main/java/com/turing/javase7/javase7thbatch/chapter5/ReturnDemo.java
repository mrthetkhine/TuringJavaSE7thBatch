/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class ReturnDemo {
    static void method()
    {
        for (int i = 0; i < 10; i++) {
            if(i==5)
            {
                return;
            }
            System.out.println("Item "+i);
        }
        System.out.println("End of loop");
    }
    public static void main(String[] args) {
        System.out.println("Before method");
        method();
        System.out.println("After method");
    }
}
