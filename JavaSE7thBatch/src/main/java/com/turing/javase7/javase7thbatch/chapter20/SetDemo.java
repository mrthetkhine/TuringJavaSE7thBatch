/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter20;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author macbook
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        
        set.add("banana");
        set.add("apple");
        set.add("mango");
        set.add("banana");
        
        set.forEach(System.out::println);
        System.out.println("Size "+set.size());
        
        System.out.println("Contains "+set.contains("apple"));
        
    }
}
