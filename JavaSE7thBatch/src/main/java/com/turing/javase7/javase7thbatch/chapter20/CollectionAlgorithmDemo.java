/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

/**
 *
 * @author macbook
 */
public class CollectionAlgorithmDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(-10);
        
        list2.add(1);
        list2.add(200);
        list2.add(300);
        list2.add(400);
        list2.add(500);
        
        
        int index = Collections.binarySearch(list, 4);
        System.out.println("Index "+index);
        
        //Collections.copy(list2, list);
        list2.forEach(System.out::println);
        
        System.out.println("Disjoint "+Collections.disjoint(list, list2));
        System.out.println("Max "+Collections.max(list));
        System.out.println("Min "+Collections.min(list));
        
        Collections.reverse(list);
        System.out.println("After reverse");
        list.forEach(System.out::println);
        
        Collections.sort(list);
        System.out.println("After sort");
        list.forEach(System.out::println);
        
        System.out.println("After shuffle");
        Collections.shuffle(list);
        list.forEach(System.out::println);
    }
}
