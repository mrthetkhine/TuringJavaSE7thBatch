/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.chapter19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author macbook
 */
public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Human2> list =new ArrayList<Human2>();
        
        list.add(new Human2("Aung Aung",30));
        list.add(new Human2("Sein Win",20));
        list.add(new Human2("Ha Hla",40));
        
        list.forEach(System.out::println);
        Collections.sort(list);
        
        System.out.println("");
        list.forEach(System.out::println);
    }
}
