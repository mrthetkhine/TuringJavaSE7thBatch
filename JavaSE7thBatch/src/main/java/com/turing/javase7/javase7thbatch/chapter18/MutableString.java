/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class MutableString {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long start = System.currentTimeMillis();
       /*

        String data = "";
        for(int i=0;i<100_000;i++)
        {
            data += i+",";
        }
        */
        StringBuilder buffer =new StringBuilder();
        for(int i=0;i<100_000;i++)
        {
            buffer.append( i+",");
        }
        String data = buffer.toString();
        
        long end = System.currentTimeMillis();
        long time = end-start;
        System.out.println("Time "+time);
        long freeMemory = runtime.freeMemory(); // Free memory within the current total allocated space
        long totalMemory = runtime.totalMemory();
        
        System.out.println("Total "+totalMemory);
        System.out.println("Free "+freeMemory);
    }
}
