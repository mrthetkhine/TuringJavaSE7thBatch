/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter3;

import java.util.Arrays;

/**
 *
 * @author macbook
 */
public class ArrayInitialization {
    public static void main(String[] args) {
        
        //index 0-> length-1
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] =30;
        arr[3] = 40;
        arr[4] = 50;
        
        System.out.println("Arrays.toString "+Arrays.toString(arr));
        //System.out.println("Index[5 ]"+arr[-5]);
    }
}
