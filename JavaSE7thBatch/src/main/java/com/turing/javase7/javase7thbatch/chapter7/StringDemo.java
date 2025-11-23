/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter7;

/**
 *
 * @author macbook
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = str.toUpperCase();
        
        System.out.println("Str "+str);
        System.out.println("Str2 "+str2);
        
        String str3 = str + str2;
        System.out.println("Str3 "+str3);
        
        long start = System.currentTimeMillis();
        str= "";
        StringBuffer buffer =new StringBuffer();
        for (int i = 0; i < 200_000; i++) {
            //str+= "hello";
            buffer.append("hello");
        }
        long end = System.currentTimeMillis();
        long time = (end-start);
        System.out.println("Time "+time);
    }
}
