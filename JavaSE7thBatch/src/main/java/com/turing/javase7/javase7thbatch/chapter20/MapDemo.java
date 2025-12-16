/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter20;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author macbook
 */
public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        
        map.put(1, "Aung Aung");
        map.put(2,"Hla Ha");
        map.put(5,"Khin Khin");
        
        map.put(2,"Sein Win");
        map.put(3,"Sein Hla");
        System.out.println("get 1 "+map.get(1));
        System.out.println("get 3 "+map.get(3));
        System.out.println("get 5 "+map.get(5));
        
        map.remove(3);
        
        Set<Integer> keys = map.keySet();
        keys.forEach(System.out::println);
        
        Collection<String> values = map.values();
        values.forEach(System.out::println);
        
        for(Entry<Integer,String> item: map.entrySet())
        {
            System.out.println("Key "+item.getKey() + " value "+item.getValue());
        }
        System.out.println("Contains "+map.containsKey(2));
    }
}
