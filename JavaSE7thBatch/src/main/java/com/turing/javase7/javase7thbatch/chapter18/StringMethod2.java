/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class StringMethod2 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("indexof in "+ str.indexOf("in"));
        System.out.println("indexof india "+ str.indexOf("india"));
        System.out.println("lastIndexOf in "+str.lastIndexOf("in"));
        
        System.out.println("Upper "+str.toUpperCase());
        System.out.println("Str "+str);
        
        System.out.println("SubString (3) "+str.substring(3));
        System.out.println("SubString (3,7) "+str.substring(3,7));
        
        String str2 = str.replace("Hello", "Hi");
        System.out.println("Str "+str);
        System.out.println("Str2 "+str2);
        
        String str3 = "   Hello World   ";
        System.out.println(">>"+str3.trim()+"<<");
        System.out.println(">>"+str3.strip()+"<<");
        System.out.println(">>"+str3.stripLeading()+"<<");
        System.out.println(">>"+str3.stripTrailing()+"<<");
        
        double total = 122;
        String str4 = String.valueOf(total);
  
        System.out.println("Str4 "+str4);
        
        str4 = 122F+"";
        System.out.println("Str4 "+str4);
    }
}
