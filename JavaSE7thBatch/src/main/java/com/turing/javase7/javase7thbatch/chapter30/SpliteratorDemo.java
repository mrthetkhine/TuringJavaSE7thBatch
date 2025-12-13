/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        Stream<Integer> stream = numbers.stream();
        Spliterator<Integer> iterator = stream.spliterator();
        
        while(iterator.tryAdvance(n->{
            System.out.println("Item "+n); 
        }));
    }
}
