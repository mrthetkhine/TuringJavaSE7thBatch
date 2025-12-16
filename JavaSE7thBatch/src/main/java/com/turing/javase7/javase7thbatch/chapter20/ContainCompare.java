/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author macbook
 */
public class ContainCompare {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i);
            
        }
        long start = System.currentTimeMillis();
        System.out.println("InexOf "+list.indexOf(999_999));
        long end = System.currentTimeMillis();
        long time = (end-start);
        System.out.println("Time "+time);
        */
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < 1_000_000; i++) {
            set.add(i);
            
        }
        long start = System.currentTimeMillis();
        System.out.println("InexOf "+set.contains(999_999));
        long end = System.currentTimeMillis();
        long time = (end-start);
        System.out.println("Time "+time);
    }
}
