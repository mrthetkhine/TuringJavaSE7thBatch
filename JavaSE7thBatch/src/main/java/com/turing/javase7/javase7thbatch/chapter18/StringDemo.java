/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter18;

/**
 *
 * @author macbook
 */
public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = null;
        
        String str3 = new String("Hello");
        System.out.println("Str toUpperCase "+str1.toUpperCase());
        
        System.out.println("str1 == str2 "+ (str1 == str2 ));
        System.out.println("str1 == str3 "+ (str1 == str3 ));
        
        System.out.println("Str1.equals "+str1.equals(str3));
        
        //System.out.println("Str2.equals "+ str2.equals("Hello"));
        System.out.println("Equals "+ "Hello".equals(str2));
        
        char []arr = {'H','i'};
        str3 = new String(arr);
        System.out.println("Str3 "+str3);
        
        byte[] data = {65,66,67};
        str3 = new String(data);
        System.out.println("Str3 "+str3);
        
        System.out.println("Str3 length "+str3.length());
        str3 = "မင်္ဂလာပါ";
        System.out.println("Str3 "+str3);
        System.out.println("Str3 length "+str3.length());
        
        str3 = str1 + str2 + " hi";
        System.out.println("Str3 "+str3);
    }
}
