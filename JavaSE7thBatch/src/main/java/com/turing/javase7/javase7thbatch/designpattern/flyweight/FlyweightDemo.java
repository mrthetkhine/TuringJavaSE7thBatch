/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.designpattern.flyweight;

/**
 *
 * @author macbook
 */
public class FlyweightDemo {
    public static void main(String[] args) {
        Code code = new Code("1+2");
       
        Platform p = PlatformFlyweight.getPlatform("DotNet");
        p.execute(code);
        
        p = PlatformFlyweight.getPlatform("Java");
        p.execute(code);
        
        p = PlatformFlyweight.getPlatform("DotNet");
        p.execute(code);
        
        Integer i =123;
        
        String str1 = "Hello";
        String st2 = "Hello";
        
        System.out.println("str1== str "+(str1==st2));
    }
            
}
