/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class StaticDemo {
    int data = 100;
    
    void instanceMethod()
    {
        System.out.println("Instance method "+data);
        another();
    }
    static void hello()
    {
        System.out.println("Static hello ");
        another();
    }
    static void another()
    {
        System.out.println("Another");
    }
    public static void main(String[] args) {
        hello();
        StaticDemo demo = new StaticDemo();
        demo.instanceMethod();
    }
}
