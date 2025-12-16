/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter20;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author macbook
 */
public class ArrayProblem {
    public static void main(String[] args) {
        int []arr = new int[5];
        
        Arrays.fill(arr, 10);
        arr = new int[10];
        
        for(int item : arr)
        {
            System.out.println("Item "+item);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        
        list.add(30);
        list.add(40);
        
        list.forEach(System.out::println);
    }
}
