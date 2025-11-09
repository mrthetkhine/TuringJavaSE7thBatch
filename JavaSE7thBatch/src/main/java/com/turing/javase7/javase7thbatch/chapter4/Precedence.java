/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class Precedence {
    public static void main(String[] args) {
        int result = 1 + 2 * 3;
        System.out.println("Result "+result);
        
        
        int a = 10;
        int b = 3;
        float c = 3.0f;
        System.out.println(a+" + "+b +" " + (a+b));
        System.out.println(a+" - "+b +" "+ (a-b));
        System.out.println(a+" * "+b +" "+ (a*b));
        System.out.println(a+" / "+b +" "+ (a/b));//integer division
        System.out.println(a+" / "+c +" "+ (a/c));//floating point division
        System.out.println(a+" % "+b +" "+ (a%b));
        
        //result = 3/0;
        
        float d = a /0.0f;
        System.out.println("D "+d);
        
        a = -10;
        result= +a;
        System.out.println("Result "+result);
        
        float price = 2.1F;
        int qty = 10;
        float total = price * qty;
        System.out.println("Total "+total);
    }
}
