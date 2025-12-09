/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter15;

/**
 *
 * @author macbook
 */
interface ArithGen<T extends Number>
{
    T op(T x, T y);
}
public class ArithGenDemo {
    public static void main(String[] args) {
        ArithGen<Integer> arithInt = (x,y)->x+y;
        
        System.out.println("arithInt 10,2 "+ arithInt.op(10, 2));
        
        ArithGen<Double> arithDbl = (x,y)->x+y;
        System.out.println(" arithDbl 10,3 "+ arithDbl.op(10.2, 10.4));
    }
}
