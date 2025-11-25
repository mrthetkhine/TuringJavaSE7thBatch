/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter10;

/**
 *
 * @author macbook
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        
        System.out.println("Before division");
        
        
        try
        {
           int result = 10 / 10;
            String str = "hello";
            str = null;
            System.out.println("After division "+result);

            System.out.println("ToUppercase "+str.toUpperCase());
        }
        /*
        catch(ArithmeticException e)
        {
            System.out.println("AE "+e.getMessage());
            System.out.println("Handle exception");
        }
        
       
        catch(NullPointerException ne)
        {
            System.out.println("NullPoninter exception");
        }*/
        catch(Exception e)
        {
            System.out.println("Catch every exception "+e.getMessage());
        }
        finally
        {
            System.out.println("Finally always executed");
        }
        
        
        System.out.println("Done");
    }
}
