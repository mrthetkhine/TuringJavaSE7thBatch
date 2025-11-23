/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class Factorial {
    int fact(int n)
    {
        if(n ==0)
        {
            return 1;
        }
        else
        {
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        
        int result = obj.fact(3);
        System.out.println("Result "+result);
    }
}
