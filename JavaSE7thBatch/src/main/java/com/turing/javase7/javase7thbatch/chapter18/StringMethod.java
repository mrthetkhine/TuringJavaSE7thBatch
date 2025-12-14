/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class StringMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        
        System.out.println("charAt(0) "+str.charAt(0));
        System.out.println("chatAt(length-1) "+str.charAt(str.length()-1));
        
        char[]chArr = new char[5];
        str.getChars(0, 5, chArr, 0);
        
        String str2 = new String(chArr);
        System.out.println("Str2 "+str2);
        
        byte[]data = str.getBytes();
        System.out.println("Bytes "+data);
        
        chArr = str.toCharArray();
        System.out.println("chArr "+chArr);
        
        System.out.println("Equals "+ "hi".equals("Hi"));
        System.out.println("Equals "+ "hi".equalsIgnoreCase("Hi"));
        
        System.out.println("Region match "+ str.regionMatches(0, "Hell", 0, 4));
        
        System.out.println("str.startWith Hell "+str.startsWith("Hell"));
        System.out.println("str.endWith World "+str.endsWith("World"));
        
        
        System.out.println("A.compareToB "+ "A".compareTo("B"));
        System.out.println("B.compareToA "+ "B".compareTo("A"));
        System.out.println("A.compareToA "+ "A".compareTo("A"));
    }
}
