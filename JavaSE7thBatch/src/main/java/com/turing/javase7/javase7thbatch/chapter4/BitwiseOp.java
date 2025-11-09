/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter4;

/**
 *
 * @author macbook
 */
public class BitwiseOp {
    public static void main(String[] args) {
        int a = 2;//10
        int b = 3;//11
        
        System.out.println("A "+ Integer.toBinaryString(a));
        System.out.println("B "+ Integer.toBinaryString(b));
        /*
        AND 
        0 0 => 0
        0 1 => 0
        1 0 => 0
        1 1 => 1
        */
        /*
        10
        11
        10
        */
        System.out.println("a & b "+ Integer.toBinaryString(a & b));
         /*
        OR 
        0 0 => 0
        0 1 => 1
        1 0 => 1
        1 1 => 1
        */
         /*
        10
        11
        11
        */
         
        System.out.println("a | b "+ Integer.toBinaryString(a | b));
        /* XOR 
        0 0 => 0
        0 1 => 1
        1 0 => 1
        1 1 => 0
        */
         /*
        10
        11
        01
        */
         
        System.out.println("a ^ b "+ Integer.toBinaryString(a ^ b));
        System.out.println("~a "+ Integer.toBinaryString(~a ));
        System.out.println("a<<1 "+ Integer.toBinaryString(a<<1 ));
        System.out.println("a>>1 "+ Integer.toBinaryString(a>>1 ));
        
        a = 8;
        a<<= 2;//2^2=4 , 8 *4
        System.out.println("A "+a);
    }
}
