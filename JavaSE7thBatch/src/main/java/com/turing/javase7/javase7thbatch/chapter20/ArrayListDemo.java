/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter20;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author macbook
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        
        ArrayList<Integer> listTwo = new ArrayList<>();
        listTwo.add(100);
        listTwo.add(200);    
        
        list.addAll(listTwo);
        
        list.forEach(System.out::println);
        //list.clear();
        
        System.out.println("isEmpty "+list.isEmpty());
        
        System.out.println("After clear");
        list.forEach(System.out::println);
        
        System.out.println("Contains 100 "+list.contains(100));
        System.out.println("Contains 101 "+list.contains(101));
        
        System.out.println("");
        System.out.println("CotainsAll listWo "+list.containsAll(listTwo));
        
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.println("Next "+iterator.next());
        }
    }
}
