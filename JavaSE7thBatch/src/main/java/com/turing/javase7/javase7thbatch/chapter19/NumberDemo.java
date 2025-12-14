/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter19;

/**
 *
 * @author macbook
 */
public class NumberDemo {
    public static void main(String[] args) {
        Number num = Double.valueOf("20");
        num = Integer.valueOf("123");
        
        System.out.println("Num "+num);
        
        String data = " 234";
        float f;
        f = Float.parseFloat(data);
        //f = Float.valueOf(data);
        System.out.println("F "+f);
        
        data = "234FF";
        num = Integer.parseInt(data,16);
        //num = Integer.parseInt(data);
        System.out.println("Num "+num);
        
        Double d1 = Double.valueOf(1/0.);
        Double d2 = Double.valueOf(0/0.);
        
        System.out.println("D1 "+d1);
        System.out.println("D2 "+d2);
        
        System.out.println("Is InFinite "+d1.isInfinite());
        System.out.println("isNaN "+Double.isNaN(d2));
        System.out.println("NaN == NaN "+(d2.doubleValue() ==d2.doubleValue()));
    }
}
