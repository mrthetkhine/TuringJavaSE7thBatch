/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter9;

/**
 *
 * @author macbook
 */
interface MyInf
{
    static void method()
    {
        System.out.println("Method");
    }
}
public class InterfaceStaticMethod {
    public static void main(String[] args) {
        MyInf.method();
    }
}
