/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter8;

/**
 *
 * @author macbook
 */
class Window95
{
    void boot()
    {
        System.out.println("Window boot");
        this.start();
    }
    void start()
    {
        System.out.println("Window 95 start");
        
    }
}
class Window98 extends Window95
{
    void start()
    {
        System.out.println("Window 98 start");
    }
    void newTheme()
    {
        System.out.println("Win98 Theme");
    }
}
        
public class WhyInheritance {
    public static void main(String[] args) {
        Window98 win = new Window98();
        win.boot();
        win.newTheme();
    }
}
