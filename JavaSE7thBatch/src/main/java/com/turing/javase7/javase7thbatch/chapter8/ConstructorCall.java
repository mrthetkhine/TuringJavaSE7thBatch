/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter8;

/**
 *
 * @author macbook
 */
class Root
{
    public Root()
    {
        System.out.println("Root Constructor");
    }
    static
    {
        System.out.println("Root static");
    }
}
class Child1 extends Root
{
    public Child1()
    {
        //super();
        System.out.println("Child 1 constructor");
    }
    static
    {
        System.out.println("Child1 static");
    }
}
public class ConstructorCall {
    public static void main(String[] args) {
        Child1 c1 =new Child1();
    }
}
