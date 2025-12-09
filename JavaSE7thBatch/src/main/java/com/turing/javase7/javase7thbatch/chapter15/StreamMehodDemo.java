/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author macbook
 */
//x->boolean
interface Predicate
{
    boolean check(int x);
}

public class StreamMehodDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        /*
        boolean predicate(Integer x)
        {
            return x%2==0;
        }
        */
        Predicate isEven = (x)->x%2 ==0;
        System.out.println("isEven (3) "+isEven.check(3));
        System.out.println("isEven (4) "+isEven.check(4));
        
        List<Integer> evenList = list.stream()
                                          .filter((x)->x%2==0)
                                          .collect(Collectors.toList());
        evenList.forEach(System.out::println);
        
    }
}
