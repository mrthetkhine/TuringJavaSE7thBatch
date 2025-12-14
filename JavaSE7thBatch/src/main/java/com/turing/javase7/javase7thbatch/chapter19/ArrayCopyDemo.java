/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter19;

import java.util.Arrays;

/**
 *
 * @author macbook
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2[] = new int[arr.length];
        
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        
        System.out.println("Arr2 "+Arrays.toString(arr2));
    }
}
