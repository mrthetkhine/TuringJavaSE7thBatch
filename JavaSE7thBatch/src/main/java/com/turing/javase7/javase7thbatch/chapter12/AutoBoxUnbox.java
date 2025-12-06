/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter12;

/**
 *
 * @author macbook
 */
public class AutoBoxUnbox {
    static void inc(Integer c)
    {
        c++;
    }
    public static void main(String[] args) {
        int a = 100;
        Integer i = a;//wrapper<-primitive,autoboxing
        
        a = i; //uboxing primitve<-wrapper
        
        i = 128;
        a = i;
        System.out.println("a == i "+( a == i));
        
        
        inc(a);//autoboxing
        System.out.println("A "+a);
        
        inc(i);
        //c = i;
        Integer c = i;
        c++;
        System.out.println("c "+c);
        System.out.println("i "+i);
    }
    
}
