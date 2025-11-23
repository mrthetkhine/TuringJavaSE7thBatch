/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class VariableLengthArg {
    static int sum(int a, int ...nums)//num[]
    {
        System.out.println("A is "+a);
        int total = 0;
        System.out.println("Length "+nums.length);
        for (int item : nums) {
            total += item;
        }
        return total;
    }
    public static void main(String[] args) {
        int result= sum(1,2);
        System.out.println("Result "+result);
        
        result = sum(3,4,5,6);
        System.out.println("Result "+result);
        
        result = sum(3);
        System.out.println("Result "+result);
    }
}
