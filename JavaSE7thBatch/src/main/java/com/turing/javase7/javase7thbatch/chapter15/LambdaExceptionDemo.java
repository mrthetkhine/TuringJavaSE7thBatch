/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter15;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
interface DoubleNumericFun
{
    double func(double[]n)throws EmptyArrayException;
} 
public class LambdaExceptionDemo {
    public static void main(String[] args) {
        double[] arr = new double[]{1,2,3,4};
        
        DoubleNumericFun doubleFun = (doubleArr)->{
            double average = 0;
            if(doubleArr.length==0)
            {
                throw new EmptyArrayException("Array is empty");
            }
            else
            {
                for (double item : doubleArr) {
                    average += item;
                }
                average /= doubleArr.length;
            }
            return average;
        };
        try {
            System.out.println("Average "+doubleFun.func(arr));
            System.out.println("Average 2 "+doubleFun.func(new double[]{}));
        } catch (EmptyArrayException ex) {
            System.out.println("Ex "+ex.getMessage());
        }
    }
}
