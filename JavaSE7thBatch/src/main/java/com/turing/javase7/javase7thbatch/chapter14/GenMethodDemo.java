/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter14;

/**
 *
 * @author macbook
 */
public class GenMethodDemo {
    static<T extends Number> boolean isIn(T[] arr,T ele)
    {
         
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].doubleValue() == ele.doubleValue())
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Integer[] arr =new Integer[]{1,2,3};
        
        System.out.println("Is In "+ GenMethodDemo.<Integer>isIn(arr, 3));
        System.out.println("Is In "+ GenMethodDemo.isIn(arr, 13));
    }
}
