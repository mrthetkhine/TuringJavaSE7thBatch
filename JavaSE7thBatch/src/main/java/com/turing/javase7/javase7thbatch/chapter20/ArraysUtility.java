/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter20;

import java.util.Arrays;

/**
 *
 * @author macbook
 */
public class ArraysUtility {
    public static void main(String[] args) {
        int[]arr = {1,10,11,12,5};
        
        Arrays.sort(arr);
        for(int item : arr)
        {
            System.out.println("Item "+item);
        }
        int index = Arrays.binarySearch(arr,11);
        System.out.println("Index "+index);
        
        int[] arr2 = new int[arr.length];
        arr2 = Arrays.copyOf(arr, arr.length);
        
        System.out.println("After copy ");
        for(int item : arr2)
        {
            System.out.println("Item2 "+item);
        }
        int[]arr3 ;
        arr3 = Arrays.copyOfRange(arr2, 0, 4);
        
        System.out.println("After copyRange ");
        for(int item : arr3)
        {
            System.out.println("Item3=> "+item);
        }
        
        System.out.println("Equals "+Arrays.equals(arr, arr2));
        System.out.println("Equals arr arr3 "+Arrays.equals(arr, arr3));
        
        int[]arr4 = new int[5];
        Arrays.fill(arr4,9);
        
        System.out.println("After fill ");
        for(int item : arr4)
        {
            System.out.println("Item4=> "+item);
        }
    }
}
