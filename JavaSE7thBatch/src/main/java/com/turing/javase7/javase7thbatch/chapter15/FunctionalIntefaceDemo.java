/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter15;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;
/**
 *
 * @author macbook
 */
public class FunctionalIntefaceDemo {
    static int inc(int a)
    {
        return a + 1;
    }
    static int add(int x,int y)
    {
        return  x+ y;
    }
    static int sub(int x,int y)
    {
        return  x- y;
    }
    static void doSomething(int i)
    {
        System.out.println("Do Something on i ");
    }
    static String greet()
    {
        System.out.println("Greet");
        return "Hello";
    }
    static int getLength(String str)
    {
        return str.length();
    }
    static boolean isEven(int number)
    {
        return number % 2 == 0;
    }
    public static void main(String[] args) {
        UnaryOperator<Integer> unary = FunctionalIntefaceDemo::inc;
        System.out.println("Unary "+unary.apply(10));
        
        BinaryOperator<Integer> binary = FunctionalIntefaceDemo::add;
        System.out.println("Binary "+binary.apply(10, 2));
        
        binary = FunctionalIntefaceDemo::sub;
        System.out.println("Binary "+binary.apply(10, 2));
        
        Consumer<Integer> consumer = FunctionalIntefaceDemo::doSomething;
        System.out.println("Consumer ");
        consumer.accept(100);
        
        Supplier<String> supplier = FunctionalIntefaceDemo::greet;
        System.out.println("Supplier "+supplier.get());
        
        Function<String,Integer> function = FunctionalIntefaceDemo::getLength;
        System.out.println("Fun "+function.apply("Hello"));
        
        Predicate<Integer> pred = FunctionalIntefaceDemo::isEven;
        System.out.println("Predicate "+pred.test(4));
    }
}
