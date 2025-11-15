/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class BreakDemo {
    public static void main(String[] args) {
        /*
        int i = 0;
        for (; i < 10; i++) {
            System.out.println("I is "+i);
            if(i == 5)
            {
                break;
            }
        }
        System.out.println("End of loop i => "+i);
        */
        outer:for (int i = 0; i < 5; i++) {
            System.out.println("Outer i==> "+i);
            
            for (int j = 0; j < 3; j++) {
                System.out.println("Inner j "+j);
                if( i == 2)
                {
                    break outer;
                }
            }
        }
    }
}
