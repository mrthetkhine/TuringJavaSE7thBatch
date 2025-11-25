/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter9;

/**
 *
 * @author macbook
 */
interface MyInterface
{
    default void greet()
    {
        System.out.println("Greet");  
    }
}
class Greeting implements MyInterface
{
    public void greet()
    {
        System.out.println("Override greet");
    }
}
public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyInterface greet = new Greeting();
        greet.greet();
        
        
    }
}
