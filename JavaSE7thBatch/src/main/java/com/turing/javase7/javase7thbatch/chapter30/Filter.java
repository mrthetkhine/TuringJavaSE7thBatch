/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author macbook
 */
public class Filter {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(-4);
        numbers.add(5);
        /*
        ArrayList<Integer> list = new ArrayList<>();
        for(final int item : numbers)
        {
            if(item %2 ==0)
            {
                list.add(item);
            }
        }
        list.forEach(System.out::println);  
        */
        Predicate<Integer> isEven = (x)->x%2==0;
        Stream<Integer> stream  = numbers.stream();
        /*
        stream.filter(isEven)
               .forEach(item->{
                   System.out.println("Even "+item);
               });     
        */
        stream.filter(isEven.negate())
               .forEach(item->{
                   System.out.println("Odd "+item);
               });
        stream = numbers.stream();
        Optional<Integer> minResult = stream.min(Integer::compare);
        System.out.println("Min "+minResult.get());
        
        stream = numbers.stream();
        Optional<Integer> maxResultResult = stream.max(Integer::compare);
        System.out.println("Max "+maxResultResult.get());
        
        System.out.println("Sorted ");
        numbers.stream()
               .sorted()
               .forEach(item->{
                   System.out.println("sorted item "+item);
               });
    }
}
