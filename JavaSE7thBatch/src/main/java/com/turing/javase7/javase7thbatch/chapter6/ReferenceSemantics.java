/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter6;

/**
 *
 * @author macbook
 */
class Data
{
    int x;
}
public class ReferenceSemantics {
    public static void main(String[] args) {
        Data obj = new Data();
        obj.x = 10;
        
        Data obj2;
        obj2 = obj;
        obj2.x ++;
        
        System.out.println("Obj.x "+obj.x);
        System.out.println("Obj2.x "+obj2.x);
        System.out.println("Obj "+obj);
        System.out.println("Obj2 "+obj2);
        
        obj2 = new Data();
        obj2.x = 100;
        
        System.out.println("");
        System.out.println("Obj.x "+obj.x);
        System.out.println("Obj2.x "+obj2.x);
        System.out.println("Obj "+obj);
        System.out.println("Obj2 "+obj2);
    }
}
