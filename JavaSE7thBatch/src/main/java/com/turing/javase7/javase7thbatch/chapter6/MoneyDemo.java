/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter6;

/**
 *
 * @author macbook
 */
class Money
{
    double value;
    
    public Money(double value)
    {
        this.value = value;
    }
    Money add(Money another)
    {
        Money result = new Money (this.value + another.value);
        return result;
    }
    Money subtract(Money another)
    {
        Money result = new Money (this.value - another.value);
        return result;
    }
}
public class MoneyDemo {
    public static void main(String[] args) {
        Money a = new Money(100);
        Money b = new Money(200);
        Money c = a.add(b);
        
        System.out.println("A "+a.value);
        System.out.println("B "+b.value);
        System.out.println("C "+c.value);
        
        c = b.subtract(a);
        
        System.out.println("");
        
        System.out.println("A "+a.value);
        System.out.println("B "+b.value);
        System.out.println("C "+c.value);
    }
}
