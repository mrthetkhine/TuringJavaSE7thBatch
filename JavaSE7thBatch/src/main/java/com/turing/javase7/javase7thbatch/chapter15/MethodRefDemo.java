/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter15;

/**
 *
 * @author macbook
 */
interface Arith
{
    int binaryOp(int a, int b);
}


class MyClass
{
    int add(int a, int b)
    {
        return a+b;
    }
    <T extends Number> T min(T a,T b)
    {
        return a.doubleValue() < b.doubleValue()? a : b;
    }
}
public class MethodRefDemo {
    public static void main(String[] args) {
        Arith arith = Math::min;
        System.out.println("Arith "+arith.binaryOp(10, 2));
        
        MyClass obj = new MyClass();
        arith = obj::add;
        System.out.println("Arith "+arith.binaryOp(10, 2));
        
        arith = obj::<Integer>min;
        System.out.println("Arith min "+arith.binaryOp(10, 2));
    }
}
