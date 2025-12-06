/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter12;

/**
 *
 * @author macbook
 */
public class Issue {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        Integer c= new Integer(100);
        
        System.out.println("a == b "+ (a == b));//same object (got from cache)
        System.out.println("a == c "+(a == c));//different object
        
        a = 128;
        b = 128;
        System.out.println("a == b "+ (a == b));//different object
        
        System.out.println("a.intValue "+ (a.intValue() == b.intValue()));
    }
}
