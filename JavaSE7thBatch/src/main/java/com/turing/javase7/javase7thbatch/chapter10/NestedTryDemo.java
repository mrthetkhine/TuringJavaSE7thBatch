/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter10;

/**
 *
 * @author macbook
 */
public class NestedTryDemo {
    public static void main(String[] args) {
        try
        {
            int result = 10 / 0;
            String str = "hello";
            str = null;
            try
            {
                System.out.println("After division "+result);

                System.out.println("ToUppercase "+str.toUpperCase());
            }
            catch(Exception e)
            {
                System.out.println("Inner catch "+e.getMessage());
            }
        }
        
        catch(Exception e)
        {
            System.out.println("Outer catch every exception "+e.getMessage());
        }
        finally
        {
            System.out.println("Finally always executed");
        }
        
        
        System.out.println("Done");
    }
}
