/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class RelationalExample {
    public static void main(String[] args) {
        int a = 10;
        int b =20;
        int c = 10;
        
        System.out.println("10==10 "+(10==10));
        System.out.println("10 == 10.0 "+(10==10.0));
        System.out.println("10 > 5 "+(10>5));
        System.out.println("10 < 5 "+(10 < 5));
        System.out.println("10 >= 10 "+(10 >= 10));
        System.out.println("10 <= 10 "+(10 <= 10));
        System.out.println("10 != 10 "+(10 != 10));
        System.out.println("10 != 5 "+(10 != 5));
        
        float d = Float.NaN;
        System.out.println("NaN == NaN "+(d == d));
        System.out.println("NaN > NaN "+(d > a));
        System.out.println("NaN != NaN "+(d != d));
    }
}
