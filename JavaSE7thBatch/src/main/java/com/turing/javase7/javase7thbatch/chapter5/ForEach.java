/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter5;

import java.util.Arrays;

/**
 *
 * @author macbook
 */
public class ForEach {
    public static void main(String[] args) {
        int []arr = {10,20,30,40};
        
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ele "+arr[i]);
            arr[i] *= 2;
        }
        
        for(final int ele : arr)//ele =arr[i];
        {
            System.out.println("Ele "+ele);
            //ele *= 2;

        }
        System.out.println("Array "+Arrays.toString(arr));
                
    }
}
