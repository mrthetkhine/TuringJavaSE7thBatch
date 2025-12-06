/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter12;

/**
 *
 * @author macbook
 */
enum Size
{
    Small(0),
    Medium(10),
    Large(20);
    
    int value;
    Size(int value)
    {
        this.value = value;
    }
    int getValue()
    {
        return this.value;
    }
    
}
public class SizeDemo {
    public static void main(String[] args) {
        Size s1 = Size.Medium;
        Size s2 = Size.Large;
        
        System.out.println("S1 > S2 "+(s1.getValue() > s2.getValue()));
        
        System.out.println("Medium s1 "+s1.value);
        System.out.println("Large value s2 "+s2.value);
        
        System.out.println("s1 ordinal "+s1.ordinal());
        System.out.println("s2 ordinal "+s2.ordinal());
        
        System.out.println("s1.compareTo s2 "+s1.compareTo(s2));
        System.out.println("s2.compareTo s1 "+s2.compareTo(s1));
        System.out.println("s1.compareTo s1  "+s1.compareTo(s1));
    }
}
