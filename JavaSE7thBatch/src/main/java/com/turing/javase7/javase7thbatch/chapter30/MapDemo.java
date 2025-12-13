/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter30;

import java.util.ArrayList;

/**
 *
 * @author macbook
 */
public class MapDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        numbers
               .stream()
                .map(x->x*2)
                .forEach(System.out::println);
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Hi");
        items.add("Banana");
        
        System.out.println("");
        items 
             .stream()
             .map(str->str.length())
             .forEach(System.out::println);
        
    }
}
