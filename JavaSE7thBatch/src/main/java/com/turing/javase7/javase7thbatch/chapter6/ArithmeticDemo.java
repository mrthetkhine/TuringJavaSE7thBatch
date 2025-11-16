/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter6;

/**
 *
 * @author macbook
 */
class Arithmetic
{
    int add(int a , int b)
    {
        System.out.println("A is "+ a + " B is "+b);
        return a + b;
    }
}
public class ArithmeticDemo {
    public static void main(String[] args) {
        Arithmetic ath = new Arithmetic();
        
        int result = ath.add(10, 20);
        // a = 10;
        // b = 20
        System.out.println("Result "+result);
    }
}
