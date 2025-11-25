/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter10;

/**
 *
 * @author macbook
 */
public class ThrowDemo {
    int div(int a ,int b)
    {
        if(b == 0)
        {
            throw new RuntimeException("DIVISION BY ZERO");
        }
        else
        {
            return a/b;
        }
    }
    public static void main(String[] args) {
        ThrowDemo obj = new ThrowDemo();
        
        System.out.println("Before division");
        try
        {
            int result  = obj.div( 10,0);
            System.out.println("Result "+result);
        }
        catch(RuntimeException re)
        {
            System.out.println("Re "+re.getMessage());
        }
        
        
        
    }
}
