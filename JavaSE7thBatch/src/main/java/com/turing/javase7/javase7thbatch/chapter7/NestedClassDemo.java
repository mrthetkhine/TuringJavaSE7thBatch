/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter7;

/**
 *
 * @author macbook
 */
class Outer
{
    int outer_x = 100;
    
    void test()
    {
        Inner in = new Inner();
        in.display();
        System.out.println("Y "+in.y);
    }
    class Inner
    {
        int y = 10;
        void display()
        {
            System.out.println("Inner display "+outer_x);
           
        }
    }
}
public class NestedClassDemo {
    public static void main(String[] args) {
        //Outer.Inner inner = new Outer.Inner();
        Outer outer = new Outer();
        outer.test();
        
        Integer integer;
    }
}
