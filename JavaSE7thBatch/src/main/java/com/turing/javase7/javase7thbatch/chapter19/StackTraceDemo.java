/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter19;

/**
 *
 * @author macbook
 */
public class StackTraceDemo {
    static void methodA()
    {
        System.out.println("Method A");
        methodB();
    }
    static void methodB()
    {
        System.out.println("Method B");
        methodC();
    }
    static void methodC()
    {
        System.out.println("Method C");
        StackTraceElement[] stackTraces = Thread.currentThread().getStackTrace();
        for(StackTraceElement trace : stackTraces)
        {
            System.out.println("Method--> "+trace.getMethodName());
        }
    }
    public static void main(String[] args) {
        methodA();
    }
}
