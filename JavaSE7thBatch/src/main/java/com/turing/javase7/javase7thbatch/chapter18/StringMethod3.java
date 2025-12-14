/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter18;

import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class StringMethod3 {
    public static void main(String[] args) {
        String str = String.join(":", "Apple","Orange","Banana");
        System.out.println("Str "+str);
        
        String[]arr = str.split(":");
        for(String item : arr)
        {
            System.out.println("Item "+item);
        }
        
        System.out.println("A.charCodeAt(0) "+"A".codePointAt(0));
        
        str =" ";
        System.out.println("isBlank "+str.isBlank());
        System.out.println("isEmpty "+ str.isEmpty());
        
        str = "Apple\r\nOrange";
        Stream<String> lines = str.lines();
        lines.forEach(System.out::println);
        
        str = "Hello World Hello";
        System.out.println("Str.replaceFirst "+str.replaceFirst("Hello", "Hi"));
        System.out.println("Str.replaceAll "+str.replaceAll("Hello", "Hi"));
    }
}
