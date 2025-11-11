/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter4;

import java.util.Date;

/**
 *
 * @author macbook
 */
public class EqualityOp {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        System.out.println("str == str2 "+(str == str2));
        System.out.println("str == str3 "+(str == str3));
        
        System.out.println("str.equals(str3 ) "+(str.equals(str3)));
        
        Date d1 = new Date();
        Date d2 = new Date();
        
        System.out.println("d1 == d2 "+ (d1 == d2 ));
        
        int a = 2;
        int b = 2 ;
        float c = 2.0F;
        
        System.out.println("a==b "+(a==b));
        System.out.println("a ==c "+(a==c));
        System.out.println("a != c "+(a !=c));
        //System.out.println("a ==false "+(a==false));
        
        float d = Float.NaN;
        System.out.println("d== d "+(d==d));
        System.out.println("isNaN "+Float.isNaN(d));
        
        float e = 0/0.0f;
        System.out.println("e is "+e);
        
    }
}
