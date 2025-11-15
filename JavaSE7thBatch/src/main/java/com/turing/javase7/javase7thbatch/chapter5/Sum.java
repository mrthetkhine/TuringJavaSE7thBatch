/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter5;

/**
 *
 * @author macbook
 */
public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        
        /*
        sum += 1;
        sum += 2;
        sum += 3;
        sum += 4;
        sum += 5;
        */
        int i=1;
        while (i <=100)
        {
            sum += i;
            i++;
        }
        
        System.out.println("Sum "+sum);
    }
}
