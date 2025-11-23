/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter7;

/**
 *
 * @author macbook
 */
class ConsoleTwo
{ 
    void print()
    {
        System.out.println("Zero version");
    }
    void print(String str)
    {
        System.out.println("String version");
        System.out.println(str);
    }
    void print(boolean b)
    {
        System.out.println("Boolean version");
        System.out.println(b);
    }
    void print(String str, boolean b)
    {
        System.out.println("Two argument String, boolean "+str + b);
    }
    void print(boolean b, String str)
    {
        System.out.println("Two argument boolean,String "+str + b);
    }
}
public class WhyOverload { 
    public static void main(String[] args) {
        ConsoleTwo console = new ConsoleTwo();
        String str = "Hello";
        boolean flag = false;
        
        console.print(str);
        console.print(flag);
        
        console.print();
    }
}
