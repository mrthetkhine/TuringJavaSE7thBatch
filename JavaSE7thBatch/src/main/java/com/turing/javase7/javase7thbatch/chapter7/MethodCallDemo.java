/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter7;

/**
 *
 * @author macbook
 */
class Caller
{
    void method1()
    {
        System.out.println("Method 1");
        this.method2();
        System.out.println("Back to method 1");
    }
    void method2()
    {
        System.out.println("Method 2");
        this.method3();
        System.out.println("Back to method 2");
    }
    void method3()
    {
        System.out.println("Method 3");
    }
}
public class MethodCallDemo {
    public static void main(String[] args) {
        Caller caller = new Caller();
        caller.method1();
    }
}
