/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter20;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbook
 */
public class StringListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Apple");
        list.add("Hello");
        list.add("Orange");
        list.add("Banana");
        list.add("Mango");
        list.add("Hi");
        
        list.add(0, "First");
        list.set(1, "Not Apple");
        list.removeIf(item->item.startsWith("H"));
        //list.remove("Orange");
        //list.remove(2);
        //list.forEach(System.out::println);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Item "+list.get(i));
        }
        String[] arr = new String[list.size()];
        list.toArray(arr);
        for(String item : arr)
        {
            System.out.println("Arr Item "+item);
        }
        
        List listTwo = List.copyOf(list);
        listTwo.forEach(System.out::println);
   
        int index = list.indexOf("Apple");
        System.out.println("Index "+index);
        System.out.println("Index another "+list.indexOf("Another"));
        
        System.out.println("");
        list.replaceAll(item->item.toUpperCase());
        list.forEach(System.out::println);
        
        list.sort(String::compareTo);
        System.out.println("");
        list.forEach(System.out::println);
        
        List<String> list3 = List.of("One","TWo","Three");
        System.out.println("");
        
        list3.forEach(System.out::println);
    }
}
