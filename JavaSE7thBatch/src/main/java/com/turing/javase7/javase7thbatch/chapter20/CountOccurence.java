/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter20;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author macbook
 */
public class CountOccurence {
    public static void main(String[] args) {
        String str = "I go to school with my son, I love him much.He also love me.";
        String words[] = str.split(" ");
        
        HashMap<String,Integer> count = new HashMap<>();
        for(String word : words)
        {
            System.out.println("Word "+word);
            if(count.containsKey(word))
            {
                count.put(word, count.get(word)+1);
            }
            else
            {
                count.put(word, 1);
            }
        }
        for(Map.Entry<String,Integer> item: count.entrySet())
        {
            System.out.println(" "+item.getKey() + "  "+item.getValue());
        }
        System.out.println("Hash "+"hello".hashCode());
    }
}
