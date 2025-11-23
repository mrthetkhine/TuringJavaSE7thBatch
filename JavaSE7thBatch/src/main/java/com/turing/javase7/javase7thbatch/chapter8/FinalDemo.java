/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter8;

/**
 *
 * @author macbook
 */
final class LastClass
{
}
class Parent
{
    final void method()
    {
        System.out.println("That is final");
    }
}
class Child extends Parent
{
    /*
    void method()
    {
        System.out.println("Method");
    }*/
    void method(String message)
    {
        System.out.println("Method "+message);
    }
}
/*
class Child extends LastClass
{
}*/
public class FinalDemo {
    public static void main(String[] args) {
        
    }
}
