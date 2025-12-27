/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter21;

import java.util.BitSet;

/**
 *
 * @author macbook
 */
public class BitSetDemo {
    public static void main(String[] args) {
        int a= 2;//10
        int b = 3;//11
        System.out.println("A "+Integer.toBinaryString(a));
        System.out.println("B "+Integer.toBinaryString(b));
        
        BitSet b1 = new BitSet(5);
        b1.set(1);
        
        BitSet b2 = new BitSet(5);
        b2.set(0);
        b2.set(1);
        
        b2.and(b1);
        System.out.println("B2 "+b2);
    }
}
