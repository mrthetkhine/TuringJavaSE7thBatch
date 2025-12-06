/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter12;

/**
 *
 * @author macbook
 */
public class WrapperDemo {
    public static void main(String[] args) {
        int i = 10;//Primitive
        Integer i2 = 1200;//object,wrapper 
        
        Character ch = 'A';
        Boolean b = false;
        
        i2++;
        System.out.println("I2 "+i2);
        System.out.println("Byte Value "+i2.byteValue());
        System.out.println("Int Value "+i2.intValue());
        
        Integer i3 = Integer.valueOf("100");
        System.out.println("I3 "+i3);
        
        Integer i4 = new Integer(100);
        System.out.println("i4 "+i4);
        
        System.out.println("i3== i4 "+(i3==i4));
    }
}
