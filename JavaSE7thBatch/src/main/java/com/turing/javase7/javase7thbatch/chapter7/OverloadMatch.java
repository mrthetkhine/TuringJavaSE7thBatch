/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter7;

/**
 *
 * @author macbook
 */
class Overload
{
    //short ->int
    void print(int a)
    {
        System.out.println("Int version");
    }
    void print(byte a)
    {
        System.out.println("bye version");
    }
    /*
    short -int
    int-long
    */
    void print(long a)
    {
        System.out.println("long version");
    }
            
}
public class OverloadMatch {
    public static void main(String[] args) {
        Overload overload =new Overload();
        
        byte s = 10;
        overload.print(s);
        
        short st = 20;
        overload.print(st);
               
    }
}
